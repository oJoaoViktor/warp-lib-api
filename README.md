# 🛰 WarpLib

WarpLib é uma aplicação para gerenciamento de uma biblioteca virtual que utiliza tecnologias modernas para facilitar a administração e o acesso a mídias físicas e digitais, como livros, CDs, DVDs, jogos e mais.  

## Funcionalidades  

- Cadastro, consulta, atualização e exclusão de itens do acervo.  
- Diferenciação de atributos entre tipos de mídias, como duração em CDs/DVDs ou categoria de jogos.  
- Integração de APIs RESTful para facilitar o consumo de dados e a automação de processos no front-end.  
- Implementação de boas práticas de POO e estruturação de código com base em frameworks robustos, como Spring Boot.  


## Funcionalidades Futuras

- Implementação de autenticação (usuários e administradores).
- Gerenciamento de empréstimos e devoluções de itens do acervo.
- Geração de relatórios detalhados para análise de dados do acervo.
- Suporte para upload e armazenamento de mídias digitais.

## Objetivos  

O projeto está sendo desenvolvido com foco na modularidade e reusabilidade, permitindo fácil expansão para suportar novos tipos de mídias ou funcionalidades adicionais.  


## Como executar o projeto

### Pré-requisitos
- Java 17 ou superior instalado.
- Maven 3.6 ou superior instalado.
- Servidor MySQL 8.x instalado e configurado.

### Passos

1. Clone o repositório:
    ```base
    git clone https://github.com/oJoaoViktor/warp-lib-api.git
    ```

2. Configure o banco de dados no arquivo `application.properties` localizado em `src/main/resources`:
    ```bash
    Você já deve ter criado a tabela warp_lib no seu MySQL

    spring.datasource.url=jdbc:mysql://localhost:3306/warp_lib
    spring.datasource.username=root
    spring.datasource.password=root
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
    ```

3. Execute o comando Maven para compilar e iniciar o projeto:
    ```bash
    mvn spring-boot:run
    ```
4. Acesse a aplicação pelo navegador no endereço:
    ```bash
    http://localhost:8080
    ```