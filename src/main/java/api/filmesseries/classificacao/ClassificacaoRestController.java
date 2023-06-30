package api.filmesseries.classificacao;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ClassificacaoRestController {

    private final ClassificacaoRepository repository;

    public ClassificacaoRestController(final ClassificacaoRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/classificacao")
    public Flux<Classificacao> listaClassificacao() {
        return repository.findAll();
    }

    @PostMapping("/classificacao")
    public Mono<Classificacao> criar(@RequestBody Classificacao classificacao) {
        return repository.save(classificacao);
    }

    @DeleteMapping("/classificacao/{id}")
    public Mono<Void> deletar(@PathVariable Number id) {
        return repository.deleteById(id);
    }

}
