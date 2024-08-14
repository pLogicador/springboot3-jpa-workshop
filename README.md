# Web services com Spring Boot e JPA / Hibernate


# Sobre o projeto
Este projeto é uma aplicação web desenvolvida com Spring Boot e JPA/Hibernate que visa criar uma API RESTful para gerenciamento de dados de um sistema de pedidos e produtos. 
O objetivo principal é fornecer uma solução que permita a criação, recuperação, atualização e exclusão (CRUD) de usuários, pedidos, produtos e categorias, 
utilizando um banco de dados em memória para testes.

## Pré-requisitos: Java 17, Maven, MongoDB, Postman, H2

## Funcionalidades Principais
* Gerenciamento de Usuários: Criar, atualizar, deletar e consultar usuários.
* Gerenciamento de Pedidos: Criar e consultar pedidos, associando-os a usuários e produtos.
* Gerenciamento de Produtos e Categorias: Adicionar e consultar produtos e categorias, com suporte a associações many-to-many.
* Tratamento de Exceções: Implementação de tratamento de exceções para garantir robustez e segurança na manipulação de dados.
* Banco de Dados em Memória: Utilização do H2 para testes, permitindo a rápida configuração e execução do ambiente de desenvolvimento.

## Estrutura do Projeto
> Camadas Lógicas
* Resource: Controladores REST para expor endpoints.
* Service: Camada de serviço para lógica de negócios.
* Repository: Repositórios JPA para acesso a dados.

> Domain Model
* User: Entidade com atributos básicos e associações.
* Order: Entidade com associações e atributos de data.
* Category: Entidade para categorias de produtos.
* Product: Entidade para produtos.
* OrderItem: Entidade para itens do pedido com associação many-to-many e atributos extras.
* Payment: Entidade com associação one-to-one com Order.

> Configuração do Banco de Dados:
* H2: Banco de dados em memória utilizado para testes e desenvolvimento.
* application.properties:
`````bash
spring.profiles.active=test
spring.jpa.open-in-view=true
``````
`````bash
# DATASOURCE
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=

# H2 CLIENT
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

# JPA, SQL
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.defer-datasource-initialization=true
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
``````
## Manipulação de Dados
Exemplo de JSON para criar um novo usuário:
`````json
{
 "name": "Bob Brown",
 "email": "bob@gmail.com",
 "phone": "977557755",
 "password": "123456"
}
``````
Exemplo de JSON para atualizar um usuário:
`````json
{
 "name": "Bob Brown",
 "email": "bob@gmail.com",
 "phone": "977557755"
}

``````





