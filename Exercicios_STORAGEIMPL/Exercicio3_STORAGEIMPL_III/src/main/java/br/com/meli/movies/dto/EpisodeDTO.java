package br.com.meli.movies.dto;
import br.com.meli.movies.model.Actor;
import br.com.meli.movies.model.Season;

import java.time.LocalDateTime;
import java.util.Set;

public class EpisodeDTO {
    private Integer id;
    private String title;
    private Double rating;
    private Integer number;
    private LocalDateTime release_date;
    private LocalDateTime created_at;
    private LocalDateTime update_at;
    private Set<Actor> actors;
    private Season season;
}
