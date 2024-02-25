/* Consider the following incomplete Java program:

public class Ch3_PrExercise1 {
	public static void main(String[]args) {	}
}

a. Write Java statements that import the classes Scanner, FileReader, and PrintWriter from the packages java.util and java.io.

b. Write statements that declare inFile to be a reference variable of type Scanner and outFile to be a reference variable of type PrintWriter.

c. The program will read data from the file inData.txt and write output to the file outData.dat. Write statements to open both these files, associate inFile with inData.txt, and associate outFile with outData.dat.

d. Suppose that the fileinData.txt contains the following data:
10.20 5.35
15.6
Randy Gill 31
18500 3.5
A
The numbers in the first line represent the length and width, respectively,of a rectangle. The number in the second line represents the radius of a circle. The third line contains the first name, last name, and the age of a person. The first number in the fourth line is the savings account balance at the beginning of the month and the second number is the interest rate per year. (Assume that π = 3.1416.) The fifth line contains an uppercase letter between A and Y(inclusive). Write statements so that after the program executes, the contents of the file outData.txt are as shown below. If necessary, declare additional variables. Your statements should be general enough so that if the content of the input file changes and the program is run again (without editing and recompiling), it outputs the appropriate results.
Rectangle:
Length = 10.20, width = 5.35, area = 54.57, parameter = 31.10
Circle:
Radius = 15.60, area = 764.54, circumference = 98.02
Name: Randy Gill, age: 31
Beginning balance = $18500.00, interest rate = 3.50
Balance at the end of the month =$18553.96
The character that comes after A in the ASCII set is B

e. Write the statement that closes the output file.

f. Write a Java application program that tests the Java statements that youwrote in parts a–e. */

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
