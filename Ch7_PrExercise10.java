/* Rewrite the program in Programming Exercise 15 from Chapter 4 (cell phone) so that it uses the following methods to calculate the billing amount. (In this programming exercise, do not output the number of minutes during which the service is used.)
1. regularBill: This method calculates and returns the billing amount for regular service.
2. premiumBill: This method calculates and returns the billing amount for premium service. */

package Ch7_PrExercise10;

import java.util.*;
import java.io.*;

public class Ch7_PrExercise10 
{
	static Scanner console = new Scanner(System.in);
	
	static final double REG_BASIC_FEE = 10.00;
	static final double REG_FREE_MINUTES = 50;
	static final double REG_EXTRA_MINUTES = 0.20;
	static final double PREM_BASIC_FEE = 25.00;
	static final double PREM_DAY_FREE_MINUTES = 75;
	static final double PREM_NIGHT_FREE_MINUTES = 100;
	static final double PREM_DAY_EXTRA_MINUTES = 0.10;
	static final double PREM_NIGHT_EXTRA_MINUTES = 0.05;
	
	public double regularBill (double numberOfMinutes) 
	{
		double extraMinutes;
		double extraFee;
		double regularBill;
				
		extraMinutes = numberOfMinutes - REG_FREE_MINUTES;
		extraFee = extraMinutes * REG_EXTRA_MINUTES;
		regularBill = REG_BASIC_FEE + extraFee;
		
		return regularBill;
	}
	
	public double premiumBill (double dayMinutes, double nightMinutes) 
	{
		double premiumBill;
		double dayExtraMinutes;
		double dayExtraFee;
		double nightExtraMinutes;
		double nightExtraFee;
		double totalPremMinutes;
		
		dayExtraMinutes = dayMinutes - PREM_DAY_FREE_MINUTES;
		dayExtraFee = dayExtraMinutes * PREM_DAY_EXTRA_MINUTES;
		
		nightExtraMinutes = nightMinutes - PREM_NIGHT_FREE_MINUTES;
		nightExtraFee = nightExtraMinutes * PREM_NIGHT_EXTRA_MINUTES;
		
		totalPremMinutes = dayMinutes + nightMinutes;
		
		premiumBill = PREM_BASIC_FEE + dayExtraFee + nightExtraFee;

		return premiumBill;
	}
	
		public static void main(String[] args) 
	{
		int accountNumber;
		char serviceCode;
		double numberOfMinutes;
		double dayMinutes;
		double nightMinutes;
		
		Ch7_PrExercise10 program = new Ch7_PrExercise10();
		
		System.out.print("Enter your account number: ");
		accountNumber = console.nextInt();
		
		System.out.print("Enter a service code (r/R or p/P): ");
		serviceCode = console.next().charAt(0);
		
		if (serviceCode == 'r' || serviceCode == 'R') {
			System.out.print("Enter the number of minutes the service used: ");
			numberOfMinutes = console.nextDouble();
						
			double bill = program.regularBill(numberOfMinutes);
			
			System.out.println();
			System.out.println("Account number: " + accountNumber);
			System.out.println("Type of service: Regular");
			System.out.println("Number of minutes used: " + numberOfMinutes);
			System.out.printf("Money due: $%.2f", bill);
			
		} else if (serviceCode == 'p' || serviceCode == 'P') {
			System.out.print("Enter the number of minutes used during the day (6:00am to 6:00pm): ");
			dayMinutes = console.nextDouble();
			
			System.out.print("Enter the number of minutes used during the night (6:00pm to 6:00am): ");
			nightMinutes = console.nextDouble();
			
			double bill = program.premiumBill(dayMinutes, nightMinutes);
			
			System.out.println();
			System.out.println("Account number: " + accountNumber);
			System.out.println("Type of service: Premium");
			System.out.println("Number of day minutes used: " + dayMinutes);
			System.out.println("Number of night minutes used: " + nightMinutes);
			System.out.println("Total minutes used: " + (dayMinutes + nightMinutes));
			System.out.printf("Money due: $%.2f", bill);
			
		} else {
			System.out.println("Invalid character");
		}
		
	}

}
