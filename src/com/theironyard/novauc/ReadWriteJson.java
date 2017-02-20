package com.theironyard.novauc;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Eric on 2/15/17.
 */


public class ReadWriteJson {



    public static void readingRainbow() throws IOException {
        File bookFile = new File("bookFile.json");
        Scanner bookScanner = new Scanner(bookFile);
        bookScanner.useDelimiter("\\Z");
        String contents = bookScanner.next();

        JsonParser parser = new JsonParser();

        Book myBook = null;
        try {
            myBook = parser.parse(contents, Book.class);
            System.out.println(myBook.toString());
        } catch (Exception e) {
            System.out.println("JSON parsing failed.");
        }
    }





    public static void makeBook() throws IOException {
        Book newBook = new Book();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please update five variables on your favorite book");
        System.out.println("Title: ");
        newBook.setTitle(scanner.nextLine());
        System.out.println("Author: ");
        newBook.setAuthor(scanner.nextLine());
        System.out.println("Date Published: ");
        newBook.setDatePublished(scanner.nextLine());
        System.out.println("Genre: ");
        newBook.setGenre(scanner.nextLine());
        System.out.println("Accessible ?: ");
        newBook.setAccessible(scanner.nextBoolean());

        File bookFile = new File("bookFile.json");

        JsonSerializer serializer = new JsonSerializer();
        String jsonformattedBook = serializer.serialize(newBook);

        FileWriter fw = new FileWriter(bookFile);
        fw.write(jsonformattedBook);
        fw.close();
    }


}
