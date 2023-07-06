# define a imagem base
FROM openjdk:17-jdk

# Adicionando o projeto no container
ADD target/*.jar filmes-series-0.0.1-SNAPSHOT.jar

# Expoe a porta 8080
EXPOSE 8080

# Comando para iniciar o projeto Java no Container
ENTRYPOINT ["java", "-jar", "filmes-series-0.0.1-SNAPSHOT.jar"]


# Atualiza a imagem com os pacotes
# RUN apt-get update && apt-get upgrade -y

# Rodar o docker <mongo-local> na porta 27017
# CMD ["docker run --name mongo-local -p 27017:27017"]

## Executando o deploy do projeto no docker
## https://www.youtube.com/watch?v=0JUInh-tJ6A
# docker build -t filmes-series-api .
