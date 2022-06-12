package org.domain;

public class Movie {


    private String title;
    private String director;
    private int releaseYear;
    private String id;


    public Movie(String title, String director, int releaseYear, String id) {
        this.setTitle(title);
        this.setDirector(director);
        this.setReleaseYear(releaseYear);
        this.id = id;
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
}
