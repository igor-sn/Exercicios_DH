package br.com.meli.perolas.repository;

import br.com.meli.perolas.model.Pearl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PearlRepository extends JpaRepository<Pearl, Long> {
}
