# WarpLib 🛰️
![Static Badge](https://img.shields.io/badge/%F0%9F%93%A6Version-1.0-brightgreen)
![Static Badge](https://img.shields.io/badge/%F0%9F%93%88_Status-In_Development-yellow)
![Last Update](https://img.shields.io/badge/Readme-04/12/2024-brightgreen)


WarpLib é uma aplicação para gerenciamento de uma biblioteca virtual que utiliza tecnologias modernas para facilitar a administração e o acesso a mídias físicas e digitais, como livros, CDs, DVDs, jogos e mais.  


## 📖 Tabela de conteúdos
1. [Funcionalidades](#️-funcionalidades)
2. [Funcionalidades futuras](#-funcionalidades-futuras)
3. [Objetivos](#-objetivos)
4. [Como executar o projeto](#-como-executar-o-projeto)
    - [Pré-requisitos](#-pré-requisitos)
    - [Passos](#-passos)
5. Licença

## 🛠️ Funcionalidades
- Cadastro, consulta, atualização e exclusão de itens do acervo.  
- Diferenciação de atributos entre tipos de mídias, como duração em CDs/DVDs ou categoria de jogos.  
- Integração de APIs RESTful para facilitar o consumo de dados e a automação de processos no front-end.  
- Implementação de boas práticas de POO e estruturação de código com base em frameworks robustos, como Spring Boot.  


## 🚀 Funcionalidades Futuras
- Implementação de autenticação (usuários e administradores).
- Gerenciamento de empréstimos e devoluções de itens do acervo.
- Geração de relatórios detalhados para análise de dados do acervo.
- Suporte para upload e armazenamento de mídias digitais.

## 🎯 Objetivos  

O projeto está sendo desenvolvido com foco na modularidade e reusabilidade, permitindo fácil expansão para suportar novos tipos de mídias ou funcionalidades adicionais.  


## ⚙️ Como executar o projeto
### 🧾 Pré-requisitos
- Java 17 ou superior instalado.
- Maven 3.6 ou superior instalado.
- Servidor MySQL 8.x instalado e configurado.

### 📋 Passos

1. Clone o repositório:
    ```base
    git clone https://github.com/oJoaoViktor/warp-lib-api.git
    ```

2. Crie o arquivo `.env` na raíz do projeto com as seguintes configurações:
    > ⚠️ **Observação:** Você deve criar um database para utilizar o banco de dados neste projeto
    ```
    DB_URL=jdbc:mysql://localhost:3306/<nome_do_banco_de_dados>
    DB_USERNAME=<usuario>
    DB_PASSWORD=<senha>

    ```
3. Execute o comando Maven para compilar e iniciar o projeto:
    ```bash
    mvn spring-boot:run
    ```
    > ❗ **Aviso:** Ao executar o comando acima, o projeto pode apresentar erros na execução dos testes, mas as dependências serão instaladas corretamente.
    >
    >Caso ocorra algum erro relacionado à instalação das dependências, execute o seguinte comando para forçar a instalação:
    >```
    >mvn dependency:purge-local-repository
    >```

4. Acesse a aplicação pelo navegador no endereço:  
    `http://localhost:8080/api/books`  
    Se tudo ocorreu bem o servidor irá retornar o seguinte JSON:
    ```json
    {
        "objects":[]
    }
    ```