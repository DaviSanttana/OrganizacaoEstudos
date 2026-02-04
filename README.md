# Organiza-oEstudos
API REST para organização de cronograma de estudos semanal, desenvolvida com Java e Spring Boot
# 📚 Organizador de Estudos Semanal

Este projeto é uma API REST desenvolvida para ajudar na organização e gestão de rotinas de estudo semanais. Com ele, é possível cadastrar matérias, horários e descrições, mantendo um controle claro do que precisa ser estudado em cada dia da semana.

## 🚀 Tecnologias Utilizadas

O projeto foi construído utilizando as seguintes tecnologias:

* **Java 17**: Linguagem principal.
* **Spring Boot 3**: Framework para agilizar o desenvolvimento.
* **Spring Data JPA**: Para persistência de dados e abstração de consultas.
* **H2 Database**: Banco de dados em memória para facilitar o ambiente de desenvolvimento.
* **Lombok**: Para redução de código boilerplate (Getters/Setters).
* **Maven**: Gerenciador de dependências.

## 🛠️ Como Rodar o Projeto

Para executar o projeto localmente, siga os passos abaixo:

1.  Certifique-se de ter o **JDK 17** instalado.
2.  Clone o repositório:
    ```bash
    git clone [https://github.com/SEU-USUARIO/NOME-DO-REPOSITORIO.git](https://github.com/SEU-USUARIO/NOME-DO-REPOSITORIO.git)
    ```
3.  Abra o projeto na sua IDE de preferência (IntelliJ, VS Code, etc).
4.  Aguarde o Maven baixar as dependências.
5.  Execute a classe principal: `OrganizacaoEstudosApplication.java`.
6.  A API estará disponível em: `http://localhost:8080`.

## 📍 Endpoints Principais

* `GET /tarefas`: Lista todos os estudos cadastrados.
* `POST /tarefas`: Cadastra uma nova tarefa de estudo.

## 📝 Próximos Passos
- [ ] Criação de interface Frontend (HTML/JS).
- [ ] Implementação de sistema de "Check" (concluído).
- [ ] Filtros por dia da semana.
