package br.com.meli.movies.repository;

import br.com.meli.movies.model.Season;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SerieRepository extends JpaRepository<Season, Integer> {
}
