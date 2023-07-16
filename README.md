
# Filme Séries Rest API

Projeto API back-end utilizando o Spring Boot e Web Flux. O Spring WebFlux é um projeto que permite criar aplicações reativas. 
Isso significa que a requisição do cliente não fica bloqueada enquanto os processos internos são executados pelo aplicativo no sistema operacional.
Este projeto de API Rest tem objetivo de apoiar o projeto educacional filmes e séries, sendo o seu back-end.

### Stack utilizada

**Back-end:** JDK 17, Spring Boot 2.7.13, MongoDB Reactive, Webflux

## Documentação da API

#### Retorna todos os filmes

```http
  GET /filmes
```

#### Retorna apenas um filme

```http
  GET /filmes/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do filme |

#### Adicionar filme

```http
  POST /filmes
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `titulo`         | `string`  | **Obrigatório**. Título do filme |
| `assistido`      | `boolean` | **Obrigatório**. Marcar como um filme assistido |
| `sinopse`        | `string`  | **Obrigatório**. Sinópse do filme |
| `genero`         | `Object`  | **Obrigatório**. Gênero do filme |
| `classificacao`  | `number`  | **Obrigatório**. Classificação do filme |
| `pais`           | `Object`  | **Obrigatório**. Pais do filme |
| `ano`            | `string`  | **Obrigatório**. Ano de lançamento do filme |
| `imagemUrl`      | `string`  | **Obrigatório**. URL da imagem do filme |
| `createdAt`      | `Date`    | **Obrigatório**. Data do cadastro do filme |
| `updatedAt`      | `Date`    | **Obrigatório**. Data da última atualização do filme |


#### Alterar um filme

```http
  PUT /filmes/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `titulo`         | `string`  | **Obrigatório**. Título do filme |
| `assistido`      | `boolean` | **Obrigatório**. Marcar como um filme assistido |
| `sinopse`        | `string`  | **Obrigatório**. Sinópse do filme |
| `genero`         | `Object`  | **Obrigatório**. Gênero do filme |
| `classificacao`  | `number`  | **Obrigatório**. Classificação do filme |
| `pais`           | `Object`  | **Obrigatório**. Pais do filme |
| `ano`            | `string`  | **Obrigatório**. Ano de lançamento do filme |
| `imagemUrl`      | `string`  | **Obrigatório**. URL da imagem do filme |
| `createdAt`      | `Date`    | **Obrigatório**. Data do cadastro do filme |
| `updatedAt`      | `Date`    | **Obrigatório**. Data da última atualização do filme |

#### Deletar um filme

```http
  DELETE /filmes/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`        | `string`   | **Obrigatório**. O ID do filme |
