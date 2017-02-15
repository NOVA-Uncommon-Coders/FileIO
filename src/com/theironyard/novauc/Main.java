package com.theironyard.novauc;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<Massage> listMasseuse = new ArrayList<Massage>();
    public static Scanner kb = new Scanner(System.in);
    public static Scanner kb2 = new Scanner(System.in);
    public static Scanner kb3 = new Scanner(System.in);

    public static MassageMenu menu=new MassageMenu();
    public static JsonSerializer serializer=new JsonSerializer();
    public static JsonParser parser = new JsonParser();


    public static void main(String[] args) throws IOException {
        menu.createOptions();
        menu.massageMenu();

//        Person p = new Person();
//
//        p.setName("Alice Smith");
//        p.setAge(30);
//
//
//        File f=new File("person.json");
//
//        JsonSerializer serializer=new JsonSerializer();
//
//        String jsonFormatedPerson =serializer.serialize(p);
//        FileWriter fw = new FileWriter(f);
//
//        fw.write(jsonFormatedPerson);
//        fw.close();
//
//
//        Scanner s = new Scanner(f);
//        s.useDelimiter("\\Z");
//        String contents =s.next();
//
//
//        JsonParser parser = new JsonParser();
//        Person p2 = parser.parse(contents,Person.class);
//
//        System.out.println(p2);
//        System.out.println("p2 name is "+ p2.name);
//        System.out.println("p2 age is "+ p2.age);
//        System.out.println("p2 is alive ? "+ p2.isAlive);
    }
}
