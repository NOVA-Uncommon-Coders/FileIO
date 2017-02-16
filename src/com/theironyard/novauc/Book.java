package com.theironyard.novauc;

/**
 * Created by Eric on 2/15/17.
 */

public class Book {

    String Title;
    String Author;
    int DatePublished;
    String Genre;
    boolean Accessible;


    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getDatePublished() {
        return DatePublished;
    }

    public void setDatePublished(int datePublished) {
        DatePublished = datePublished;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public boolean isAccessible() {
        return Accessible;
    }

    public void setAccessible(boolean accessible) {
        Accessible = accessible;
    }
}