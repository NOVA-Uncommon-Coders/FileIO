package com.theironyard.novauc;

import java.io.IOException;


public class Main {


    public static void main(String[] args) throws IOException {

        String filename = "bookFile.json";

        try {
            ReadWriteJson.readingRainbow();
        } catch(IOException e) {
            e.printStackTrace();
            System.out.println("Book file not found.");
        }
        ReadWriteJson.makeBook();

    }


}


