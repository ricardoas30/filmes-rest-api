package api.filmesseries.genero;

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
public class GeneroRestController {

    public final GeneroRepository repository;

    public GeneroRestController(final GeneroRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/genero")
    public Flux<Genero> listaGenero() {
        return repository.findAll(Sort.by("id", "ASC"));
    }

    @PostMapping("/genero")
    public Mono<Genero> criar(@RequestBody Genero genero) {
        return repository.save(genero);
    }

    @DeleteMapping("/genero/{id}")
    public Mono<Void> deletar(@PathVariable String id) {
        return repository.deleteById(id);
    }
}
