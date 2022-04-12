package br.com.meli.movies.dto;

import br.com.meli.movies.model.Genre;
import br.com.meli.movies.model.Season;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SerieDTO {
    private Integer id;
    private String title;
    private LocalDateTime release_date;
    private LocalDateTime end_date;
    private LocalDateTime created_at;
    private LocalDateTime update_at;
    private Genre genre;
    private List<Season> seasons = new ArrayList<Season>();
}
