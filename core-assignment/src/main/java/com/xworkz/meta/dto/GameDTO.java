package com.xworkz.meta.dto;

public class GameDTO {

    private int gameId;
    private String title;
    private String genre;
    private String platform;
    private double price;
    private String developer;
    private String releaseDate;
    private double rating;

    public GameDTO() {}

    public GameDTO(int gameId, String title, String genre, String platform, double price,
                   String developer, String releaseDate, double rating) {
        this.gameId = gameId;
        this.title = title;
        this.genre = genre;
        this.platform = platform;
        this.price = price;
        this.developer = developer;
        this.releaseDate = releaseDate;
        this.rating = rating;
    }
    public int getGameId() { return gameId; }
    public void setGameId(int gameId) { this.gameId = gameId; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public String getPlatform() { return platform; }
    public void setPlatform(String platform) { this.platform = platform; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getDeveloper() { return developer; }
    public void setDeveloper(String developer) { this.developer = developer; }

    public String getReleaseDate() { return releaseDate; }
    public void setReleaseDate(String releaseDate) { this.releaseDate = releaseDate; }

    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating; }

    @Override
    public String toString() {
        return "GameDTO{" +
                "gameId=" + gameId +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", platform='" + platform + '\'' +
                ", price=" + price +
                ", developer='" + developer + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", rating=" + rating +
                '}';
    }
}

