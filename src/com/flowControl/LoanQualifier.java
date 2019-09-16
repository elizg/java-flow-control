package com.flowControl;

import java.util.Scanner;

//nesting if statements
//Loan application, to qualify for the loan, they must make at least $30k annually and have been at their current job for at least two years.

public class LoanQualifier {
	
	public static void main(String[] args) {
		// initialize what we do know
		int requiredSalary = 30000;
		int requiredTimeAtJob = 2;
		
		// get what we don't know
		System.out.println("Enter your salary: ");
		Scanner scanner = new Scanner(System.in);
		double salary = scanner.nextDouble();
		
		System.out.println("Enter the number of years you have been employed at your current job: ");
		double years = scanner.nextDouble();
		
		scanner.close();
		
		// determine if qualified by if/else
		if(salary >= requiredSalary) {
			if(years >= requiredTimeAtJob) {
			System.out.println("You are approved for the loan.");
		}
		else {
			System.out.println("Sorry, you must have been at your current job for at least " + requiredTimeAtJob + " years to qualify for the loan.");
		}
		}
	else { 
		System.out.println("Sorry, you must earn at least $" + requiredSalary + " to qualify for the loan.");
	}
	}
}