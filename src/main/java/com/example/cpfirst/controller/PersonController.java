package com.example.cpfirst.controller;


import com.example.cpfirst.PersonService;
import com.example.cpfirst.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService services;


    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE) //Melhor forma de fazer pq é um Alias, isso faz com que ele retorne o Status correto ao inves de so 200 OK
    public List<Person> findAll(){
        return services.findAll();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findById(@PathVariable("id") Long id){
        return services.findById(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)//Swagger to not getting lost
    public Person create(@RequestBody Person person){ // to get data from body
        return services.create(person);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Person update(@RequestBody Person person){
        return services.update(person);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id){

        services.delete(id);
        return ResponseEntity.noContent().build();
    }
}
