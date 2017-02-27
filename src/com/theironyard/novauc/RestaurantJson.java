package com.theironyard.novauc;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by jerieshasmith on 2/26/17.
 */
public class RestaurantJson {
    public static void main(String[] args) throws IOException{
        Restaurant r = new Restaurant();
        r.getName();
        r.getFood();
        r.getLocation();
        r.getOccasion();
        r.getOccasion();

        File f = new File("restaurant.json");
        JsonSerializer serializer = new JsonSerializer();

        String jsonformattedPerson = serializer.serialize(r);

        FileWriter fw = new FileWriter(f);
        fw.write(jsonformattedPerson);
        fw.close();

        Scanner s = new Scanner(f);
        s.useDelimiter("\\Z");
        String contents = s.next();

        JsonParser parser = new JsonParser();
        Restaurant r2 = parser.parse(contents, Restaurant.class);


    }

}
