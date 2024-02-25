//Redo Exercise 9 using do...while loops.

package Ch5_PrExercise11;
import java.util.*;
import java.io.*;

public class Ch5_PrExercise11 
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
		
		do {
			if(i % 2 != 0) {
				System.out.print(i + " ");
			} else {
				evenTotal += i;
			}
			i++;
		} while (i <= secondNum);
		
		System.out.println("\nThe sum of all the even numbers between firstNum and secondNum inclusive is: " + evenTotal);

		//part d
		int j = 0;
		
		System.out.println("\nAll the numbers and their squares between 1 and 10: ");

		do {
			System.out.println(j + " * " + j + " = " + Math.pow(j, 2));
			j++;
		} while (j <= 10);
			
		//part e
		int k = firstNum;
		
		do {
			if (k % 2 != 0) {
				squaresSum += Math.pow(k, 2);
			}
			k++;
		} while (k <= secondNum);
		
		System.out.println("\nThe sum of the squares of all the odd numbers between firstNum and secondNum inclusive is: " + squaresSum);

		//part f
		System.out.print("\nAll the uppercase letters are: ");
		
		char letter = 'A';
		
		do {
			System.out.print(letter + " ");
			letter++;
		} while (letter <= 'Z');
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
