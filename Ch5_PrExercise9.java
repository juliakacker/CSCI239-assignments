/* Write a program that uses while loops to perform the following steps:
a. Prompt the user to input two integers: firstNum and secondNum. (firstNum must be less than secondNum.)
b. Output all the odd numbers between firstNum and secondNum inclusive.
c. Output the sum of all the even numbers between firstNum and secondNum inclusive.
d. Output all the numbers and their squares between 1 and 10.
e. Output the sum of the squares of all the odd numbers between firstNum and secondNum inclusive.
f. Output all the uppercase letters. */

package Ch5_PrExercise9;
import java.util.*;
import java.io.*;

public class Ch5_PrExercise9 
{
	static Scanner console = new Scanner(System.in);

	public static void main(String[] args) 
	{
		int firstNum;
		int secondNum;
		int evenTotal = 0;
		int squaresSum = 0;
		
		//part a
		System.out.print("Enter an integer (this will be \"firstNum\"): ");
		firstNum = console.nextInt();
				
		System.out.print("Enter another integer, it must be larger than the previous integer (this will be \"secondNum\"): ");
		secondNum = console.nextInt();
				
		try {
		if (firstNum >= secondNum) {
			throw new Exception("\nInvalid input, firstNum must be less than secondNum.");
		}
								
		System.out.println();
		
		//part b and c
		int i = firstNum;
		
		System.out.print("Odd numbers between your numbers are: ");
		
		while (i <= secondNum) {
			if(i % 2 != 0) {
				System.out.print(i + " ");
			} else {
				evenTotal += i;
			}
			i++;
		}
		
		System.out.println("\nThe sum of all the even numbers between firstNum and secondNum inclusive is: " + evenTotal);

		//part d 
		int j = 0;
		
		System.out.println("\nAll the numbers and their squares between 1 and 10: ");
		
		while (j <= 10) {
			System.out.println(j + " * " + j + " = " + Math.pow(j, 2));
			j++;
		}
		
		//part e
		int k = firstNum;
				
		while (k <= secondNum) {
			if (k % 2 != 0) {
				squaresSum += Math.pow(k, 2);
			}
			k++;
		}
		
		System.out.println("\nThe sum of the squares of all the odd numbers between firstNum and secondNum inclusive is: " + squaresSum);
			
		
		//part f
		System.out.print("\nAll the uppercase letters are: ");
		
		char letter = 'A';

		while (letter <= 'Z') {
			System.out.print(letter + " ");
			letter++;
		}
		
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
