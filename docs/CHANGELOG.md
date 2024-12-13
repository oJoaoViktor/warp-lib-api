# Changelog

Todas as mudanças relevantes neste projeto são documentadas aqui. Este projeto segue o padrão [SemVer](https://semver.org/lang/PT-BR/).

## [1.3.0-alpha] - 2024-12-13
### Alterado
  - **Padronização de campos:**
    - Padronização dos campos obrigatórios nos modelos;
    - Mensagens de validação para maior clareza;
    - Atualização da versão no README.

## [1.2.1-alpha] - 2024-12-12
### Alterado
  - **Pasta raíz do projeto:**
    - Pastas internas movidas para fora de WarpLib/.

### Corrigido
  - **Carregamento da .env:**
    - `.env` não era corrigido devido falta de localização da raíz do projeto.


## [1.2.0-alpha] - 2024-12-06
### Adicionado
- **Rotas para a versão 1 da API (v1):**
    - Prefixo `v1/` adicionado aos controladores e endpoints existentes para garantir a compatibilidade com versões anteriores da API caso haja em algum momento.

## [1.1.0-alpha] - 2024-12-05
### Adicionado
- **Carregamento de variáveis do `.env`:**
  - Criada a classe `EnvConfig` no pacote `config`.
  - Ajustada a classe principal para delegar o carregamento ao `EnvConfig`.
  - Declarada a variável `dotenv` como final para garantir imutabilidade.
- **Documentação:**
  - Criada a pasta `docs` para melhorar a organização dos arquivos de instrução.
  - Criado markdown específico sobre como executar o projeto e vinculado ao README.
  - Descrição do projeto no README atualizada.

---

## [1.0.2-alpha] - 2024-12-03
### Alterado
- Adicionados serviços, controladores, repositórios e classes enum específicos para cada subproduto.
- Corrigido bug no método `PUT` que criava novos registros em vez de atualizar.

### Documentação
- **Atualização do README:**
  - Adicionada seção para *features* futuras.
  - Instruções detalhadas sobre como executar o projeto.
  - Guia para configuração do banco de dados.

---

## [1.0.0-alpha] - 2024-12-02
### Adicionado
- **Modelos e enums:**
  - Criado modelo para `Magazine` e `Game`, estendendo `Product` com atributos específicos.
  - Criados enums para categorias e mecânicas de jogos.
  - Modularização dos enums em uma pasta dedicada dentro de `models`.
- **Estrutura de usuários:**
  - Criada a pasta `users` em `models` para modularizar entidades relacionadas a usuários.
  - Implementada a classe `Customer` com atributos específicos de cliente.

### Alterado
- Padronização do uso de `CamelCase` para atributos e métodos.
- Renomeação de variáveis para melhorar a legibilidade.
- Ajuste nas tabelas do banco de dados para adotar a convenção `snake_case`.

### Adicionado
- **Serviços e controladores:**
  - Criação de classes genéricas `GenericProductService` e `GenericProductController`.
  - Implementação de `BookService` e `BookController` para manipulação de livros.
  - Validações de entrada adicionadas para `Book` e `Product`.

---

## [0.1.0-alpha] - 2024-11-28
### Adicionado
- Configuração inicial do projeto com suporte ao banco de dados MySQL.
- Criação da classe abstrata `Product`.
