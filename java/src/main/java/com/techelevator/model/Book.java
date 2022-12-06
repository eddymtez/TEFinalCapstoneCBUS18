package com.techelevator.model;

import java.time.LocalDate;
import java.util.List;

public class Book {

    private long isbn;
    private String title;
    private String author;
    private LocalDate publicationDate;
    private String language;
    private List<String> genres;
    private List<String> tags;
    private int pages;
    private String publisher;
    private String overview;
    private String coverLink;

    public Book () {}

    public Book(long isbn, String title, String author, LocalDate publicationDate, String language,
                List<String> genres, List<String> tags, int pages, String publisher, String overview,
                String coverLink) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
        this.language = language;
        this.genres = genres;
        this.tags = tags;
        this.pages = pages;
        this.publisher = publisher;
        this.overview = overview;
        this.coverLink = coverLink;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getCoverLink() {
        return coverLink;
    }

    public void setCoverLink(String coverLink) {
        this.coverLink = coverLink;
    }
}
