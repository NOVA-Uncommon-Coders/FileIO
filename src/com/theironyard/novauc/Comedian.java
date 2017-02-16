package com.theironyard.novauc;

import java.util.ArrayList;

/**
 * Created by dangelojoyce on 2/7/17.
 */
public class Comedian {
    int age;
    int height;
    String name;
    String jokes;
    boolean laughs;
    ArrayList<String> options = new ArrayList<>();


    public Comedian() {
    }

    public Comedian(int age, int height, String name, String jokes, boolean laughs) {
        this.age = age;
        this.height = height;
        this.name = name;
        this.jokes = jokes;
        this.laughs = laughs;
    }

    public int getAge() {
        return age;
    }

    public static void chooseOption (String options) throws Exception {
        System.out.println("Here are your " + options + "!  Choose one? [y/n]");

        String answer = CInputProgram.nextLine();

        if (answer.equalsIgnoreCase("y")) {
            options.add(options);
            System.out.println("Choose next option");

        } else if (answer.equalsIgnoreCase ("n")) {
            System.out.println("Have a nice day!");
        } else {throw new Exception("Error: Please make another selection");
        }

    }
    public void chooseName(){
        System.out.println("What is your name?");
        name = CInputProgram.nextLine();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJokes() {
        return jokes;
    }

    public void setJokes(String jokes) {
        this.jokes = jokes;
    }

    public boolean isLaughs() {
        return laughs;
    }

    public void setLaughs (boolean laughs){
        if(this.laughs == true){
            System.out.println("HAHAHAH");
        }
    }


}


