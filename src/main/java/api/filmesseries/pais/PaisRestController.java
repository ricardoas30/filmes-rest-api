package api.filmesseries.pais;

import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class PaisRestController {

    public final PaisRepository repository;

    public PaisRestController(final PaisRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/pais")
    public Flux<Pais> listaPais() {
        return repository.findAll(Sort.by("id", "ASC"));
    }

    @PostMapping("/pais")
    public Mono<Pais> criar(@RequestBody Pais pais) {
        return repository.save(pais);
    }

    @DeleteMapping("/pais/{id}")
    public Mono<Void> deletar(@PathVariable String id) {
        return repository.deleteById(id);
    }
}
