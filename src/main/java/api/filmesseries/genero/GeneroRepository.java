package api.filmesseries.genero;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository extends ReactiveMongoRepository<Genero, String> {

}
