# Person API

API REST desenvolvida com Spring Boot para gerenciamento de pessoas.

---

## 🚀 Tecnologias

* Java 17+
* Spring Boot
* Spring Data JPA
* MySQL
* Docker

---

## ⚙️ Como rodar o projeto

### 1. Subir o banco de dados com Docker

Na raiz do projeto, execute:

```bash
docker-compose up -d
```

---

### 2. Configuração do banco

A aplicação está configurada para conectar automaticamente ao MySQL:

```
Banco: cpfirst
Usuário: root
Senha: root
Porta: 3306
```

---

### 3. Rodar a aplicação

Via terminal:

```bash
mvn spring-boot:run
```

Ou execute pela sua IDE (IntelliJ, Eclipse).

---

### 4. Acessar a API

```
http://localhost:8080/person
```

---

## 📌 Endpoints

### GET - Listar todos

```
GET /person
```

### GET - Buscar por ID

```
GET /person/{id}
```

### POST - Criar

```
POST /person
```

Exemplo:

```json
{
  "firstName": "Felipe",
  "lastName": "Gasparetto",
  "address": "São Paulo",
  "gender": "Male"
}
```

### PUT - Atualizar

```
PUT /person
```

### DELETE - Remover

```
DELETE /person/{id}
```

---

## 🐳 Docker (Banco de Dados)

Arquivo `docker-compose.yml`:

```yaml
version: '3.8'

services:
  mysql:
    image: mysql:8.0
    container_name: mysql_cpfirst
    restart: always
    environment:
      MYSQL_ROOT_PASSWORD: root
      MYSQL_DATABASE: cpfirst
    ports:
      - "3306:3306"
    volumes:
      - mysql_data:/var/lib/mysql

volumes:
  mysql_data:
```

---

## 📌 Observações

* Certifique-se de que a porta 3306 está livre
* O banco é criado automaticamente
* As tabelas são geradas automaticamente pelo Hibernate
