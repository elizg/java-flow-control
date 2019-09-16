package com.flowControl;

import java.util.Scanner;

// if-else-if statements
// Display a letter grade for the number grade input

public class TestResults {

	public static void main(String[] args) {
		
		System.out.println("Enter the test score: ");
		Scanner scanner = new Scanner(System.in);
		double testScore = scanner.nextDouble();
		scanner.close();
		
		char letterGrade;
		
		if(testScore <= 65) {
			letterGrade = 'F';
		}
		else if(testScore <= 74) {
			letterGrade = 'D';
		}
		else if(testScore <= 85) {
			letterGrade = 'C';
		}
		else if(testScore <= 92) {
			letterGrade = 'B';
		}
		else {
			letterGrade = 'A';
		}
		
		System.out.println("The test grade is " + letterGrade);
	}

}
