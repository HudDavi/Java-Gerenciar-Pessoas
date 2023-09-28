# API de Gerenciamento de Pessoas

Esta é uma aplicação Spring Boot que oferece uma API para o gerenciamento de pessoas.

## Requisitos

Certifique-se de que você tenha as seguintes ferramentas e configurações:

- JDK 20 ou superior instalado.
- Maven configurado e instalado.
- Banco de dados configurado e acessível. Neste projeto, o banco de dados H2 é usado por padrão.

## Configuração

1. Clone este repositório.

2. Abra o arquivo `src/main/resources/application.properties` e configure as propriedades de banco de dados conforme necessário.

## Como Usar

1. Execute a aplicação usando o Maven:

   ```
   mvn spring-boot:run
   ```

2. Acesse a API em `http://localhost:8080/openapi` ou `http://127.0.0.1:8080/openapi` para visualizar a documentação Swagger.

3. Você pode usar qualquer cliente HTTP ou ferramenta como o [Postman](https://www.postman.com/) para fazer solicitações à API.

## Licença

Este projeto está licenciado sob os termos da [Licença MIT](LICENSE).