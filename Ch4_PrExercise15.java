/* Write a program that calculates and prints the bill for a cellular telephone company. The company offers two types of service: regular and premium. Rates vary based on the type of service and are computed as follows:

Regular service: $10.00 plus first 50 minutes are free. Charges for over 50 minutes are $0.20 per minute.

Premium service: $25.00 plus:
a. For calls made from 6:00 a.m. to 6:00 p.m., the first 75 minutes are free; charges for over 75 minutes are $0.10 per minute.
b. For calls made from 6:00 p.m. to 6:00 a.m., the first 100 minutes are free; charges for over 100 minutes are $0.05 per minute.

Your program should prompt the user to enter an account number, a service code (typechar), and the number of minutes the service was used. A service code of r or R means regular service; a service code of p or P means premium service. Treat any other character as an error. Your program should output the account number, type of service, number of minutes the telephone service was used, and the amount due from the user. For the premium service, the customer may be using the service during the day and the night. Therefore, to calculate the bill, you must ask the user to input the number of minutes the service was used during the day and the number of minutes the service was used during the night. */

package Ch4_PrExercise15;
import java.util.*;
import java.io.*;

public class Ch4_PrExercise15 
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
	
	public static void main(String[] args) 
	{
		int accountNumber;
		char serviceCode;
		double numberOfMinutes;
		double dayMinutes;
		double nightMinutes;
		double extraMinutes;
		double dayExtraMinutes;
		double nightExtraMinutes;
		double extraFee;
		double dayExtraFee;
		double nightExtraFee;
		double totalPremMinutes;
		double bill;
		
		System.out.print("Enter your account number: ");
		accountNumber = console.nextInt();
		
		System.out.print("Enter a service code (r/R or p/P): ");
		serviceCode = console.next().charAt(0);
		
		if (serviceCode == 'r' || serviceCode == 'R') {
			System.out.print("Enter the number of minutes the service used: ");
			numberOfMinutes = console.nextDouble();
			
			extraMinutes = numberOfMinutes - REG_FREE_MINUTES;
			extraFee = extraMinutes * REG_EXTRA_MINUTES;
			bill = REG_BASIC_FEE + extraFee;
			
			System.out.println();
			System.out.println("Account number: " + accountNumber);
			System.out.println("Type of service: Regular");
			System.out.println("Number of minutes used: " + numberOfMinutes);
			System.out.println("Money due: $" + bill);
			
		} else if (serviceCode == 'p' || serviceCode == 'P') {
			System.out.print("Enter the number of minutes used during the day (6:00am to 6:00pm): ");
			dayMinutes = console.nextDouble();
			
			System.out.print("Enter the number of minutes used during the night (6:00pm to 6:00am): ");
			nightMinutes = console.nextDouble();			
			
			dayExtraMinutes = dayMinutes - PREM_DAY_FREE_MINUTES;
			dayExtraFee = dayExtraMinutes * PREM_DAY_EXTRA_MINUTES;
			
			nightExtraMinutes = nightMinutes - PREM_NIGHT_FREE_MINUTES;
			nightExtraFee = nightExtraMinutes * PREM_NIGHT_EXTRA_MINUTES;
			
			totalPremMinutes = dayMinutes + nightMinutes;
			
			bill = PREM_BASIC_FEE + dayExtraFee + nightExtraFee;
			
			System.out.println();
			System.out.println("Account number: " + accountNumber);
			System.out.println("Type of service: Premium");
			System.out.println("Number of day minutes used: " + dayMinutes);
			System.out.println("Number of night minutes used: " + nightMinutes);
			System.out.println("Total minutes used: " + totalPremMinutes);
			System.out.println("Money due: $" + bill);
			
		} else {
			System.out.println("Invalid character");
		}
		
	}

}
