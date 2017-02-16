package com.theironyard.novauc;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by peter on 2/15/17.
 */
public class Menu {

    //variables that the user is knowingly interacting with
    String title = "qwe";
    String genre = "asd";
    String author = "zxc";
    int serial = 998877;
    double cost = 67.89;

    Book myBook = new Book();

    public void something() {
        System.out.println(myBook.getAuthor());
    }

    //book.setTitle(title);
    //book.setGenre(genre);






    //admin variable
    String category;

    Scanner inputInt = new Scanner(System.in);
    Scanner inputDbl = new Scanner(System.in);
    Scanner input = new Scanner(System.in);
    ReadWriteJson rwj = new ReadWriteJson();


    public void start() throws IOException{
        while (true) {
            System.out.println("What would you like to do? add / update / cancel");
            switch (input.nextLine()) {

                case "add" :
                            add();
                            break;
                case "update" :
                                update();
                                break;
                default:
                    rwj.writing(myBook);
                    return;
            }
        }
    }
    public void add() {
            System.out.println("What is the title?");
            this.title = input.nextLine();
            System.out.println("What is the genre?");
            this.genre = input.nextLine();
            System.out.println("What is the author?");
            this.author = input.nextLine();
            System.out.println("What is the serial number?");
            this.serial = input.nextInt();
            System.out.println("What is the cost?");
            this.cost = input.nextDouble();
    }

    public void update() {
        while (true) {
            System.out.println("Which category would you like to update? title / genre / author / serial / cost / cancel");
            category = input.nextLine();
            switch (category) {
                case "title" :
                                System.out.println("What is the title?");
                                myBook.setTitle(input.nextLine());
                                break;
                case "genre" :
                                System.out.println("What is the genre");
                                //this.genre = input.nextLine();
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
