package com.theironyard.novauc;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static Scanner scanner = new Scanner(System.in);
	public static Restaurant restaurant = new Restaurant();



	public static void main(String[] args) throws Exception, FileNotFoundException {




        try {
            restaurant = readFromFile();
            System.out.println("Save restaurant information.");
            System.out.println(restaurant);
            System.out.println("Would you like to update this restaurant information? [y/n]");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("y")) {



//                restaurant.setFood("");
//                restaurant.setLocation("");
//                restaurant.setSetting("");
//                restaurant.setName("");
//                restaurant.setOccasion("");
                System.out.println("What is the name of the Restaurant? " );
                restaurant.setName(scanner.nextLine());
                System.out.println("What type of food?");
                restaurant.setFood(scanner.nextLine());
                System.out.println("What is the location?" );
                restaurant.setLocation(scanner.nextLine());
                System.out.println("What is the occasion?" ) ;
                restaurant.setOccasion(scanner.nextLine());
                System.out.println("Choice of setting?" );
                restaurant.setName(scanner.nextLine());

               writeToFile();



            }
        }   catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }


            public static void writeToFile () throws IOException {
                File f = new File("restaurant.json");

                JsonSerializer serializer = new JsonSerializer();
                String jsonformattedRestaurant = serializer.serialize(restaurant);
                FileWriter fw = new FileWriter(f);
                fw.write(jsonformattedRestaurant);
                fw.close();

              //  System.out.println(restaurant);

            }

            public static Restaurant readFromFile () throws FileNotFoundException {

                File file = new File("restaurant.json");

                Scanner s = new Scanner(file);
                s.useDelimiter("\\Z");
                String contents = s.next();
                System.out.println(contents);
                JsonParser parser = new JsonParser();
                Restaurant restaurant = parser.parse(contents, Restaurant.class);
                return restaurant;
            }

}


