package org.rescource.dto;

public class MovieDTO {

    private String title;
    private String director;
    private int releaseYear;


    public MovieDTO(String title, String director, int releaseYear) {
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
