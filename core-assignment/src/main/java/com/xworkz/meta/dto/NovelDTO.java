package com.xworkz.meta.dto;

public class NovelDTO {

    private int novelId;
    private String title;
    private String author;
    private String genre;
    private int pages;
    private double price;
    private String language;
    private String publisher;

    public NovelDTO() {}

    public NovelDTO(int novelId, String title, String author, String genre,
                    int pages, double price, String language, String publisher) {
        this.novelId = novelId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.pages = pages;
        this.price = price;
        this.language = language;
        this.publisher = publisher;
    }

    public int getNovelId() { return novelId; }
    public void setNovelId(int novelId) { this.novelId = novelId; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public int getPages() { return pages; }
    public void setPages(int pages) { this.pages = pages; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }

    public String getPublisher() { return publisher; }
    public void setPublisher(String publisher) { this.publisher = publisher; }

    @Override
    public String toString() {
        return "NovelDTO{" +
                "novelId=" + novelId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", pages=" + pages +
                ", price=" + price +
                ", language='" + language + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
