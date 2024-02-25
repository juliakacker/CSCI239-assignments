/* To make telephone numbers easier to remember, some companies use letters to show their 
telephone number. For example, the telephone number 438-5626 can be shown as GET-LOAN. 
In some cases, to make a telephone number meaningful, companies might use more than seven letters. 
For example, 225-5466 can be displayed as CALL-HOME, which uses eight letters. 
Write a program that prompts the user to enter a telephone number expressed in letters 
and outputs the corresponding telephone number in digits. If the user enters more than eight letters, 
then process only the first seven letters. Also, output the – (hyphen) after the third digit. 
Allow the user to use uppercase and lowercase letters, as well as spaces between words. 
More-over, your program should process as many telephone numbers as the user wants. 
(Hint: You can read the entered telephone number as a string and then use the charAt method 
of the classString to extract each character. For example, if str refers to a string, 
then the expression str.charAt(i) returns the character at the ith position. Recall that in a string, 
the position of the first character is 0.) */

package Ch5_PrExercise5;
import java.util.*;
import java.io.*;

public class Ch5_PrExercise5 
{
	static Scanner console = new Scanner(System.in);

	public static void main(String[] args) 
	{
		String userInput;
		
		while (true) {
		    System.out.print("Enter a telephone number in letters or type \"done\" to stop the program: ");
		    userInput = console.nextLine();

		    if (userInput.equals("done")) {
		        break;
		    }

		    userInput = userInput.toLowerCase();

		    for (int i = 0; i <= 6; i++) {
		        char character = userInput.charAt(i);

		        switch (character) {
		            case 'a':
		            case 'b':
		            case 'c':
		                System.out.print("2");
		                break;
		            case 'd':
		            case 'e':
		            case 'f':
		                System.out.print("3");
		                break;
		            case 'g':
		            case 'h':
		            case 'i':
		                System.out.print("4");
		                break;
		            case 'j':
		            case 'k':
		            case 'l':
		                System.out.print("5");
		                break;
		            case 'm':
		            case 'n':
		            case 'o':
		                System.out.print("6");
		                break;
		            case 'p':
		            case 'q':
		            case 'r':
		            case 's':
		                System.out.print("7");
		                break;
		            case 't':
		            case 'u':
		            case 'v':
		                System.out.print("8");
		                break;
		            case 'w':
		            case 'x':
		            case 'y':
		            case 'z':
		                System.out.print("9");
		                break;
		            case ' ':
		                continue;
		            default:
		                System.out.println("Invalid input");
		                return;
		        }
		        
		        if (i == 2)
				{
					System.out.print("-");
				}
		    }

		    System.out.println();
		}

	}
}