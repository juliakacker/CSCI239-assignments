//Write a program that prompts the user to input a number. The program should then output the number and a message saying whether the number is positive, negative, or zero.

package Ch4_PrExercise1;
import java.util.*;
import java.io.*;

public class Ch4_PrExercise1 
{
	static Scanner console = new Scanner(System.in);

	public static void main(String[] args) 
	{
		double number; 
		
		System.out.print("Enter a number: ");
		number = console.nextDouble();
		
		if (number > 0)
			System.out.println("Your number, " + number + ", is positve.");
		else if (number < 0)
			System.out.println("Your number, " + number + ", is negative.");
		else 
			System.out.println("Your number is 0.");
	}

}
