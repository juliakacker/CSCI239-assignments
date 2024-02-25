package Ch7_PrExercise1;

import java.lang.*;
import java.util.*;
import java.io.*;

public class Ch7_PrExercise1 
{
	static Scanner console = new Scanner(System.in);

	public static boolean ifVowel(char input)
	{
		char allUppercase = Character.toUpperCase(input);
		return allUppercase == 'A' || allUppercase == 'E' || allUppercase == 'I' || allUppercase == 'O' || allUppercase == 'U';
	}
	
	
	public static void main(String[] args) 
	{
		char input;
		System.out.print("Enter a character: ");
		input = console.next().charAt(0);
		
		if (ifVowel(input)) {
			System.out.println("\"" + input + "\"" + " is a vowel");
		} else {
			System.out.println("\"" + input + "\"" + " is not a vowel");
		}
	}

}
