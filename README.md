> # Sistema de Gerenciamento de Eventos - API
> 
> Esta é uma API para gerenciamento de eventos, permitindo a criação, edição, exclusão e consulta de eventos. 
> 
> ## Pré-requisitos
> 
> Antes de iniciar, certifique-se de que o Docker está instalado na sua máquina. Caso não tenha o Docker, você pode instalá-lo seguindo as instruções [aqui](https://docs.docker.com/get-docker/).
> 
> ## Passo a passo para rodar a API
> 
> 1. **Clone o repositório**
> 
>    ```bash
>    git clone https://github.com/seu-usuario/seu-repositorio.git
>    cd seu-repositorio
>    ```
> 
> 2. **Construa a imagem Docker**
> 
>    Execute o comando abaixo para construir a imagem Docker da API:
> 
>    ```bash
>    docker build -t nome-da-imagem .
>    ```
> 
> 3. **Execute o contêiner**
> 
>    Inicie o contêiner Docker com o comando:
> 
>    ```bash
>    docker run -d -p 8000:8000 nome-da-imagem
>    ```
> 
>    Isso fará a API ficar disponível na porta 8000 do seu localhost.
> 
> 4. **Acesse a API**
> 
>    Com a API rodando, você pode acessar a documentação da API em:
> 
>    ```
>    http://localhost:8000/docs
>    ```
> 
>    Use esta interface para explorar os endpoints disponíveis e testar a API.
> 
> ## Configurações adicionais
> 
> - **Variáveis de ambiente:** Se a sua API utilizar variáveis de ambiente, certifique-se de definir estas no arquivo `.env` ou passá-las durante a execução do contêiner.
> - **Persistência de dados:** Para persistir os dados além do ciclo de vida do contêiner, monte um volume Docker ou configure uma base de dados externa.
> 
> ## Comandos úteis
> 
> - **Parar o contêiner:**
> 
>   ```bash
>   docker stop <id-do-container>
>   ```
> 
> - **Ver logs do contêiner:**
> 
>   ```bash
>   docker logs <id-do-container>
>   ```
> 
> - **Remover todos os contêineres parados:**
> 
>   ```bash
>   docker container prune
>   ```
> 
> ## Contribuição
> 
> Sinta-se à vontade para abrir issues e enviar pull requests para melhorias.
> 
> ## Licença
> 
> Este projeto é licenciado sob os termos da licença MIT. Consulte o arquivo `LICENSE` para mais detalhes.
