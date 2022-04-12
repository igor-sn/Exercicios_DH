package br.com.meli.movies.repository;

import br.com.meli.movies.model.Season;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieRepository extends JpaRepository<Season, Integer> {
}
