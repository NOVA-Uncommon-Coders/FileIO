package com.theironyard.novauc;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/**
 * Created by JacobP on 2/16/17.
 */
public class ReadWriteJson {
    public static Scanner scanner = new Scanner(System.in);
    public static Scanner scannerInt = new Scanner(System.in);



    public static void main(String[] args) throws IOException {

        Cars c = new Cars();

        System.out.println("What is the make of your car: ");
        c.setMake(scanner.nextLine());

        System.out.println("What is the model of your car: ");
        c.setModel(scanner.nextLine());

        System.out.println("What is the color of your car: ");
        c.setColor(scanner.nextLine());

        System.out.println("What is the style of your car: ");
        c.setStyle(scanner.nextLine());

        System.out.println("What is the year of your car: ");
        c.setYear(scannerInt.nextInt());


        File f = new File("car.json");

// write json
        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.serialize(c);
        FileWriter fw = new FileWriter(f);
        fw.write(json);
        fw.close();

        // read json
        Scanner s = new Scanner(f);
        s.useDelimiter("\\Z");
        String contents = s.next();
        JsonParser parser = new JsonParser();
        Cars c2 = parser.parse(contents, Cars.class);
        
        System.out.println(c2);

        //update json
        System.out.println("Do you want to update? ");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("No")) {
            System.out.println("Your file will be saved with no updates");
        } else if (answer.equalsIgnoreCase("Yes")) {
            try {
                System.out.println("What would you like to update");

                System.out.println("What is the make of your car: ");
                c.setMake(scanner.nextLine());

                System.out.println("What is the model of your car: ");
                c.setModel(scanner.nextLine());

                System.out.println("What is the color of your car: ");
                c.setColor(scanner.nextLine());

                System.out.println("What is the style of your car: ");
                c.setStyle(scanner.nextLine());

                System.out.println("What is the year of your car: ");
                c.setYear(scannerInt.nextInt());


                String json1 = serializer.serialize(c);
                FileWriter fw1 = new FileWriter(f);
                fw1.write(json1);
                fw1.close();
            } catch (IOException e) {

            }
        }
            System.out.println("You have successfully updated your file");
        }

    }










