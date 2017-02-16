package com.theironyard.novauc;

import java.util.Scanner;


public class CInputProgram {

    public static Scanner scannerln = new Scanner(System.in);
    public static String input = scannerln.nextLine();
    public static Comedian comedian = new Comedian();

    public static void main(String[] args) throws Exception {

        System.out.println ("Hi! What would you like to know about our Comedian?");

        Comedian.chooseOption();
    }
    
        public static String nextLine() {
        String line = scannerln.nextLine();

        while (line.startsWith("/")) {
            switch (line) {

                case "/input":
                    for (String item : comedian.options) {
                        System.out.println(item);

                    }
                    break;

                case "/exit":
                    System.exit(0);
                    break;

                default:
                    System.out.println("Command not found!");
                    break;

            }

            line = scannerln.nextLine();


        }

        return line;


    }
}


