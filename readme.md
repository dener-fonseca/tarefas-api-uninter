# 📌 API de Tarefas – Uninter

Este projeto é uma API RESTful desenvolvida em **Java com Spring Boot** e **MySQL** para gerenciamento de tarefas.  

Este projeto foi realizado como trabalho para a disciplina **Desenvolvimento Web Back-end** da faculdade Uninter.

---

## 🚀 Tecnologias usadas
- Java 17
- Spring Boot (Web, Data JPA)
- MySQL
- Maven
- Postman (para testes)
- Spring Initializr

---

## 📂 Estrutura do Projeto

src/main/java/com/tarefas/tarefas_api ├── ApiDeTarefasApplication.java   # Classe principal ├── model │     └── Tarefa.java              # Entidade ├── repository │     └── TarefaRepository.java    # Interface JPA └── controller └── TarefaController.java    # Endpoints REST

---

## 🛠️ Passos Realizados no Projeto

1. **Criação do Projeto Spring Boot**
   - Configuração do projeto usando Spring Initializr.
   - Adição das dependências: Spring Web, Spring Data JPA e MySQL Driver.

2. **Configuração do Banco de Dados**
   - Criação do banco de dados MySQL `tarefas_db`.
   - Configuração da conexão no `application.properties` com URL, usuário, senha e propriedades do JPA.

3. **Criação da Entidade e Repositório**
   - Criação da entidade `Tarefa` com os atributos: `id`, `nome`, `dataEntrega` e `responsavel`.
   - Criação da interface `TarefaRepository` estendendo `JpaRepository`.

4. **Criação do Controller**
   - Criação do `TarefaController` com endpoints REST:
     - `POST /tarefas` para criar tarefas.
     - `GET /tarefas` para listar todas as tarefas.
     - `GET /tarefas/{id}` para consultar uma tarefa específica.
     - `PUT /tarefas/{id}` para atualizar tarefas.
     - `DELETE /tarefas/{id}` para remover tarefas.

5. **Testes Locais**
   - Execução da aplicação localmente.
   - Teste dos endpoints usando Postman para garantir o funcionamento correto.

---

## 💻 Como Executar

1. Clone o repositório: git clone https://github.com/dener-fonseca/tarefas-api-uninter.git

2. Configure o MySQL e crie o banco `tarefas_db`.

3. Configure as credenciais no `application.properties`.

4. Abra o projeto em IntelliJ IDEA ou Eclipse.

5. Execute a aplicação (`ApiDeTarefasApplication.java`).

6. Acesse os endpoints em `http://localhost:8080/tarefas` usando Postman ou outro cliente REST.

---

## 📝 Licença

Este projeto é apenas para fins acadêmicos e foi desenvolvido para a Uninter.

---

## 👤 Autor do Projeto

**Dener Fonseca**