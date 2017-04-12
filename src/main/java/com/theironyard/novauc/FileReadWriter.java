package com.theironyard.novauc;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//
//public class FileReadWriter {
//    public static void main(String[] args) throws IOException {
//        File file = new File("names.txt");
//
//        FileWriter fw = new FileWriter(file);
//        fw.write("Alvin\n");
//        fw.append("Mike\n");
//        fw.append("Timmy\n");
//        fw.close();
//
//        Scanner scanner = new Scanner(file);
//        while (scanner.hasNextLine()){
//            System.out.println(scanner.nextLine());
//        }
//        scanner = new Scanner(file);
//        scanner.useDelimiter("\\Z");
//        String contents = scanner.next();
//        System.out.println(contents);
//    }
//
//}