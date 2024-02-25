package Ch4_PrExercise7;
import java.util.*;
import java.io.*;


public class Ch4_PrExercise7
{
	static Scanner console = new Scanner(System.in);

	public static void main(String[] args) 
	{
		int cookies;
		int boxes;
		int containers;
		int leftoverCookies;
		int leftoverBoxes;
		
		System.out.print("Enter the total number of cookies: ");
		cookies = console.nextInt();
		
		boxes = cookies / 24;
		leftoverCookies = cookies % 24;
		containers = boxes / 75;
		leftoverBoxes = boxes % 75;
		
		System.out.println("Boxes: " + boxes);
		System.out.println("Containers: " + containers);
		System.out.println("Leftover cookies: " + leftoverCookies);
		System.out.println("Leftover boxes: "+ leftoverBoxes);
	}

}
