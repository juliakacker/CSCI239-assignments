package Ch4_PrExercise9;
import java.util.*;
import java.io.*;

public class Ch4_PrExercise9 
{
	static Scanner console = new Scanner(System.in);

	public static void main(String[] args) 
	{
		int num1;
		int num2;
		char operation;
		
		System.out.print("Enter an integer: ");
		num1 = console.nextInt();
		
		System.out.print("Enter an arithmetic operation (+, -, *, or /): ");
		operation = console.next().charAt(0);
		
		System.out.print("Enter another integer: ");
		num2 = console.nextInt();
		
		switch (operation)
		{
		case '+':
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			break;
		case '-':
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			break;
		case '*':
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
			break;
		case '/':
			if (num2 == 0)
				System.out.println("You cannot divide by 0");
			else
				System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
			break;
		default: 
			System.out.println("Invalid operation");
		}
	}
}