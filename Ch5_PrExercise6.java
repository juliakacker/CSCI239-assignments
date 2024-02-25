// Write a program that reads a set of integers, and then finds and prints the sum of the even and odd integers.

package Ch5_PrExercise6;
import java.util.*;
import java.io.*;

public class Ch5_PrExercise6 
{
	static Scanner console = new Scanner(System.in);

	public static void main(String[] args) 
	{
		int num;
		int evenSum = 0;
		int oddSum = 0;
		
		System.out.print("Enter a set integers separated by spaces, enter \"done\" when finished: ");
		
		while (console.hasNext())
		{
			if (console.hasNextInt())
			{
				num = console.nextInt();
				
				if (num % 2 == 0) 
				{
					evenSum += num;
				} else {
					oddSum += num;
				}
			} else {
				String endInput = console.next();
				if (endInput.equals("done"))
				{
					break;
				} else {
					System.out.println("Invalid input");
					break;
				}
			}
			
		}
		
		System.out.println("The sum of the odd integers is: " + oddSum);
		System.out.println("The sum of the even integers is: " + evenSum);

	}

}
