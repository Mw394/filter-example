package org.rescource.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.domain.Movie;

public class MovieDTO {

    private String title;
    private String director;
    private int releaseYear;
    private String id;


    public MovieDTO(Movie movie) {
        this.setTitle(movie.getTitle());
        this.setDirector(movie.getDirector());
        this.setReleaseYear(movie.getReleaseYear());
        this.setId(movie.getId());
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
