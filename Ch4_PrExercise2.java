//Write a program that prompts the user to input three numbers. The program should then output the numbers in nondescending order.

package Ch4_PrExercise2;
import java.util.*;
import java.io.*;

public class Ch4_PrExercise2 
{
	static Scanner console = new Scanner(System.in);

	public static void main(String[] args) 
	{
		//variables
		double num1;
		double num2;
		double num3;
		double biggest;
		double middle;
		double smallest;
		
		//get user input
		System.out.print("Enter a number: ");
		num1 = console.nextDouble();
		
		System.out.print("Enter another number: ");
		num2 = console.nextDouble();

		System.out.print("Enter another number: ");
		num3 = console.nextDouble();

		//if statements
		if (num1 >= num2 && num1 >= num3) {
			biggest = num1;
			if (num2 >= num3) {
				middle = num2;
				smallest = num3;
			} else {
				middle = num3;
				smallest = num2;
			}
		} else if (num2 >= num1 && num2 >= num3) {
			biggest = num2;
			if (num1 >= num3) {
				middle = num1;
				smallest = num3;
			} else {
				middle = num3;
				smallest = num1;
			}
		} else {
			biggest = num3;
			if (num1 >= num2) {
				middle = num1;
				smallest = num2;
			} else {
				middle = num2;
				smallest = num1;
			}
		}
				
		//print results
		System.out.println("Your numbers in nondescending order are: " + smallest + ", " + middle + ", " + biggest);
	}
}
