package Ch2_PrExercise11;
import java.util.*;

public class Ch2_PrExercise11 
{
static Scanner console = new Scanner(System.in);
    
	public static void main(String[] args) 
	{
		int timeInSeconds;
		int hours;
		int minutes;
		int seconds;
		
		System.out.print("Enter the elapsed time of an event in seconds: ");
		timeInSeconds = console.nextInt();
		
		hours = timeInSeconds / 3600;
		minutes = (timeInSeconds % 3600) / 60;
		seconds = ((timeInSeconds % 3600) % 60) % 60;
		
		System.out.print("The time in hours, minutes, and seconds is: " + hours);
		System.out.print(":" + minutes);
		System.out.print(":" + seconds);
	}
}
