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
public class Episode {
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private Integer id;
    private String title;
    private Double rating;
    private Integer number;
    private LocalDateTime release_date;
    private LocalDateTime created_at;
    private LocalDateTime update_at;

    @ManyToOne
    @JoinColumn(name = "season_id", referencedColumnName = "id")
    private Season season;

    @ManyToMany
    @JoinTable(name = "actor_episode",
            joinColumns = {@JoinColumn(name = "episode_id")},
            inverseJoinColumns = {@JoinColumn(name = "actor_id")})
    private Set<Actor> actors;
}
