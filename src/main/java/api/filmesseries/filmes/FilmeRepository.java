package api.filmesseries.filmes;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import reactor.core.publisher.Mono;

@Repository
public interface FilmeRepository extends ReactiveMongoRepository<Filme, String> {

    Mono<Filme> findById(String id);

    Mono<Void> deleteById(String id);

}