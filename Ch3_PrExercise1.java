package Ch3_PrExercise1;
import java.util.*;
import java.io.*;

public class Ch3_PrExercise1 
{
    static Scanner console = new Scanner(System.in);

	public static void main(String[] args) throws FileNotFoundException 
	{
        Scanner inFile = new Scanner(new FileReader("inData.txt"));
		PrintWriter outFile = new PrintWriter("outData.out");

		//create variables
		double recLength = inFile.nextDouble();
		double recWidth = inFile.nextDouble();
		double recArea = recLength * recWidth;
		double recParameter = (recLength * 2) + (recWidth * 2);
		double circRadius = inFile.nextDouble();
		double circArea = (3.1416 * circRadius * circRadius);
		double circCircumference = (2 * 3.1416 * circRadius);
		String firstName = inFile.next();
		String lastName = inFile.next();
		int age = inFile.nextInt();
		double beginningBalance = inFile.nextDouble();
		double interestRate = inFile.nextDouble();
		double endingBalance = beginningBalance + (beginningBalance * (interestRate / 100));
		char character = inFile.next().charAt(0);
		char nextCharacter = (char) (character + 1);
		
		//print results		
		outFile.println("Rectangle:");
		outFile.printf("Length = %.2f, width = %.2f, area = %.2f, parameter = %.2f%n", recLength, recWidth, recArea, recParameter);
		outFile.println("Circle:");
		outFile.printf("Radius = %.2f, area = %.2f, circumference = %.2f%n" , circRadius, circArea, circCircumference);
		outFile.printf("Name: %s %s, age: %d%n", firstName, lastName, age);
		outFile.printf("Beginning balance = $%.2f, interest rate = %.2f%n", beginningBalance, interestRate);
		outFile.printf("Balance at the end of the month = $%.2f%n", endingBalance);
		outFile.printf("The character that comes after %c in the ASCII set is %c", character, nextCharacter);
		
		outFile.close();
	}

}
