📦 Product API

API REST desenvolvida com Spring Boot para gerenciamento de produtos.

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
http://localhost:8081/product
📌 Endpoints
GET - Listar todos
GET /product
GET - Buscar por ID
GET /product/{id}
POST - Criar
POST /product

Exemplo:

{
  "name": "Notebook",
  "description": "Notebook Gamer",
  "price": 4500.0,
  "quantity": 10,
  "category": "Eletrônicos"
}
PUT - Atualizar
PUT /product
DELETE - Remover
DELETE /product/{id}


📌 Observações
Certifique-se de que o MySQL está rodando
A aplicação roda na porta 8081
O banco deve ser criado manualmente
As tabelas são criadas automaticamente pelo Hibernate
