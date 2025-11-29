# MealPlan API

### Nome do Projeto: Healfy - Assistente de Bem-Estar, Nutrição e Rotina Saudável

  Essa aplicação foi desenvolvida para o projeto Healty , uma extensão do aplicativo de saúde digital CarePlus, buscando auxiliar pessoas que possuem uma vida corrida, que se julgam sem tempo para cuidar de sua saúde, a melhorar sua alimentação, de forma prática e rápida. Com a geração de planos alimentares específicos para cada usuário.

  A MealPlan API foi desenvolvida usando a ferramenta Spring Boot, com persistência de dados Spring Data JPA, migrações automáticas utilizando Flyway e banco de dados H2. Essa API tem como objetivo gerenciar planos de refeições, permitindo a criação, consulta, atualização e exclusão de registros.

###Funcionalidades da API

A MealPlan permite realizar operações CRUD:

* Criar um plano de refeição
* Listar todos os planos por ID
* Atualizar um plano existente
* Excluir um plano por ID

Todas as operações retornam códigos HTTP adequados e mensagens de erro tratadas no controller.

### URLS

--> Acessar API no navegador
http://localhost:8085/mealplans
--> Acessar banco de dados

http://localhost:8085/h2-console

* Configurações:
  jdbc:h2:file:~/testdb
  User: sa
  password:password

### Estrutura do corpo de publicações no Postman

{
  "userName": "Isabelle",
  "goal": "EMAGRECIMENTO",
  "calories": 1800
}

### Integrantes

Beatriz Rocha RM: 552806
Isabelle Torricelli RM: 552806
Luís Alberto RM 553507
Rafael Nascimento RM:553117
