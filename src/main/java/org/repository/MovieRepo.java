package org.repository;

import org.domain.Movie;
import org.interceptor.Cached;

import javax.enterprise.context.Dependent;
import java.util.*;

@Dependent
@Cached
public class MovieRepo {

    private final Map<String, Movie> map;

    public MovieRepo() {
        this.map = new HashMap<>();
    }

    public Movie createMovie(String title, String director, int releaseYear) {
        String id = UUID.randomUUID().toString();
        map.put(id, new Movie(title,director,releaseYear, id));
        return map.get(id);
    }

    //@Cached(timeout = 2)
    public List<Movie> getMovies() {
        return new ArrayList<>(map.values());
    }

    //@Cached(timeout = 2)
    public Movie getMovie(String id) {
        return map.get(id);
    }

}
