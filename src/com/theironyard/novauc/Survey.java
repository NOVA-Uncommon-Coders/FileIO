package com.theironyard.novauc;


import java.util.Scanner;

/**
 * Created by octavio on 2/16/17.
 */
public class Survey {

    String brand;
    String model;
    int year;
    String color;
    int experience;



    public String getBrand() {return brand;}

    public void setBrand(String brand) {this.brand = brand;}

    public String getModel() {return model;}

    public void setModel(String model) {this.model = model;}

    public int getYear() {return year;}

    public void setYear(int year) {this.year = year;}

    public String getColor() {return color;}

    public void setColor(String color) {this.color = color;}

    public int getExperience() {return experience;}

    public void setExperience(int experience) {this.experience = experience;}


    @Override //turn from memory to print like that...because its working in a survey object
    public String toString() {
        return this.brand + " " + model + " " + year + " " + color + " " + experience;
    }

//    public Scanner getUserInput() {return userInput;}
//
//    public void setUserInput(Scanner userInput) {this.userInput = userInput;}
}
