package com.theironyard.novauc;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<Massage> listMassuese = new ArrayList<Massage>();
    public static Scanner kb = new Scanner(System.in);
    public static MassageMenu menu=new MassageMenu();

    public static void main(String[] args) {
        menu.createOptions();
        menu.massageMenu();

    }
}
