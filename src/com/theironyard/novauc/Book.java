package com.theironyard.novauc;

/**
 * Created by Eric on 2/15/17.
 */

public class Book {

    String Title;
    String Author;
    String DatePublished;
    String Genre;
    boolean Accessible;

            public Book(String title, String author, String datePublished, String genre, boolean accessible) {
                Title = title;
                Author = author;
                DatePublished = datePublished;
                Genre = genre;
                Accessible = accessible;

            }
//no arg constructror allows to create a book object without any default values
            public Book(){


            }

    public String toString(){
        String book = "Title : " + getTitle() + ", "
                + "Author: " + getAuthor() + ", "
                + "DatePublished: " + getDatePublished() + ", "
                + "Genre: " + getGenre() + ", "
                + "Accessible?: " + isAccessible();
        return book;
    }

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

    public String getDatePublished() {
        return DatePublished;
    }

    public void setDatePublished(String datePublished) {
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