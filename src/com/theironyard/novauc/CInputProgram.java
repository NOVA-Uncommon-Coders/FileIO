package com.theironyard.novauc;

import java.util.Scanner;

class CInputProgram {
    public static Scanner scannerln = new Scanner(System.in);
    public static Scanner intInput = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        RWJson rwJson = new RWJson();
        rwJson.readFile();
        rwJson.displayObject();

        rwJson.c.chooseAge();
        rwJson.c.chooseHeight();
        rwJson.c.chooseName();
        rwJson.c.chooseJokes();
        rwJson.c.chooseLaughs();

        rwJson.writeFile();


    }

}


