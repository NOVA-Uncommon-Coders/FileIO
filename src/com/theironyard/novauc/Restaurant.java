package com.theironyard.novauc;

import com.sun.tools.javac.code.Symbol;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static com.theironyard.novauc.Main.scanner;

/**
 * Created by jerieshasmith on 2/15/17.
 */
public class Restaurant {
     String name;
     String food;
    String location;
     String occasion;
    String setting;

   public void answerQuestions()

    {
        System.out.println("What is the name of the Restaurant?");
        scanner.nextLine();
        System.out.println("What type of food?");
         scanner.nextLine();
        System.out.println("What is the location?");
        scanner.nextLine();
        System.out.println("What is the occasion?");
        scanner.nextLine();
        System.out.println("Choice of setting?");
        scanner.nextLine();


    }
         public Restaurant(){

    }

    public Restaurant(String name, String food, String location, String occasion, String setting){
             this.name = name;
             this.food = food;
             this.location = location;
             this.occasion = occasion;
             this.setting = setting;
    }

    public Restaurant(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOccasion() {
        return occasion;
    }

    public void setOccasion(String occasion) {
        this.occasion = occasion;
    }

    public String getSetting() {
        return setting;
    }

    public void setSetting(String setting) {
        this.setting = setting;
    }
}
