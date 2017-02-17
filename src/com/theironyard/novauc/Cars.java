package com.theironyard.novauc;

/**
 * Created by JacobP on 2/16/17.
 */
public class Cars {

    String make;
    String model;
    String color;
    String style;
    int year;

    public Cars() {
    }

    public Cars(String make, String model, String color, String style, int year ) { //This is the contructor
        this.make = make;
        this.model = model;
        this.color = color;
        this.style = style;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
