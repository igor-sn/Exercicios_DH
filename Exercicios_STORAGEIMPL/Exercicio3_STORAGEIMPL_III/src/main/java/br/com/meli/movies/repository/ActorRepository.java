package br.com.meli.movies.repository;

import br.com.meli.movies.model.Actor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends JpaRepository <Actor, Integer> {

}
