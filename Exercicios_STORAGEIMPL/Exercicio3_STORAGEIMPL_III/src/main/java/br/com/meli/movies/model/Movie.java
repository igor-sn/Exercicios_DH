package br.com.meli.movies.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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
    private LocalDateTime release_date;
    private LocalDateTime created_at;
    private LocalDateTime update_at;

    @ManyToOne
    private Genre genre;

    @OneToMany(mappedBy = "favoriteMovie", cascade = CascadeType.ALL)
    private List<Actor> actorsLiked;

    @ManyToMany
    @JoinTable(name = "actor_movie",
            joinColumns = {@JoinColumn(name = "movie_id")},
            inverseJoinColumns = {@JoinColumn(name = "actor_id")})
    private List<Actor> actors;



}
