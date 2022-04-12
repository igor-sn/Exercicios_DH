package br.com.meli.movies.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Genre {

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private Integer id;
    private String name;
    private Integer ranking;
    private Integer active;

    @OneToMany(mappedBy = "genre", cascade = CascadeType.ALL)
    private List<Movie> movies = new ArrayList<Movie>();

    @OneToMany(mappedBy = "genre", cascade = CascadeType.ALL)
    private List<Serie> series = new ArrayList<Serie>();

}
