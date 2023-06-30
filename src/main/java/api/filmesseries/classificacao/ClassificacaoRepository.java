package api.filmesseries.classificacao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassificacaoRepository extends ReactiveMongoRepository<Classificacao, Number> {

}
