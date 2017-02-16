package com.theironyard.novauc;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by peter on 2/15/17.
 */
public class ReadWriteJson {

    File f = new File("book.json");

    public void writing(Book yourBook) throws IOException{

        JsonSerializer serializer = new JsonSerializer();

        String jsonformattedBook = serializer.serialize(yourBook);

        FileWriter fw = new FileWriter(f);

        fw.write(jsonformattedBook);
        fw.close();

    }
    public void reading(Book yourBook) throws IOException{
        Scanner s = new Scanner(f);

        //s.useDelimiter("\\Z");

        String contents = s.useDelimiter("\\Z").next();

        JsonParser parser = new JsonParser();
        yourBook = parser.parse(contents, Book.class);
    }
}
