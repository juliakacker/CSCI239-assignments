//Write a program that prompts the user to input a sequence of characters and outputs the number of vowels. (Use the method isVowel written in Programming Exercise 1.)

package Ch7_PrExercise2;

import java.lang.*;
import java.util.*;
import java.io.*;

public class Ch7_PrExercise2 
{
	static Scanner console = new Scanner(System.in);

	public static boolean ifVowel(char nextCharacter)
	{
		char allUppercase = Character.toUpperCase(nextCharacter);
		return allUppercase == 'A' || allUppercase == 'E' || allUppercase == 'I' || allUppercase == 'O' || allUppercase == 'U';
	}
	
	
	public static void main(String[] args) 
	{
		String input;
		char nextCharacter;
		int numberOfVowels = 0;
		
		System.out.print("Enter a sequence of characters without spaces: ");
		input = console.nextLine();
		
		for (int i = 0; i < input.length(); i++) {
			
			nextCharacter = input.charAt(i);
			
			if (ifVowel(nextCharacter)) {
				numberOfVowels++;
			}
		}
		
		System.out.println("There are " + numberOfVowels + " vowels");
		
	}

}
