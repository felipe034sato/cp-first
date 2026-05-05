👤 Person API

API REST desenvolvida com Spring Boot para gerenciamento de pessoas.

🚀 Tecnologias
Java 17+
Spring Boot
Spring Data JPA
MySQL
HeidiSQL
⚙️ Como rodar o projeto
1. Criar o banco de dados

Abra o MySQL (HeidiSQL ou outro) e execute:

CREATE DATABASE cpfirst;
2. Configuração do banco

A aplicação está configurada para conectar automaticamente ao MySQL:

Banco: cpfirst
Usuário: root
Senha: Lipe@123
Porta: 3306
URL: jdbc:mysql://localhost:3306/cpfirst?useTimezone=true&serverTimezone=UTC
3. Rodar a aplicação

Via terminal:

mvn spring-boot:run

Ou execute pela sua IDE.

4. Acessar a API
http://localhost:8081/person
📌 Endpoints
GET - Listar todos
GET /person
GET - Buscar por ID
GET /person/{id}
POST - Criar
POST /person

Exemplo:

{
  "firstName": "Felipe",
  "lastName": "Gasparetto",
  "address": "São Paulo",
  "gender": "Male"
}
PUT - Atualizar
PUT /person
DELETE - Remover
DELETE /person/{id}

📌 Observações
Certifique-se de que o MySQL está rodando
A aplicação roda na porta 8081
O banco deve ser criado manualmente
As tabelas são criadas automaticamente pelo Hibernate
