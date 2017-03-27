package com.theironyard.novauc;

import java.util.ArrayList;

/**
 * Created by dangelojoyce on 2/7/17.
 */
public class Comedian {
    private String name;
    private int age;
    private int height;
    private String jokes;
    private boolean laughs;
    ArrayList<String> options = new ArrayList<>();
    public Comedian(){
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

    public ArrayList<String> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<String> options) {
        this.options = options;
    }


    public Comedian(String name, int age, int height, String jokes, boolean laughs) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.jokes = jokes;
        this.laughs = laughs;
    }

    public int getAge() {
        return age;
    }


    public void chooseAge() throws Exception {
        System.out.println ("Choose your option [age]");
        age = CInputProgram.intInput.nextInt();

    }

    public void chooseHeight() {
        System.out.println("What's his height?");
        height = CInputProgram.intInput.nextInt();
    }


    public void chooseName(){
        System.out.println("What is the comedian's name?");
       name = CInputProgram.scannerln.nextLine();

    }
    public void chooseJokes() throws Exception {
        System.out.println ("Choose next joke");
        jokes = CInputProgram.scannerln.nextLine();

}
    public void chooseLaughs(){

        while (true){
            System.out.println("Do you laugh? Y or N");
            switch (CInputProgram.scannerln.nextLine()) {
                case "Y":
                    laughs = true;
                    return;
                case "N":
                    laughs = false;
                    System.out.println("You don't have a sense of humor");
                    return;
                default:
                    System.out.println("Choose the correct option");
                    break;
            }
        }
    }

    public void setLaughs (boolean laughs){
        if(this.laughs == true){
            System.out.println("HAHAHAH");
        }
    }


}


