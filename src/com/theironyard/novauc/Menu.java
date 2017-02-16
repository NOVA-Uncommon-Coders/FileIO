package com.theironyard.novauc;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by peter on 2/15/17.
 */
public class Menu {

    private String category;

    Book myBook = new Book();

    ReadWriteJson rwj = new ReadWriteJson();


    Scanner inputInt = new Scanner(System.in);
    Scanner inputDbl = new Scanner(System.in);
    Scanner input = new Scanner(System.in);


    public void start() throws IOException{
        while (true) {
            System.out.println("What would you like to do? add / update / done");
            switch (input.nextLine()) {

                case "add" :
                            add();
                            break;
                case "update" :
                                update();
                                break;
                default:
                    rwj.writing(myBook);
                    System.out.println("test: rwj should have written");
                    return;
            }
        }
    }
    public void add() {
            System.out.println("What is the title?");
            myBook.setTitle(input.nextLine());
            System.out.println("What is the genre?");
            myBook.setGenre(input.nextLine());
            System.out.println("What is the author?");
            myBook.setAuthor(input.nextLine());
            System.out.println("What is the serial number?");
            myBook.setSerial(inputInt.nextInt());
            System.out.println("What is the cost?");
            myBook.setCost(inputDbl.nextDouble());
    }

    public void update() {
        while (true) {
            //ToDo: add reading the file method
            //ToDo: also add writing the file method so that the file writes after updating - done in other menu
            //rwj.reading(Book myBook);

            System.out.println("Which category would you like to update? title / genre / author / serial / cost / done");
            category = input.nextLine();
            switch (category) {
                case "title" :
                                System.out.println("What is the title?");
                                myBook.setTitle(input.nextLine());
                                break;
                case "genre" :
                                System.out.println("What is the genre?");
                                myBook.setGenre(input.nextLine());
                                break;
                case "author" :
                                System.out.println("What is the author?");
                                myBook.setAuthor(input.nextLine());
                                break;
                case "serial" :
                                System.out.println("What is the serial number?");
                                myBook.setSerial(inputInt.nextInt());
                                break;
                case "cost" :
                                System.out.println("What is the cost?");
                                myBook.setCost(inputDbl.nextDouble());
                                break;
                default:
                    return;
            }
        }
    }
}
