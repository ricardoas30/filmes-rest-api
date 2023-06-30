package api.filmesseries.filmes;

import java.util.Date;

public record Filme(String id,
        String titulo,
        boolean assistido,
        String sinopse,
        Object genero,
        Number classificacao,
        Object pais,
        String ano,
        String imagemUrl,
        Date updatedAt,
        Date createdAt) {

    public Filme {
        if (titulo == null || titulo.length() < 5) {
            throw new IllegalArgumentException("O título precisa ser maior que 5 caracteres");
        }
    }

}