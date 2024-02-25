//A box of cookies can hold 24 cookies and a container can hold 75 boxes of cookies. Write a program that prompts the user to enter the total number of cookies. The program then outputs the number of boxes and the number of containers to ship the cookies. Note that each box must contain the specified number of cookies and each container must contain the specified number of boxes. If the last box of cookies contains less than the number of specified cookies, you can discard it, and output the number of leftover cookies. Similarly, if the last container contains less than the number of specified boxes, you can discard it, and output the number of leftover boxes.

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
