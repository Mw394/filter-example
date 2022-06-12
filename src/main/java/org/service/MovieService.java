package org.service;

import org.domain.Movie;
import org.repository.MovieRepo;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;

@Dependent
public class MovieService {

    private final MovieRepo movieRepo;

    @Inject
    public MovieService(MovieRepo movieRepo) {
        this.movieRepo = movieRepo;
    }

    public List<Movie> getMovies() {
        return movieRepo.getMovies();
    }

    public Movie getMovie(String id) {
        return movieRepo.getMovie(id);
    }

    public Movie createMovie(String title, String director, int releaseYear) {
        return movieRepo.createMovie(title,director,releaseYear);
    }

}
