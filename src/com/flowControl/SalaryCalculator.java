package com.flowControl;

import java.util.Scanner;

/*
 * All salespeople get base pay of $1000 per week. 
 * Those who exceed 10 sales get a $250 bonus.
 */
public class SalaryCalculator {

	public static void main(String[] args) {
		
		// What do I already know? 
		// Initialize known values
		int salary = 1000; 
		int bonus = 250;
		int quota = 10;
		
		// What don't I know yet? Get it
		System.out.println("How many sales did the employee make this week?");
		Scanner scanner = new Scanner(System.in);
		int sales = scanner.nextInt();
		scanner.close();
		
		// Quick detour for bonus earners	
		if(sales > quota) {
			salary += bonus;
		}
		
		// output
		System.out.println("The employee's total weekly pay is $" + salary);
		
	}

}