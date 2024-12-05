# ⚙️ Como executar o projeto
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

4. Acesse a aplicação pelo navegador no endereço: `http://localhost:8080/api/books`  
    Se tudo ocorreu bem o servidor irá retornar `status 204 no Content`.  
    
    Pronto, agora você já está habilitado para testar a API localmente.👏