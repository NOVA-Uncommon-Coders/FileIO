package com.theironyard.novauc;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.Console;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static com.theironyard.novauc.Main.scanner;
import static com.theironyard.novauc.Main.scannerInt;


/**
 * Created by octavio on 2/17/17.
 */


public class ReadWriteJson {

    public static Scanner userInput = new Scanner(System.in);


    public static void main(String[] args) throws IOException {



        Survey z = new Survey();
        z.brand = "Hyundai";
        z.model = "Sonata";
        z.year = 2016;
        z.color = "White";
        z.experience = 10;

        // print object z to console
        System.out.println(z);

        // prompt user for update?

        Scanner scanner = new Scanner (System.in);
        System.out.print("Would you like to update your info? yes/no");
        String message = userInput.next();

        if (message.equals("yes")) {
            System.out.println("Please fill out the new survey");
        }
        else if (message.equals("no")) {
            System.exit(0);
        }


        System.out.println("What was the brand of the vehicle you rented?");
        String brand = scanner.nextLine();

        System.out.println("What was the model of the vehicle you rented?");
        String model = scanner.nextLine();

        System.out.println("What was the year of the vehicle you rented?");
        Integer year = scannerInt.nextInt();

        System.out.println("What was the color of the vehicle you rented?");
        String color = scanner.nextLine();

        System.out.println("How would you rate your experience on a scale from 1 to 10?");
        Integer experience = scannerInt.nextInt();

//        Survey surveyz = new Survey();

        z.setBrand(brand);
        z.setModel(model);
        z.setYear(year);
        z.setColor(color);
        z.setExperience(experience);



        File f = new File("Survey.json");


        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.serialize(z);
        FileWriter fw = new FileWriter(f);
        fw.write(json);
        fw.close();


        Scanner s = new Scanner(f);
        s.useDelimiter("\\Z");
        String contents = s.next();
        JsonParser parser = new JsonParser();
        Survey z2 = parser.parse(contents, Survey.class);


        System.out.println(z2);




    }
}
