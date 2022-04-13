package br.com.meli.movies.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Movie {

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private Integer id;
    private String title;
    private Double rating;
    private Integer awards;
    private Integer lenght;
    private LocalDate release_date;
    private LocalDate created_at;
    private LocalDate update_at;


    @ManyToOne
    private Genre genre;

    @ManyToMany
    @JoinTable(name = "actor_movie",
            joinColumns = {@JoinColumn(name = "movie_id")},
            inverseJoinColumns = {@JoinColumn(name = "actor_id")})
    private List<Actor> actors;

    @OneToMany(mappedBy = "favoriteMovie", cascade = CascadeType.ALL)
    private List<Actor> actorsLiked;

    public Movie(Integer id, String title, Double rating, Integer awards, Integer lenght, LocalDate release_date, LocalDate created_at, LocalDate update_at, Genre genre, List<Actor> actors) {
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.awards = awards;
        this.lenght = lenght;
        this.release_date = release_date;
        this.created_at = created_at;
        this.update_at = update_at;
        this.genre = genre;
        this.actors = actors;
    }
}
