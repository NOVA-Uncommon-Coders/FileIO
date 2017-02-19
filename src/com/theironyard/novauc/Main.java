package com.theironyard.novauc;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static Scanner scannerInt = new Scanner(System.in);


    public static void main(String[] args) {

        //Prompt the user to answer at least five different questions about a good or service.
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

        Survey survey1 = new Survey();

        survey1.setBrand(brand);
        survey1.setModel(model);
        survey1.setYear(year);
        survey1.setColor(color);
        survey1.setExperience(experience);

    }

}

