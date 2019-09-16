package com.flowControl;

import java.util.Scanner;

/* Salespeople are expected to make a minimum of 10 sales/week.
 * If they do, they receive a congrats message.
 * If they don't, they are informed of how many sales short they were
 */

public class QuotaCalculator {

	public static void main(String[] args) {
		
		int quota = 10;
		
		System.out.println("Enter the number of sales you made this week:");
		Scanner scanner = new Scanner(System.in);
		int sales = scanner.nextInt();
		scanner.close();
		
		if(sales >= quota) 
			System.out.println("Congrats, you met the quota!");
		else {
			int salesShort = quota - sales;
			System.out.println("You did not meet the quota. You were " + salesShort + " sales short.");
		}
	}

}

