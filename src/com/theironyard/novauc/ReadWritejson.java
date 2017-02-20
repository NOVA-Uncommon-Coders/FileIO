package com.theironyard.novauc;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 * Created by Merlin on 2/16/17.
 */
public class ReadWritejson {
    public static Scanner scanner = new Scanner(System.in);
    public static Customer c = new Customer();
    public static void main(String[] args) throws Exception {
//        Customer c = new Customer();
        System.out.println("Welcome to the Jacket Outlet");
        System.out.println("What size jacket would you like? (small, medium, large)");
        String size = scanner.nextLine();
        c.setSize(size);
        System.out.println("What exterior would you like for your jacket? (leather, cloth)");
        String exterior = scanner.nextLine();
        c.setExterior(exterior);
        System.out.println("What fastener would you like for your jacket? (zipper, button)");
        String fastener = scanner.nextLine();
        c.setFastener(fastener);
        System.out.println("What color would you like for your jacket? (black, brown)");
        String color = scanner.nextLine();
        c.setColor(color);
        System.out.println("What length would you like for your jacket? (short, long)");
        String length = scanner.nextLine();
        c.setLength(length);
        //This below writes the file
        File f = new File("customer.json");
        JsonSerializer serializer = new JsonSerializer();
        String jsonformattedCustomer = serializer.serialize(c);
        FileWriter fw = new FileWriter(f);
        fw.write(jsonformattedCustomer);
        fw.close();
        //This below reads the file
        Scanner s = new Scanner(f);
        s.useDelimiter("\\Z");
        String contents = s.next();
        JsonParser parser = new JsonParser();
        Customer c2 = parser.parse(contents, Customer.class);
        System.out.println(c2);
        System.out.println("Size: " + c2.getSize());
        System.out.println("Exterior: " + c2.getExterior());
        System.out.println("Fastener: " + c2.getFastener());
        System.out.println("Color: " + c2.getColor());
        System.out.println("Length: " + c2.getLength());
        chooseUpdate();
    }
    public static void chooseUpdate() throws Exception {
        Customer c = new Customer ();
        System.out.println("Above are the preferences you selected for your jacket.\nWould you like to update this information? (yes or no)");
        String update = scanner.nextLine();
        if (update.equalsIgnoreCase("yes")){
            System.out.println("What size jacket would you like? (small, medium, large)");
            String size = scanner.nextLine();
            c.setSize(size);
            System.out.println("What exterior would you like for your jacket? (leather, cloth)");
            String exterior = scanner.nextLine();
            c.setExterior(exterior);
            System.out.println("What fastener would you like for your jacket? (zipper, button)");
            String fastener = scanner.nextLine();
            c.setFastener(fastener);
            System.out.println("What color would you like for your jacket? (black, brown)");
            String color = scanner.nextLine();
            c.setColor(color);
            System.out.println("What length would you like for your jacket? (short, long)");
            String length = scanner.nextLine();
            c.setLength(length);
            File f = new File("customer.json");
            JsonSerializer serializer = new JsonSerializer();
            String jsonformattedCustomer = serializer.serialize(c);
            FileWriter fw = new FileWriter(f);
            fw.write(jsonformattedCustomer);
            fw.close();
            //This below reads the file
            Scanner s = new Scanner(f);
            s.useDelimiter("\\Z");
            String contents = s.next();
            JsonParser parser = new JsonParser();
            Customer c2 = parser.parse(contents, Customer.class);
            System.out.println(c2);
            System.out.println("Size: " + c2.getSize());
            System.out.println("Exterior: " + c2.getExterior());
            System.out.println("Fastener: " + c2.getFastener());
            System.out.println("Color: " + c2.getColor());
            System.out.println("Length: " + c2.getLength());
            System.out.println("Above are the new preferences you selected for your jacket");
        }
        else {
            System.out.println("Have a great day.");
        }

    }
}
