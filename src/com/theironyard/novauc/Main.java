package com.theironyard.novauc;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            Book b = new Book();

            System.out.println("Please update five variables on your favorite book");

            System.out.println("Title: ");
            b.setTitle(scanner.nextLine());
            System.out.println("Author: ");
            b.setAuthor(scanner.nextLine());
            System.out.println("Date Published: ");
            b.setDatePublished(scanner.nextInt());
            System.out.println("Genre: ");
            b.setGenre(scanner.nextLine());
            System.out.println("Accessible ?: ");
            b.setAccessible(scanner.nextBoolean());
            }
                public void ReadWriteFile() {

                }

    }






