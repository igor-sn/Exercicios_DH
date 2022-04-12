package br.com.meli.movies.dto;

import br.com.meli.movies.model.Actor;
import br.com.meli.movies.model.Genre;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

public class MovieDTO {
    private Integer id;
    private String title;
    private Double rating;
    private Integer awards;
    private Integer lenght;
    private LocalDateTime release_date;
    private LocalDateTime created_at;
    private LocalDateTime update_at;
    private Genre genre;
    private List<Actor> actors;
}
