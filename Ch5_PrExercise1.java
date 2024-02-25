//Write a program that prompts the user to input an integer and then outputs both the individual digits of the number and the sum of the digits. For example, the program should: output the individual digits of 3456 as 3 4 5 6 and the sum as 18, output the individual digits of 8030 as 8 0 3 0 and the sum as 11, output the individual digits of 2345526 as 2 3 4 5 5 2 6 and the sum as 27, output the individual digits of 4000 as 4 0 0 0 and the sum as 4, and output the individual digits of -2345 as 2 3 4 5 and the sum as 14.

package Ch5_PrExercise1;
import java.util.*;
import java.io.*;

public class Ch5_PrExercise1 
{
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		int num; 
		int stringLength;
		int digit;
		int sum = 0;
		
		System.out.print("Enter an integer: ");
		num = console.nextInt();
		
		String numString = Integer.toString(Math.abs(num));
		stringLength = numString.length();
		
		System.out.print("The individual digits are: ");
		for (int i = 0; i < stringLength; i++) 
		{
			digit = Character.getNumericValue(numString.charAt(i));
			System.out.print(digit + " ");
			sum += digit;
		}
		
		System.out.println();
		System.out.println("The sum of the digits is: " + sum);
	}

}
