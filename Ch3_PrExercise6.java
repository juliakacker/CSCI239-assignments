package Ch3_PrExercise6;
import java.util.*;
import java.io.*;

public class Ch3_PrExercise6 
{
    static Scanner console = new Scanner(System.in);

	public static void main(String[] args) throws FileNotFoundException 
	{
		PrintWriter outFile = new PrintWriter("prog.out");

		String employeeName;
		double grossAmount;
		double federalTax;
		double stateTax;
		double socialSecurityTax;
		double medicareTax;
		double pensionPlan;
		double healthInsurance = 75;
		double netPay;
		
		System.out.print("Enter the employee name: ");
		employeeName = console.nextLine();
		
		System.out.print("Enter the gross amount of money the employee made: ");
		grossAmount = console.nextDouble();
		
		federalTax = grossAmount * 0.15;
		stateTax = grossAmount * 0.035;
		socialSecurityTax = grossAmount * 0.0575;
		medicareTax = grossAmount * 0.0275;
		pensionPlan = grossAmount * 0.05;
		netPay = grossAmount - federalTax - stateTax - socialSecurityTax - medicareTax - pensionPlan;
		
		outFile.println("" + employeeName);
		outFile.printf("Gross Amount: $%.2f%n", grossAmount);
		outFile.printf("Federal Tax: $%.2f%n", federalTax);
		outFile.printf("State Tax: $%.2f%n", stateTax);
		outFile.printf("Social Security Tax: $%.2f%n", socialSecurityTax);
		outFile.printf("Medicare/Medicaid Tax: $%.2f%n", medicareTax);
		outFile.printf("Pension Plan: $%.2f%n", pensionPlan);
		outFile.printf("Health Insurance: $%.2f%n", healthInsurance);
		outFile.printf("Net Pay: $%.2f%n", netPay);
		
		outFile.close();
	}

}
