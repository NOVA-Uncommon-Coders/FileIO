package com.theironyard.novauc;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by dangelojoyce on 2/15/17.
 */
public class RWJson {
    File f = new File("comedian.json");
    Comedian c = new Comedian();

    public RWJson() throws  IOException{

    }
    public void writeFile() throws IOException{
        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.serialize(c);
        FileWriter fw = new FileWriter(f); //unhandled exception: java io exception (IDE message)
        fw.write(json);
        fw.close();
    }
    public void readFile() throws IOException{
        Scanner s = new Scanner(f);
        s.useDelimiter("\\Z");
            String contents = s.nextLine();
            JsonParser parser = new JsonParser();
            c = parser.parse(contents, Comedian.class);
            System.out.println(c);

    }
    public void displayObject(){

        System.out.println("What's the name of the comedian?" + c.getName());
        System.out.println("What's the age of the comedian?" + c.getAge());
        System.out.println("What's the height of the comedian" + c.getHeight());
        System.out.println("What joke's do you want?" + c.getJokes());
        System.out.println("Is it funny?" + c.isLaughs());
    }
}


