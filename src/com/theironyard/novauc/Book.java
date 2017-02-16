package com.theironyard.novauc;

/**
 * Created by peter on 2/15/17.
 */
public class Book {

     String title;
     String genre;
    private String author;
    private int serial;
    private double cost;

    public Book () {}

//    public Book(String me) {}

    Book(String title, String genre, String author, int serial, double cost) {
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.serial = serial;
        this.cost = cost;
    }

    //Getters and Setters

    //Title
    String getTitle() {
        return title;
    }
    void setTitle(String title) {
        this.title = title;
    }

    //Genre
    String getGenre() {
        return genre;
    }
    void setGenre(String genre) {
        this.genre = genre;
    }

    //Author
    String getAuthor() {
        return author;
    }
    void setAuthor(String author) {
        this.author = author;
    }

    //Serial
    int getSerial() {
        return serial;
    }
    void setSerial(int serial) {
        this.serial = serial;
    }

    //Cost
    double getCost() {
        return cost;
    }
    void setCost(double cost) {
        this.cost = cost;
    }

}
