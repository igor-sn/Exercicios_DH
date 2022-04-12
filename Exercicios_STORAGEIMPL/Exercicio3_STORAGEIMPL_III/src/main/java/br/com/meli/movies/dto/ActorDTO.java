package br.com.meli.movies.dto;
import br.com.meli.movies.model.Movie;

import java.time.LocalDateTime;

public class ActorDTO {
    private Integer id;
    private String first_name;
    private String last_name;
    private Double rating;
    private LocalDateTime created_at;
    private LocalDateTime update_at;
    private Movie favoriteMovie;
}
