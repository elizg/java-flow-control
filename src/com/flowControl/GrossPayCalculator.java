package com.flowControl;

import java.util.Scanner;

public class GrossPayCalculator {

	public static void main(String[] args) {
		
		// 1. Get # of hours worked
		System.out.println("Enter the number of hours the employee worked:");
		Scanner scanner = new Scanner(System.in);
		// declare this scanner as the hours var
		int hours = scanner.nextInt();
		
		// 2. Get hourly pay rate
		System.out.println("Enter the employee hourly pay rate:");
		// set this scanner as the rate var
		double rate = scanner.nextDouble();
		scanner.close();
		
		// 3. hours * pay rate
		// multiplying input vars
		double grossPay = hours * rate;
		
		// 4. Display result
		System.out.println("The employee's gross pay is $" + grossPay);

	}

}