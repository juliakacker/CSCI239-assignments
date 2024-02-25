//Write a program that prompts the capacity, in gallons, of an automobile fuel tank and the miles per gallons the automobile can be driven. The program outputs the number of miles the automobile can be driven without refueling.

package Ch2_PrExercise10;
import java.util.*;

public class Ch2_PrExercise10 
{
    static Scanner console = new Scanner(System.in);
    
	public static void main(String[] args) 
	{
		double gallons;
		double mpg;
		double miles;
		
		System.out.print("Enter the capacity, in gallons your automoblie can hold: ");
		gallons = console.nextDouble();
		
		System.out.print("Enter the miles per gallon your automible can drive: ");
		mpg = console.nextDouble();
		
		miles = gallons * mpg;
		
		System.out.print("Your automobile can drive " + miles);
		System.out.print(" without refueling");
	}
}
