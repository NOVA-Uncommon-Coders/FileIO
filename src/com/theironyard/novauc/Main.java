package com.theironyard.novauc;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static Scanner scanner = new Scanner(System.in);
	public static Magazines magazines = new Magazines();

	public static void main(String[] args) throws Exception  {

//		try {
			magazines = readFromFile();
			System.out.println("Save magazine");
			System.out.println(magazines);
			System.out.println("Would you like to update your selection?   [y/n]");
			String answer = scanner.nextLine();
			if (answer.equalsIgnoreCase("y")) {


				System.out.println("what is the name of the Magazine?");
				magazines.setName(scanner.nextLine());
				System.out.println("What is the genre?");
				magazines.setGenre(scanner.nextLine());
				System.out.println("How many pages?");
				magazines.setPageSize(scanner.nextLine());
				System.out.println("What is the release date?");
				magazines.setReleaseDate(scanner.nextLine());
				System.out.println("What are the rankings?");
				magazines.setRanking(scanner.nextLine());

				writeToFile();
			}
//		} catch (Exception e){
//			System.out.println(e.getMessage());
//		}
	}


	public static void writeToFile () throws IOException {
		File f = new File("magazines.json");
		JsonSerializer serializer = new JsonSerializer();
		String jsonformattedMagazines = serializer.serialize(magazines);
		FileWriter fw = new FileWriter(f);
		fw.write(jsonformattedMagazines);
		fw.close();
	}
	public static Magazines readFromFile () throws FileNotFoundException{
		File file = new File("magazines.json");

		Scanner s = new Scanner(file);
		s.useDelimiter("\\Z");
		String contents = s.next();
		System.out.println(contents);
		JsonParser parser = new JsonParser();
		Magazines magazines = parser.parse(contents, Magazines.class);
		return magazines;
}


}
