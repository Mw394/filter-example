package org.rescource.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateMovieDTO {

    private String title;
    private String director;
    private int releaseYear;


    public CreateMovieDTO(@JsonProperty("title") String title, @JsonProperty("director") String director, @JsonProperty("releaseYear") int releaseYear) {
        this.setTitle(title);
        this.setDirector(director);
        this.setReleaseYear(releaseYear);
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

}
