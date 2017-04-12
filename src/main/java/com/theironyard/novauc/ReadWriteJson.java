package com.theironyard.novauc;



import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * Created by ANVIL_OCTOPUS on 4/11/17.
 */
public class ReadWriteJson {

    public static Scanner scanner = new Scanner(System.in);
    public static CarTuneUp j = new CarTuneUp();

    public static void main(String[] args) throws Exception {
          while (true){
//        CarTuneUp customer = new CarTuneUp("Jim", "Time", 300, "20868686", "rrrr");

        File file = new File("lubes.json");

        System.out.println("****!!!!RATE YOUR LUBE JOB!!!!****");
        System.out.println("What chop shop did you go to? " + "(give shop name)");
        String name = scanner.nextLine();
        j.setName(name);
        System.out.println("Who was your mechanic? " + "(give mechanic name)");
        String mechanic = scanner.nextLine();
        j.setMechanic(mechanic);
        System.out.println("How much did they gitcha for? " + "(how much did you pay?)");
        String cost = scanner.nextLine();
        j.setCost(cost);
        System.out.println("Who makes the crap you drive you own? " + "(what kind of car do you drive?)");
        String manufacturer = scanner.nextLine();
        j.setManufacturer(manufacturer);
        System.out.println("Whats the number to this shit show? " + "(phone number)");
        String phoneNumber = scanner.nextLine();
        j.setPhoneNumber(phoneNumber);


        //write json
        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.serialize(j);
        FileWriter fw = new FileWriter(file);
        fw.write(json);
        fw.close();

        //read json
        Scanner scanner = new Scanner(file);
        scanner.useDelimiter("\\Z");
        String contents = scanner.next();

        JsonParser parser = new JsonParser();
        CarTuneUp j2 = parser.parse(contents, CarTuneUp.class);

        System.out.println(j2);

        System.out.println("name: " + j2.getName());
        System.out.println("mechanic: " + j2.getMechanic());
        System.out.println("cost: " + j2.getCost());
        System.out.println("manufacturer: " + j2.getManufacturer());
        System.out.println("phonenumber: " + j2.getPhoneNumber());
        System.out.println("");

        chooseUpate();

    }}
    public static void chooseUpate() throws Exception {
        CarTuneUp j = new CarTuneUp ();
        System.out.println("Are the things you said really real?\nOr do you need a minute?");
        String update = scanner.nextLine();
        if  (update.equalsIgnoreCase("n")) {

            System.out.println("What chop shop did you go to? " + "(give shop name)");
            String name = scanner.nextLine();
            j.setName(name);
            System.out.println("Who was your mechanic? " + "(give mechanic name)");
            String mechanic = scanner.nextLine();
            j.setMechanic(mechanic);
            System.out.println("How much did they gitcha for? " + "(how much did you pay?)");
            String cost = scanner.nextLine();
            j.setCost(cost);
            System.out.println("Who makes the crap you drive you own? " + "(what kind of car do you drive?)");
            String manufacturer = scanner.nextLine();
            j.setManufacturer(manufacturer);
            System.out.println("Whats the number to this shit show? " + "(phone number)");
            String phoneNumber = scanner.nextLine();
            j.setPhoneNumber(phoneNumber);


            //write json
            JsonSerializer serializer = new JsonSerializer();
            String json = serializer.serialize(j);
            FileWriter fw = new FileWriter(json);
            fw.write(json);
            fw.close();

            //read json
            Scanner scanner = new Scanner(json);
            scanner.useDelimiter("\\Z");
            String contents = scanner.next();

            JsonParser parser = new JsonParser();
            CarTuneUp j2 = parser.parse(contents, CarTuneUp.class);

            System.out.println(j2);

            System.out.println("name: " + j2.getName());
            System.out.println("mechanic: " + j2.getMechanic());
            System.out.println("cost: " + j2.getCost());
            System.out.println("manufacturer: " + j2.getManufacturer());
            System.out.println("phonenumber: " + j2.getPhoneNumber());
            System.out.println("");




    }   System.out.println("Have a lovely day");
        System.exit(0);
        }


     }

