package com.theironyard.novauc;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by jerieshasmith on 2/15/17.
 */
public class Restaurant {
    public String name;
    public String food;
    public String location;
    public String occasion;
    public String setting;

    public static void main(String[] args) throws IOException {
        File f = new File("restaurant.txt");
        FileWriter fw = new FileWriter(f);
        fw.write("Friday's\n");
        fw.append("Applebees\n");
        fw.append("Famous Daves\n");
        fw.close();

        Scanner scanner = new Scanner(f);
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());



        }
        scanner = new Scanner(f);
        scanner.useDelimiter("\\Z");
        String contents = scanner.next();
        System.out.println(contents);
    }
}