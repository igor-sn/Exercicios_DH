package br.com.meli.movies.service;

import br.com.meli.movies.model.Genre;
import br.com.meli.movies.model.Movie;
import br.com.meli.movies.repository.ActorRepository;
import br.com.meli.movies.repository.GenreRepository;
import br.com.meli.movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    @Autowired
    GenreRepository genreRepository;

    @Autowired
    ActorRepository actorRepository;


    public Movie saveMovie(Movie movie){

        Genre testGenre = new Genre();

        if(genreRepository.findByName(movie.getGenre().getName()) == null ){
            testGenre = genreRepository.save(movie.getGenre());
        }
        else{
            testGenre = genreRepository.findByName(movie.getGenre().getName());
        }

        return movieRepository.save(
                new Movie(movie.getId(), movie.getTitle(),movie.getRating(),movie.getAwards(), movie.getLenght(),
                        movie.getRelease_date(), movie.getCreated_at(), movie.getUpdate_at(),
                        testGenre, actorRepository.saveAll(movie.getActors())));
    }


}
