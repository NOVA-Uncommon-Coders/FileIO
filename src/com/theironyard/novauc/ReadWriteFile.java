package com.theironyard.novauc;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Eric on 2/15/17.
 */
public class ReadWriteFile {

    public static void Main(String [] args) throws IOException {

        File info = new File("info.txt");

        FileWriter fw = new FileWriter(info);
        fw.write(/*what the user typed into Main*/);
        fw.append(       );
    }

}
