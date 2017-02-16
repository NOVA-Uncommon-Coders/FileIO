package com.theironyard.novauc;

public class Characters {

    /********************
     * Variables
     *******************/

    private int age;
    private int gold;
    private String name;
    private String homeTown;
    private String charClass;
    private String race;

    /********************
     * Constructors
     *******************/

    public Characters(){
        this.age = 0;
        this.gold = 0;
        this.homeTown = "default";
        this.charClass = "Warrior";
        this.name = "default";
    }
    public Characters(String name){
        this.age = 0;
        this.gold = 0;
        this.homeTown = "Freeport";
        this.charClass = "Warrior";
        this.name = name;
    }

    /********************
     * Setters
     *******************/

    public void setAge(int age){
        this.age = age;
    }
    public void setGold(int gold){
        this.gold = gold;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setHomeTown(String homeTown){
        this.homeTown = homeTown;
    }
    public void setCharClass(String charClass){
        this.charClass = charClass;
    }
    public void setRace(String race){
        this.race = race;
    }

    /********************
     * Getters
     *******************/

    public String getName(){
        return this.name;
    }
    public String getHomeTown(){
        return this.homeTown;
    }
    public String getCharClass(){
        return this.charClass;
    }
    public int getAge(){
        return this.age;
    }
    public int getGold(){
        return this.gold;
    }
    public String getRace(){
        return race;
    }

    /**********************************************************
     * Override on toString as proof of concept
     * for correct JSON class separation when reading from file
     * Comment out this override to see correct class assignment
     **********************************************************/

    @Override
    public String toString(){
        return race;
    }
}
