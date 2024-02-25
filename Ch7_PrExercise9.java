package Ch7_PrExercise9;

import java.lang.*;
import java.util.*;
import java.io.*;

public class Ch7_PrExercise9 
{
	static Scanner console = new Scanner(System.in);

	public double distance (int x1, int y1, int x2, int y2)
	{
		double distance = (Math.sqrt((Math.pow((x2-x1), 2)) + (Math.pow((y2-y1), 2))));
		return distance;
	}
	
	public double radius (int x1, int y1, int x2, int y2)
	{
		double radius = (Math.sqrt((Math.pow((x2-x1), 2)) + (Math.pow((y2-y1), 2))));
		return radius;
	}
	
	public double circumference (double radiusAnswer)
	{
		double circumference = (2 * 3.1416 * radiusAnswer);
		return circumference;
	}
	
	public double area (double radiusAnswer)
	{
		double area = (3.1416 * (Math.pow(radiusAnswer, 2)));
		return area;
	}
	
	public static void main(String[] args) 
	{
		int x1;
		int y1;
		int x2;
		int y2;
		
		System.out.print("Enter the coordinates of the center of a circle (x y format): ");
		x1 = console.nextInt();
		y1 = console.nextInt();

		System.out.print("Enter the coordinates of a point on the circle (x y format): ");
		x2 = console.nextInt();
		y2 = console.nextInt();
		
		Ch7_PrExercise9 program = new Ch7_PrExercise9();
		
		double distanceAnswer = program.distance(x1, y1, x2, y2);
		double radiusAnswer = program.radius(x1, y1, x2, y2);
		double circumferenceAnswer = program.circumference(radiusAnswer);
		double areaAnswer = program.area(radiusAnswer);

		System.out.println();
		System.out.printf("Distance between the two points: %.2f\n", distanceAnswer);
		System.out.printf("Radius of the circle: %.2f\n", radiusAnswer);
		System.out.printf("Circumference of the circle: %.2f\n", circumferenceAnswer);
		System.out.printf("Area of the circle: %.2f\n", areaAnswer);

		
		
	}

}
