### Renata Hassum - [Linkedin](https://www.linkedin.com/in/renataviottohassumdev) | renatahassum@gmail.com

# Sobre o projeto Na Consulta [![NPM](https://img.shields.io/npm/l/react)](https://github.com/RenataHassum/naconsulta_backend/blob/main/LICENSE) 

Apresento o projeto colaborativo "Na Consulta", desenvolvido em parceria com <a href="https://github.com/Achette">Igor Achette</a> (frontend React) e Renata (backend com Spring Boot).

Nosso projeto oferece um sistema abrangente de agendamento de consultas médicas, com recursos de gerenciamento, autenticação e controle de acesso personalizado, com base nos perfis dos usuários cadastrados.

Com um CRUD completo, os usuários podem gerenciar suas informações pessoais e histórico de consultas, além de realizar pesquisas por endereço ou especialidade, para facilitar a busca por serviços médicos específicos. Os médicos, que também podem ser usuários, têm acesso a recursos específicos da área médica, melhorando ainda mais o gerenciamento de suas atividades.

# Teste as requisições no Postman Collection
#### Projeto disponível na plataforma de hospedagem Railway - Requisições automáticas prontas para uso, sem necessidade de clonar o projeto
#### Siga o passo a passo:
1) Clique no botão "Run in Postman"
2) Acesse a opção "View collection"
3) Teste as requisições conforme orientações abaixo
   
      ##  [![Run in Postman](https://run.pstmn.io/button.svg)](https://god.gw.postman.com/run-collection/22138191-bdd0a30f-07aa-4ad2-ac7e-c8ddb959129a?action=collection%2Ffork&source=rip_markdown&collection-url=entityId%3D22138191-bdd0a30f-07aa-4ad2-ac7e-c8ddb959129a%26entityType%3Dcollection%26workspaceId%3D596ec030-8ad4-4f4b-8b72-0282dd45d2c6#?env%5BnaConsulta%5D=W3sia2V5IjoiaG9zdCIsInZhbHVlIjoiaHR0cDovL2xvY2FsaG9zdDo4MDgwIiwiZW5hYmxlZCI6dHJ1ZSwidHlwZSI6ImRlZmF1bHQiLCJzZXNzaW9uVmFsdWUiOiJodHRwczovL25hY29uc3VsdGEtcmVuYXRhaGFzc3VtLnVwLnJhaWx3YXkuYXBwIiwic2Vzc2lvbkluZGV4IjowfSx7ImtleSI6ImNsaWVudC1pZCIsInZhbHVlIjoibXljbGllbnRpZCIsImVuYWJsZWQiOnRydWUsInR5cGUiOiJkZWZhdWx0Iiwic2Vzc2lvblZhbHVlIjoibXljbGllbnRpZCIsInNlc3Npb25JbmRleCI6MX0seyJrZXkiOiJjbGllbnQtc2VjcmV0IiwidmFsdWUiOiJteWNsaWVudHNlY3JldCIsImVuYWJsZWQiOnRydWUsInR5cGUiOiJkZWZhdWx0Iiwic2Vzc2lvblZhbHVlIjoibXljbGllbnRzZWNyZXQiLCJzZXNzaW9uSW5kZXgiOjJ9LHsia2V5IjoidXNlcm5hbWUiLCJ2YWx1ZSI6ImFsZXhAZ21haWwuY29tIiwiZW5hYmxlZCI6dHJ1ZSwidHlwZSI6ImRlZmF1bHQiLCJzZXNzaW9uVmFsdWUiOiJhbGV4QGdtYWlsLmNvbSIsInNlc3Npb25JbmRleCI6M30seyJrZXkiOiJwYXNzd29yZCIsInZhbHVlIjoiMTIzNDU2IiwiZW5hYmxlZCI6dHJ1ZSwidHlwZSI6ImRlZmF1bHQiLCJzZXNzaW9uVmFsdWUiOiIxMjM0NTYiLCJzZXNzaW9uSW5kZXgiOjR9LHsia2V5IjoidG9rZW4iLCJ2YWx1ZSI6IiIsImVuYWJsZWQiOnRydWUsInR5cGUiOiJkZWZhdWx0Iiwic2Vzc2lvblZhbHVlIjoiIiwic2Vzc2lvbkluZGV4Ijo1fSx7ImtleSI6InJlZnJlc2hfdG9rZW4iLCJ2YWx1ZSI6IiIsImVuYWJsZWQiOnRydWUsInR5cGUiOiJkZWZhdWx0Iiwic2Vzc2lvblZhbHVlIjoiIiwic2Vzc2lvbkluZGV4Ijo2fV0=)

## Login endpoints
#### Escolha o ambiente do projeto: "naConsulta" (lembre-se de substituir os emails para login)

`POST` Permite efetuar o login de um usuário. Utilize as seguintes credenciais para teste:
- alex@gmail.com
  - Funções: "ROLE_ADMIN", "ROLE_DOCTOR", "ROLE_USER"
  - Acesso: Liberado

- ana@gmail.com
  - Funções: "ROLE_DOCTOR", "ROLE_USER"
  - Acesso: Intermediário

- emma@gmail.com
  - Funções: "ROLE_USER"
  - Acesso: Restrito

## User endpoints
`GET User by ID / DELETE Delete User`
- Liberado para o próprio usuário com "ROLE_USER" e para "ROLE_ADMIN" e "ROLE_DOCTOR" com acesso adicional
- Retorna informações de um usuário específico
- Permite excluir um usuário

`GET Logged-in User / PUT Update User`
- Liberado para o usuário logado com "ROLE_USER"
- Permite visualizar informações pessoais e consultas do usuário logado
- Permite atualizar informações do próprio usuário logado

`GET List Users`
- Restrito a "ROLE_USER"
- Liberado para "ROLE_ADMIN" e "ROLE_DOCTOR"
- Retorna uma lista de usuários

`POST Create User`
- Liberado para todos os usuários, incluindo não autenticados
- Permite criar um novo usuário

## Appointment endpoints
`GET Appointment for current user / POST Create Appointment / DELETE Delete Appointment`
- Liberado para o próprio usuário (usando seu próprio ID) com função "ROLE_USER"
- Permite visualizar informações pessoais e consultas do usuário logado, sem informar o id
- Permite criar uma nova consulta
- Permite excluir consultas do próprio usuário

`GET Appointment by ID`
- Liberado para o próprio usuário (usando seu próprio ID) com "ROLE_USER" e para "ROLE_ADMIN" e "ROLE_DOCTOR" com acesso adicional
- Retorna informações de uma consulta específica

`GET Appointment Report`
- Restrito a usuários com função "ROLE_USER"
- Liberado para usuários com as funções "ROLE_ADMIN" e "ROLE_DOCTOR"
- Permite retornar uma lista de consultas que atendem aos critérios informados:
  - Data inicial (opcional): Se não informada, será considerada a data de um ano antes da data final
  - Data final (opcional): Se não informada, será considerada a data atual do sistema
  - Trecho do nome do médico (opcional): Se não informado, será considerado o texto vazio

`PUT Update Appointment`
- Liberado para o médico responsável pela consulta com função "ROLE_DOCTOR"
- Permite atualizar informações da consulta

## Doctor / Specialization / Address endpoints
`GET List / by ID`
- Liberado para usuários com função "ROLE_USER"
- Permitem recuperar informações sobre médicos, especializações e endereços

# Tecnologias | Implantação em produção
- Java, Spring Boot, Spring Cloud, Spring Security, Validation, OAuth2, JWT, API REST, JPA, Hibernate, Maven, H2 Database, PostgreSQL, ORM, Git
- Implantação backend: Railway
- Implantação banco de dados: Postgresql

# Técnicas | Competências
- Programação Orientada a Objetos (POO) e Seed de Banco de Dados: Permite o desenvolvimento eficiente de um sistema orientado a objetos e a criação de um modelo conceitual representando entidades e relacionamentos.
- Arquitetura em Camadas: Utiliza uma estrutura organizada em camadas, proporcionando separação clara de responsabilidades e facilitando a manutenibilidade do sistema.
- Web Services RESTful: Implementa web services RESTful, seguindo o padrão DTO para transferência de dados.
- Operações CRUD completas: Realiza as operações completas de Criar, Ler, Atualizar, Excluir e Procurar.
- Tratamento de Exceções: Implementa mecanismos de tratamento de exceções, garantindo mensagens de erro claras para os usuários.
- Auditoria: Registra dados relevantes para oferecer recursos de auditoria das operações realizadas nos recursos, utilizando anotações como @PrePersist | @PreUpdate.
- Validação de Dados: Realiza validação de dados utilizando o Bean Validation para garantir conformidade com os requisitos especificados.
- Autenticação e Autorização: Implementa OAuth2 e JWT para autenticação e autorização segura dos usuários.
- Refresh Token e Password Token: Utiliza tokens para garantir a autenticação contínua e segura dos usuários, permitindo a renovação do acesso e a redefinição da senha de forma segura.
- Autorizações Personalizadas: Realiza pré-autorização de métodos sensíveis, restringindo o acesso apenas a usuários autorizados.
- Consultas ao Banco de Dados com JPQL: Realiza consultas ao banco de dados utilizando a linguagem de consulta JPQL.

## Figma Frontend
https://www.figma.com/file/9GWmVsPO2I2K4oLK6GnO6t/NaConsulta?type=design&node-id=0-1&t=Hhfamj8gAYVR4Mle-0

## Modelo conceitual
![Modelo Conceitual](https://github.com/RenataHassum/assets/blob/main/naconsulta_assets/modelo%20conceitual.jpg?raw=true)

## Padrão camadas
![Padrão camadas](https://github.com/RenataHassum/assets/blob/main/padrao_camadas.jpg?raw=true)

# Agradecimentos
<a href="https://devsuperior.com.br/cursos"><img align="center" height="16" alt="DevSuperior" src="https://devsuperior.com.br/_next/static/images/logo-white-10059e26f600604a7b5bd7782ed7550c.svg"></a> - Professor Nélio Alves e meu grande amigo <a href="https://github.com/Achette">Igor Achette</a>.

# Autora
### Renata Hassum - [Linkedin](https://www.linkedin.com/in/renataviottohassumdev) | renatahassum@gmail.com
Fico à disposição para qualquer esclarecimento, não hesite em me contatar
