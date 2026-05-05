package com.example.cpfirst;

import com.example.cpfirst.controller.PersonController;
import com.example.cpfirst.model.Person;
import com.example.cpfirst.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class PersonService {

    @Autowired
    PersonRepository repository;

    private Logger log = LoggerFactory.getLogger(PersonController.class.getName());

    private final AtomicLong counter = new AtomicLong();

    public Person findById(Long id) {
        log.info("Finding one person");

        var entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("not found id"));

        return entity;
    }

    public List<Person> findAll() {
        log.info("Find All People");
        return repository.findAll();
    }

    public Person create(Person person) {
        log.info("Inside create");
        return repository.save(person);
    }

    public Person update(Person person) {
        log.info("Updating person");

        Person entity = repository.findById(person.getId())
                .orElseThrow(() -> new RuntimeException("not found id"));

        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        entity.setAddress(person.getAddress());
        entity.setGender(person.getGender());

        return repository.save(entity);
    }

    public void delete(Long id) {
        log.info("Deleting person");

        Person entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("not found id"));

        repository.delete(entity);
    }
}