package com.theironyard.novauc;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileRW {
    private HashMap<String, Characters> toons = new HashMap<>();
    private File fileDelf = new File("Delf.json");
    private File fileHelf = new File("Helf.json");
    private File fileDwarf = new File("Dwarf.json");

    /************************
     * Add methods
     ***********************/

    public void addkey(String name, String type) {
        if (toons.containsKey(name)) {
            System.out.println("Character already exist! returning...");
            return;
        } else {
            switch (type) {
                case "DARK ELF":
                case "DARKELF":
                    toons.put(name, new DarkElf(name));
                    return;
                case "HALFELF":
                case "HALF ELF":
                    toons.put(name, new HalfElf(name));
                    return;
                case "DWARF":
                    toons.put(name, new Dwarf(name));
                    return;
                default:
                    System.out.println("Something strange happened... nothing added!");
                    break;
            }
        }
    }
    public boolean contains(String check) {
        return toons.containsKey(check);
    }

    /************************
     * Display methods
     ***********************/

    public void displayObjects() {
        System.out.println("");
        for (Map.Entry<String, Characters> entry : toons.entrySet()) {
            System.out.printf("%s: %s %s that is %s years old and from %s. Only has %s gold!",entry.getValue().getName(),entry.getValue().toString(),entry.getValue().getCharClass(),entry.getValue().getAge(),entry.getValue().getHomeTown(),entry.getValue().getGold());
            System.out.println("");
        }
    }
    public void displayToons() {
        int i = 1;
        for (Map.Entry<String, Characters> entry : toons.entrySet()) {
            String key = entry.getKey();
            System.out.printf("%s] %s\n", i, key);
            i++;
        }
    }

    /************************
     * Update methods for Hash
     ***********************/

    public void updateAge(String toon) {
        System.out.println("Please enter a new age: ");
        int age = PlayerMaker.scannerInt.nextInt();
        if (age < 1 || age > 150) {
            System.out.println("Please enter an age between 1 and 150!");
        } else {
            toons.get(toon).setAge(age);
        }
    }
    public void updateGold(String toon) {
        System.out.println("Enter a new gold amount: ");
        int gold = PlayerMaker.scannerInt.nextInt();
        if (gold < 0 || gold > 100_000) {
            System.out.println("Please enter a value between 0 and 100,000!");
        } else {
            toons.get(toon).setGold(gold);
        }
    }
    public void updateName(String toon) {
        System.out.println("Enter your new name: ");
        toons.get(toon).setName(PlayerMaker.scanner.nextLine());
    }
    public void updateHomeTown(String toon) {
        System.out.println("Enter a new hometown: ");
        toons.get(toon).setHomeTown(PlayerMaker.scanner.nextLine());
    }
    public void updateCharClass(String toon) {
        System.out.println("Enter a new Home Town: ");
        toons.get(toon).setCharClass(PlayerMaker.scanner.nextLine());
    }

    /**********************************************************************
     * Read and Write methods
     * My goal was to save each subclass into a unique file type
     * while storing all of the class objects in a single hashmap
     * The read method below reads in the contents from each file and
     * adds it to the hashmap
     *
     * The write method uses conditionals to verify objects are being wrote
     * to the correct JSON files. It then determines closes the files only
     * if they are read.
     **********************************************************************/

    public void readFile() throws IOException {
        Scanner scannerFileDelf = new Scanner(fileDelf);
        Scanner scannerFileDwarf = new Scanner(fileDwarf);
        Scanner scannerFileHelf = new Scanner(fileHelf);
        scannerFileDelf.useDelimiter("\n");
        scannerFileHelf.useDelimiter("\n");
        scannerFileDwarf.useDelimiter("\n");
        JsonParser parser = new JsonParser();

        String contents;
        while (scannerFileDelf.hasNext()) {
            contents = scannerFileDelf.next();
            DarkElf a = parser.parse(contents, DarkElf.class);
            toons.put(a.getName(), a);
        }
        while (scannerFileDwarf.hasNext()) {
            contents = scannerFileDwarf.next();
            Dwarf b = parser.parse(contents, Dwarf.class);
            toons.put(b.getName(), b);
        }
        while (scannerFileHelf.hasNext()) {
            contents = scannerFileHelf.next();
            HalfElf c = parser.parse(contents, HalfElf.class);
            toons.put(c.getName(), c);
        }
    }
    public void writeFile() throws IOException {
        FileWriter fileWriterDelf = new FileWriter(fileDelf);
        FileWriter fileWriterDwarf = new FileWriter(fileDwarf);
        FileWriter fileWriterHelf = new FileWriter(fileHelf);
        JsonSerializer serializer = new JsonSerializer();

        boolean delfDidWrite = false;
        boolean helfDidWrite = false;
        boolean dwarfDidWrite = false;

        String json;

        for (Map.Entry<String, Characters> entry : toons.entrySet()) {
            json = serializer.serialize(entry.getValue());

            if (entry.getValue().getRace().equalsIgnoreCase("dark Elf")) {
                fileWriterDelf.append(json);
                fileWriterDelf.append("\n");
                delfDidWrite = true;
            } else if (entry.getValue().getRace().equalsIgnoreCase("half Elf")) {
                fileWriterHelf.append(json);
                fileWriterHelf.append("\n");
                helfDidWrite = true;
            } else if (entry.getValue().getRace().equalsIgnoreCase("dwarf")) {
                fileWriterDwarf.append(json);
                fileWriterDwarf.append("\n");
                dwarfDidWrite = true;
            } else {
                System.out.println("Something bad in write!");
            }
        }
        if (delfDidWrite) {
            fileWriterDelf.close();
        }
        if (dwarfDidWrite) {
            fileWriterDwarf.close();
        }
        if (helfDidWrite) {
            fileWriterHelf.close();
        }
    }
}