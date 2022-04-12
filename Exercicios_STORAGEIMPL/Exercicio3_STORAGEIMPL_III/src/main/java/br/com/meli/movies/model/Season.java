package br.com.meli.movies.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Season {
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private Integer id;
    private String title;
    private Integer number;
    private LocalDateTime release_date;
    private LocalDateTime created_at;
    private LocalDateTime update_at;
    private LocalDateTime end_date;

    @ManyToOne
    private Serie serie;

    @OneToMany(mappedBy = "season", cascade = CascadeType.ALL)
    private List<Episode> episodes = new ArrayList<Episode>();
}
