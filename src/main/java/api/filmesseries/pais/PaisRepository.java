package api.filmesseries.pais;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaisRepository extends ReactiveMongoRepository<Pais, String> {

}
