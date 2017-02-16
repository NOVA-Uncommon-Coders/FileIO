package com.theironyard.novauc;

import java.io.IOException;

public class Menu {

    /************************
     * Menu methods
     ***********************/

    public void mainMenu() throws IOException{
        read();
        while(true){
            System.out.println("Welcome to Player Maker!");
            System.out.println("Please make a selection:\n");
            System.out.println("[Add][Update][Read][write][Display Objects][Exit]");
            switch(PlayerMaker.scanner.nextLine().toUpperCase()){
                case "ADD":
                    addCheck();
                    break;
                case "UPDATE":
                    updateCheck();
                    break;
                case "READ":
                    read();
                    break;
                case "WRITE":
                    write();
                    break;
                case "DISPLAY OBJECTS":
                case "DISPLAYOBJECTS":
                    displayObjects();
                    break;
                case "EXIT":
                    System.exit(0);
                default:
                    System.out.println("\nPlease make a valid choice");
            }
        }
    }

    /************************
     * Update methods
     ***********************/

    public void updateCheck(){
        String updateChoice;
        while(true){
            System.out.println("Who's object do you want to update? RETURN to go back. ");
            PlayerMaker.files.displayToons();
            System.out.println("\n Your choice: ");
            updateChoice = PlayerMaker.scanner.nextLine();

            if(updateChoice.equals("RETURN")){
                return;
            } else if(PlayerMaker.files.contains(updateChoice)){
                update(updateChoice);
                return;
            } else {
                System.out.println("Please enter a correct file or return to quit.");
            }
        }
    }
    public void update(String updateChoice){
        while(true){
            System.out.println("What would you like to update?");
            System.out.println("[Age][Gold][Name][Home Town][Character Class][return]");
            switch(PlayerMaker.scanner.nextLine().toUpperCase()){
                case "AGE":
                    PlayerMaker.files.updateAge(updateChoice);
                    break;
                case "GOLD":
                    PlayerMaker.files.updateGold(updateChoice);
                    break;
                case "NAME":
                    PlayerMaker.files.updateName(updateChoice);
                    break;
                case "HOME TOWN":
                case "HOMETOWN":
                    PlayerMaker.files.updateHomeTown(updateChoice);
                    break;
                case "CHARACTER CLASS":
                case "CHARACTERCLASS":
                    PlayerMaker.files.updateCharClass(updateChoice);
                    break;
                case "RETURN":
                    return;
                default:
                    System.out.println("Please enter a valid choice!");
                    break;
            }
        }
    }

    /************************
     * Add methods
     ***********************/

    public void addCheck(){
        String addType;
        while(true) {
            System.out.println("What type of character do you want to add?");
            System.out.println("[Dark Elf][Dwarf][Half Elf][Return]");
            addType = PlayerMaker.scanner.nextLine().toUpperCase();
            switch(addType){
                case "DARK ELF":
                case "DARKELF":
                case "DWARF":
                case "HALF ELF":
                case "HALFELF":
                    add(addType);
                    return;
                case "RETURN":
                     return;
                default:
                    System.out.println("Please enter a valid choice!");
            }
        }
    }
    public void add(String type){
        System.out.printf("What would you like to name your %s?", type);
        String name = PlayerMaker.scanner.nextLine();
        PlayerMaker.files.addkey(name, type);
    }

    /************************
     * Read and Write methods
     ***********************/

    public void read() throws IOException{
        System.out.println("Now reading your JSON file. . .");
        PlayerMaker.files.readFile();
    }
    public void write() throws IOException{
        System.out.println("Now writing your objects to a JSON file. . .");
        PlayerMaker.files.writeFile();
    }

    /************************
     * Display method
     ***********************/

    public void displayObjects(){
        System.out.println("This will display all of your current Characters Objects");
        PlayerMaker.files.displayObjects();
    }
}
