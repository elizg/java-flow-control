package com.rudimentaryPractice;

import java.util.Scanner;

public class MadLibs {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a season of the year: ");
		String season = scanner.next();
		
		System.out.println("Enter a whole number greater than 1: ");
		int wholeNumber = scanner.nextInt();
		
		System.out.println("Enter an adjective: ");
		String adjective = scanner.next();
		// scanner must be closed!
		scanner.close();
		// take care for spaces
		System.out.println("On a " + adjective + " " + season + " day, I drink at least " + wholeNumber + " cups of coffee per day.");

	}

}
