# ClientManager API

> REST API para gerenciamento de clientes construída com Spring Boot.  
> REST API for client management built with Spring Boot.

---

## 🇧🇷 Português

### Sobre o projeto

O ClientManager é uma API REST desenvolvida como evolução do meu projeto anterior em Java puro com JDBC. O objetivo foi aprender na prática as principais ferramentas do ecossistema Spring — Spring Web, Spring Data JPA e Spring Boot — construindo um CRUD completo com boas práticas de desenvolvimento.

### Tecnologias

- Java 21
- Spring Boot 3.4
- Spring Web (REST)
- Spring Data JPA + Hibernate
- Spring Validation
- PostgreSQL
- Maven

### Arquitetura

O projeto segue arquitetura em camadas:

```
controller/   → recebe as requisições HTTP
service/      → lógica de negócio
repository/   → acesso ao banco via Spring Data JPA
model/        → entidade JPA (Client)
dto/          → objetos de entrada e saída da API
exception/    → exceções customizadas e handler global
```

### Endpoints

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/clients` | Lista todos os clientes |
| GET | `/clients/{id}` | Busca cliente por ID |
| POST | `/clients` | Cadastra novo cliente |
| PUT | `/clients/{id}` | Atualiza cliente existente |
| DELETE | `/clients/{id}` | Remove cliente |

### Como rodar localmente

**Pré-requisitos:** Java 21, PostgreSQL, Maven

1. Clone o repositório
```bash
git clone https://github.com/JoaoPaulo2205/clientmanager.git
cd clientmanager
```

2. Crie o banco de dados no PostgreSQL
```sql
CREATE DATABASE clientmanager;
```

3. Configure as variáveis de ambiente
```bash
export DB_USER=seu_usuario
export DB_PASSWORD=sua_senha
```

4. Rode a aplicação
```bash
./mvnw spring-boot:run
```

A API estará disponível em `http://localhost:8080`.

### Exemplo de requisição

```bash
# Criar cliente
curl -X POST http://localhost:8080/clients \
  -H "Content-Type: application/json" \
  -d '{"name":"João Silva","cpf":"12345678900","email":"joao@email.com","phone":"11999999999"}'

# Listar clientes
curl http://localhost:8080/clients
```

---

## 🇺🇸 English

### About

ClientManager is a REST API developed as an evolution of my previous project built with pure Java and JDBC. The goal was to learn the main tools of the Spring ecosystem in practice — Spring Web, Spring Data JPA, and Spring Boot — by building a complete CRUD with development best practices.

### Tech Stack

- Java 21
- Spring Boot 3.4
- Spring Web (REST)
- Spring Data JPA + Hibernate
- Spring Validation
- PostgreSQL
- Maven

### Architecture

The project follows a layered architecture:

```
controller/   → handles HTTP requests
service/      → business logic
repository/   → database access via Spring Data JPA
model/        → JPA entity (Client)
dto/          → API input and output objects
exception/    → custom exceptions and global handler
```

### Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/clients` | List all clients |
| GET | `/clients/{id}` | Get client by ID |
| POST | `/clients` | Create new client |
| PUT | `/clients/{id}` | Update existing client |
| DELETE | `/clients/{id}` | Delete client |

### Running locally

**Requirements:** Java 21, PostgreSQL, Maven

1. Clone the repository
```bash
git clone https://github.com/JoaoPaulo2205/clientmanager.git
cd clientmanager
```

2. Create the database in PostgreSQL
```sql
CREATE DATABASE clientmanager;
```

3. Set environment variables
```bash
export DB_USER=your_user
export DB_PASSWORD=your_password
```

4. Run the application
```bash
./mvnw spring-boot:run
```

The API will be available at `http://localhost:8080`.

### Request example

```bash
# Create client
curl -X POST http://localhost:8080/clients \
  -H "Content-Type: application/json" \
  -d '{"name":"John Doe","cpf":"12345678900","email":"john@email.com","phone":"11999999999"}'

# List clients
curl http://localhost:8080/clients
```

---

## Author

**João Paulo** — [GitHub](https://github.com/JoaoPaulo2205) · [LinkedIn](https://linkedin.com/in/seu-perfil)
