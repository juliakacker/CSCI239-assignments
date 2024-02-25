//Redo Exercise 9 using for loops.

package Ch5_PrExercise10;
import java.util.*;
import java.io.*;

public class Ch5_PrExercise10 
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
		System.out.print("Odd numbers between your numbers are: ");
		
		for (int i = firstNum; i <= secondNum; i++) {
			if(i % 2 != 0) {
				System.out.print(i + " ");
			} else {
				evenTotal += i;
			}
		}
		
		System.out.println("\nThe sum of all the even numbers between firstNum and secondNum inclusive is: " + evenTotal);
		
		//part d
		System.out.println("\nAll the numbers and their squares between 1 and 10: ");
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(i + " * " + i + " = " + Math.pow(i, 2));
		}
				
		//part e 
		for (int i = firstNum; i <= secondNum; i++) {
			if (i % 2 != 0) {
				squaresSum += Math.pow(i, 2);
			} 
		}
		
		System.out.println("\nThe sum of the squares of all the odd numbers between firstNum and secondNum inclusive is: " + squaresSum);
		
		//part f
		System.out.print("\nAll the uppercase letters are: ");
		
		for (char letter = 'A'; letter <= 'Z'; letter++) {
			System.out.print(letter + " ");
		}
		
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
