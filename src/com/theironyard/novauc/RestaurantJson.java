package com.theironyard.novauc;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;
import org.omg.CORBA.DynAnyPackage.Invalid;
import sun.tools.java.SyntaxError;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.SyncFailedException;
import java.util.Scanner;

/**
 * Created by jerieshasmith on 2/15/17.
 */
public class RestaurantJson {
    public static void main(String[] args) throws IOException{
        Restaurant r = new Restaurant();
        r.name = "Friday's";
        r.food = "Ribs";
        r.location = "Chicago";
        r.occasion = "Birthday";
        r.setting = "Romantic";


        File f = new File("restaurant.json");

        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.serialize(r);
        FileWriter fw = new FileWriter(f);
        fw.write(json);
        fw.close();


        Scanner s = new Scanner(f);
        s.useDelimiter("\\Z");
        String contents = s.next();
        JsonParser parser = new JsonParser();
        Restaurant r2 = parser.parse(contents, Restaurant.class);

        System.out.println(r);



    }

       throw new  SyntaxError('Invalid', 'restaurant.json' 40);






}
