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
    public static Scanner kb4 = new Scanner(System.in);
    public static Scanner kb5 = new Scanner(System.in);
    public static Scanner kb6 = new Scanner(System.in);
    public static Scanner kb7 = new Scanner(System.in);

    public static MassageMenu menu=new MassageMenu();
    public static JsonSerializer serializer=new JsonSerializer();
    public static JsonParser parser = new JsonParser();
    public static Massage massage = new Massage();


    public static void main(String[] args) throws IOException {
        menu.createOptions();
        menu.massageMenu();


    }
    public static String nextLine()throws IOException{
//        while(kb.hasNextLine()){
//            String throwAway=kb.nextLine();
//            throwAway=kb.next();
//        }
        String line = kb.nextLine();
        while (line.startsWith("/")){
            switch (line){
                case "/admin":
                    menu.admin();
                    break;
                case "/exit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Command not found");
                    break;
            }
            line = kb2.nextLine();
        }
        return line;
    }

}
