package com.theironyard.novauc;

/**
 * Created by peter on 2/15/17.
 */
public class Book {

    private String title;
    private String genre;
    private String author;
    private int serial;
    private double cost;

    public Book () {}

    //Title
    public String getTitle() {
        return title;
    }
    void setTitle(String title) {
        this.title = title;
    }

    //Genre
    public String getGenre() {
        return genre;
    }
    void setGenre(String genre) {
        this.genre = genre;
    }

    //Author
    public String getAuthor() {
        return author;
    }
    void setAuthor(String author) {
        this.author = author;
    }

    //Serial
    public int getSerial() {
        return serial;
    }
    void setSerial(int serial) {
        this.serial = serial;
    }

    //Cost
    public double getCost() {
        return cost;
    }
    void setCost(double cost) {
        this.cost = cost;
    }

}
