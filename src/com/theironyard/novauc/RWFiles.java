package com.theironyard.novauc;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by dangelojoyce on 2/15/17.
 */


public class RWFiles {

    public static Scanner scannerln = new Scanner(System.in);

    public static String input = scannerln.nextLine();


    public static void main(String[] args) throws IOException {


            File f = new File("comedy.txt");

            FileWriter fw = new FileWriter(f);

            fw.write("Funny guy");
            fw.append("confused\n");
            fw.append("still confused\n");
            fw.append("How confused am I?\n");
            fw.append("Still pretty damn confused\n");
            fw.append("I really hope this is right\n");
            fw.close();

            Scanner scanner = new Scanner(f);
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }

            scanner = new Scanner(f);
            scanner.useDelimiter("\\Z");
            String contents = scanner.next();
            System.out.println(contents);


//        while (0==0){
//            System.out.println("What would you like to know about the Comedian class?\n"
//                    + input.equalsIgnoreCase;


        }
    }








