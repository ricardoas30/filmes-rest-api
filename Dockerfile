FROM openjdk:17-jdk
ADD target/*.jar filmes-series-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "filmes-series-0.0.1-SNAPSHOT.jar"]

## Executando o deploy para o docker
## https://www.youtube.com/watch?v=0JUInh-tJ6A
#docker build -t filmes-series-api .