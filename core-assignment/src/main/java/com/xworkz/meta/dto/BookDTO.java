package com.xworkz.meta.dto;

public class BookDTO {
    private String isbn;
    private String title;
    private String author;
    private String publication;
    private int pages;
    private double price;
    private String genre;
    private String language;

    public BookDTO(String isbn, String title, String author, String publication,
                   int pages, double price, String genre, String language) {
        this.isbn = isbn;
        this.title=title;
        this.author = author;
        this.publication =publication;
        this.pages = pages;
        this.price = price;
        this.genre= genre;
        this.language = language;
    }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getPublication() { return publication; }
    public void setPublication(String publication) { this.publication = publication; }

    public int getPages() { return pages; }
    public void setPages(int pages) { this.pages = pages; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }

    @Override
    public String toString() {
        return "BookDTO{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publication='" + publication + '\'' +
                ", pages=" + pages +
                ", price=" + price +
                ", genre='" + genre + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}

