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
	public static Restaurant restaurant = new Restaurant();


	public static void main(String[] args) throws Exception, FileNotFoundException {

		try {
			restaurant = answerQuestions();
			System.out.println("Save restaurant information.");
			System.out.println(restaurant);
			System.out.println("Would you like to update this restaurant information? [y/n]");
			String answer = scanner.nextLine();
			if (!answer.equalsIgnoreCase("y")) {
				return;
			}


		} catch (FileNotFoundException e) {
			System.out.println("New restaurant input.");
		}
		restaurant.answerQuestions();
		getAnswers();
	}

	public static void getAnswers() throws IOException {
		File f = new File("restaurant.json");

		JsonSerializer serializer = new JsonSerializer();
		String jsonformatted = serializer.serialize(restaurant);
		FileWriter fw = new FileWriter(f);
		fw.write(jsonformatted);
		fw.close();


	}

	public static Restaurant answerQuestions() throws FileNotFoundException {
		Scanner s = new Scanner(System.in);
		s.useDelimiter("\\Z");
		String contents = s.next();
		JsonParser parser = new JsonParser();
		Restaurant restaurant = parser.parse(contents, Restaurant.class);
		return restaurant;
	}


}