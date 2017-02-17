package com.theironyard.novauc;

import java.util.Scanner;


class CInputProgram {

    public static Scanner scannerln = new Scanner(System.in);
    public static String input = scannerln.nextLine();
    public static int intInput = scannerln.nextInt();
    public static Comedian comedian = new Comedian();

    public static void main(String[] args) throws Exception {

        System.out.println ("Hi! What would you like to know about our Comedian?");

        //Comedian.chooseOption();
    }

        public static String nextLine() {
        String line = scannerln.nextLine();
        Integer intLine = scannerln.nextInt();

        while (line.startsWith("/") || Integer.valueOf("1")) {
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


