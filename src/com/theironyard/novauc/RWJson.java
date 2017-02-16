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
    public static void main (String [] arg) throws IOException {

        Comedian c = new Comedian ();
        c.name  = "";//scanner?
        c.age = 20;

        File f = new File ("comedian.json");

        //write json

        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.serialize(c);
        FileWriter fw = new FileWriter(f); //unhandled exception: java io exception (IDE message)
        fw.write(json);
        fw.close();

        //read json

        Scanner s = new Scanner (f);
        s.useDelimiter("\\Z");
        String contents = s.next();
        JsonParser parser = new JsonParser();
        Comedian c2 = parser.parse(contents, Comedian.class);

        System.out.println(c2);



    }

}
