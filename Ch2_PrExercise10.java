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
