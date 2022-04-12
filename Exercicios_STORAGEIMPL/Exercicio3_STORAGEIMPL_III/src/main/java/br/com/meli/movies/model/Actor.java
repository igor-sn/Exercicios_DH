package br.com.meli.movies.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Actor {
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private Integer id;
    private String first_name;
    private String last_name;
    private Double rating;
    private LocalDateTime created_at;
    private LocalDateTime update_at;

    @ManyToOne
    @JoinColumn(name = "favorite_movie_id", referencedColumnName = "id")
    private Movie favoriteMovie;

    @ManyToMany(mappedBy = "actors")
    private Set<Episode> episodes;

    @ManyToMany(mappedBy = "actors")
    private Set<Movie> movies;

}
