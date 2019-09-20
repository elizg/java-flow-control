package com.flowControl;

import java.util.Scanner;

// if-else-if checks if the condition is true
// switch statements checks for equality

public class GradeMessage {
	
	public static void main (String args[]) {
		System.out.println("Enter your grade: ");
		Scanner scanner = new Scanner(System.in);
		String grade = scanner.next();
		scanner.close();

		String message;
		
		switch(grade) {
		
		case "A": 
			message = "Great job!";
			break;
			
		case "B":
			message = "Good job.";
			break;
			
		case "C":
			message = "Average job.";
			break;
			
		case "D":
			message = "Work harder.";
			break;
			
		case "F":
			message = "You failed, try again.";
			break;
			
		default:
			message = "Error - invalid grade";
			break;
		}
		
		System.out.println(message);
	}

}
