package br.com.meli.movies.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Serie {
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private Integer id;
    private String title;
    private LocalDateTime release_date;
    private LocalDateTime end_date;
    private LocalDateTime created_at;
    private LocalDateTime update_at;

    @ManyToOne
    private Genre genre;
    @OneToMany(mappedBy = "serie", cascade = CascadeType.ALL)
    private List<Season> seasons = new ArrayList<Season>();


}
