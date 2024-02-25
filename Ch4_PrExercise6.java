package Ch4_PrExercise6;

import java.util.*;
import java.io.*;

public class Ch4_PrExercise6 
{
	static Scanner console = new Scanner(System.in);

	public static void main(String[] args) 
	{
		double num1;
		double num2;
		double num3;
		
		System.out.print("Enter the first side length of a triangle: ");
		num1 = console.nextDouble();

		System.out.print("Enter the second side length of a triangle: ");
		num2 = console.nextDouble();
		
		System.out.print("Enter the third side length of a triangle: ");
		num3 = console.nextDouble();
		
		if ((((num1*num1)+(num2*num2)) == (num3*num3)) || (((num2*num2)+(num3*num3)) == (num1*num1)) || (((num1*num1)+(num3*num3)) == (num2*num2)))
			System.out.println("Your triangle is a right triangle.");
		else 
			System.out.println("Your triangle is not a right triangle.");
			
	}

}
