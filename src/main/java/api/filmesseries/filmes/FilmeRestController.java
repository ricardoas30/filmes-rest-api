package api.filmesseries.filmes;

import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class FilmeRestController {

    private final FilmeRepository repository;

    public FilmeRestController(final FilmeRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/filmes")
    public Flux<Filme> lerFilmes() {
        return repository.findAll(Sort.by("assistido", "DESC"));
    }

    @GetMapping("/filmes/{id}")
    public Mono<Filme> lerById(@PathVariable String id) {
        return repository.findById(id);
    }

    @PostMapping("/filmes")
    public Mono<Filme> criar(@RequestBody Filme filme) {
        return repository.save(filme);
    }

    @DeleteMapping("/filmes/{id}")
    public Mono<Void> deletar(@PathVariable String id) {
        return repository.deleteById(id);
    }

    @PutMapping("/filmes/{id}")
    public Mono<Filme> atualizar(@PathVariable String id) {

        return repository
                .findById(id)
                .map(filmeAtual -> new Filme(id,
                        filmeAtual.titulo(),
                        !filmeAtual.assistido(),
                        filmeAtual.sinopse(),
                        filmeAtual.genero(),
                        filmeAtual.classificacao(),
                        filmeAtual.pais(),
                        filmeAtual.ano(),
                        filmeAtual.imagemUrl(),
                        filmeAtual.createdAt(),
                        filmeAtual.updatedAt()))
                .flatMap(repository::save)
                .onTerminateDetach();
    }
}