# Gerenciamento de Instituição de Ensino
(Sem intenção de funcionarm 100% neste momento)
Este é um projeto simples para gerenciar uma instituição de ensino, desenvolvido como exercício introdutório ao uso do Spring Boot. O objetivo é praticar conceitos básicos de desenvolvimento de APIs RESTful, modelagem de dados e aplicação de serviços com encapsulamento e boas práticas de programação.

---

## Funcionalidades

### Cadastro de Alunos
- Endpoint: `POST /aluno/cadastrar`
   - Permite cadastrar um aluno informando nome e data de nascimento.

### Consulta de Alunos
- Endpoint: `GET /aluno/listar`
   - Retorna a lista de todos os alunos cadastrados.

### Cadastro de Cursos
- Endpoint: `POST /curso/cadastrar`
   - Permite cadastrar um curso informando nome, descrição e carga horária.

### Consulta de Cursos
- Endpoint: `GET /curso/listar`
   - Retorna a lista de todos os cursos cadastrados.

### Matrícula de Alunos
- Endpoint: `POST /curso/{idCurso}/matricular`
   - Permite matricular um aluno em um curso através do ID do curso e do ID do aluno.

---

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal.
- **Spring Boot**: Framework para criação de APIs RESTful.
- **Lombok**: Para reduzir boilerplate no código (ex.: getters, setters e construtores).
- **Maven**: Gerenciador de dependências.
- **REST**: Arquitetura para comunicação entre cliente e servidor.

---

## Estrutura do Projeto

```plaintext
src/
├── main/
│   ├── java/
│   │   └── com/miguelfazio/gerenciamento_de_instituicao_de_ensino/
│   │       ├── controller/
│   │       │   ├── ControllerAluno.java    # Endpoints relacionados aos alunos
│   │       │   └── ControllerCurso.java    # Endpoints relacionados aos cursos
│   │       ├── model/
│   │       │   ├── Aluno.java              # Representação do aluno
│   │       │   └── Curso.java              # Representação do curso
│   │       ├── service/
│   │       │   ├── ServiceAluno.java       # Regras de negócio dos alunos
│   │       │   └── ServiceCurso.java       # Regras de negócio dos cursos
│   │       └── GerenciamentoDeInstituicaoDeEnsinoApplication.java
│   └── resources/
│       ├── application.properties          # Configurações do projeto
```
## Como Executar o Projeto

### Pré-requisitos

- JDK 11 ou superior
- Maven ou Gradle (opcional)

### Passos

1. Clone o repositório.
   ```bash
   git clone https://github.com/seu-usuario/gerenciamento-de-instituicao-de-ensino.git
   ```
2. Navegue até o diretório do projeto.
   ```bash
   cd gerenciamento-de-instituicao-de-ensino
   ```
3. Compile e execute o projeto com o Maven ou Gradle:
   ```bash
   mvn spring-boot:run
   ```
   Ou, se estiver usando o Gradle
   ```bash
   ./gradlew bootRun
   ```
   
4. A aplicação estará rodando em http://localhost:8080.
