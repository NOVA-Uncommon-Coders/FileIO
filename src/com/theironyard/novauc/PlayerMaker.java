package com.theironyard.novauc;

import java.io.IOException;
import java.util.Scanner;

public class PlayerMaker {
	public static Scanner scanner = new Scanner(System.in);
	public static Scanner scannerInt = new Scanner(System.in);
	public static FileRW files = new FileRW();

    public static void main(String[] args) throws IOException {
    	Menu menu = new Menu();
		menu.mainMenu();
    }
}
