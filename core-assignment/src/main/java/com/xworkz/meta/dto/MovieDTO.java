package com.xworkz.meta.dto;

public class MovieDTO {
    private int movieId;
    private String title;
    private String director;
    private String hero;
    private String heroine;
    private double budget;
    private String releaseDate;
    private double rating;

    public MovieDTO(int movieId,String title,String director,String hero,String heroine,double budget,String releaseDate,double rating){
        this.budget=budget;
        this.movieId=movieId;
        this.director=director;
        this.hero=hero;
        this.heroine=heroine;
        this.title=title;
        this.rating=rating;
        this.releaseDate=releaseDate;
    }

    public int getMovieId() { return movieId; }
    public void setMovieId(int movieId) { this.movieId = movieId; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDirector() { return director; }
    public void setDirector(String director) { this.director = director; }

    public String getHero() { return hero; }
    public void setHero(String hero) { this.hero = hero; }

    public String getHeroine() { return heroine; }
    public void setHeroine(String heroine) { this.heroine = heroine; }

    public double getBudget() { return budget; }
    public void setBudget(double budget) { this.budget = budget; }

    public String getReleaseDate() { return releaseDate; }
    public void setReleaseDate(String releaseDate) { this.releaseDate = releaseDate; }

    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating; }

    @Override
    public String toString() {
        return "MovieDTO{" +
                "movieId=" + movieId +
                ", title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", hero='" + hero + '\'' +
                ", heroine='" + heroine + '\'' +
                ", budget=" + budget +
                ", releaseDate='" + releaseDate + '\'' +
                ", rating=" + rating +
                '}';
    }
}
