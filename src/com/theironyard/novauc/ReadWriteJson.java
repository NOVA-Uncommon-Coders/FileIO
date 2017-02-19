package com.theironyard.novauc;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by octavio on 2/17/17.
 */
public class ReadWriteJson {

    public static void main(String[] args) throws IOException {

        Survey z = new Survey();
        z.brand = "Hyundai";
        z.model = "Sonata";
        z.year = 2016;
        z.color = "White";
        z.experience = 10;


        File f = new File("Survey.json");


        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.serialize(z);
        FileWriter fw = new FileWriter(f);
        fw.write(json);
        fw.close();


        Scanner s = new Scanner(f);
        s.useDelimiter("\\Z");
        String contents = s.next();
        JsonParser parser = new JsonParser();
        Survey z2 = parser.parse(contents, Survey.class);


        System.out.println(z2);

    }
}
