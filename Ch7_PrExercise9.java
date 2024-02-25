/*The following formula gives the distance between two points (x1, y1) and (x2, y2) in the Cartesian plane: 
√(x2-x1)^2+(y2-y1)^2

Given the center and a point on a circle, you can use this formula to find the radius of the circle. Write a program that prompts the user to enter the center and a point on the circle. The program should then output the circle’s radius, diameter, circumference, and area. Your program must have at least the following methods:
1. distance: This method takes as its parameters four numbers that represent two points in the plane and returns the distance between them.
2. radius: This method takes as its parameters four numbers that represent the center and a point on the circle, calls the method distance to find the radius of the circle, and returns the circle’s radius.
3. circumference: This method takes as its parameter a number that represents the radius of the circle and returns the circle’s circumference. (If r is the radius, the circumference is 2πr.)
4. area: This method takes as its parameter a number that represents the radius of the circle and returns the circle’s area. (If r is the radius, the area is πr^2.)
5. Assume that π = 3.1416 */

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
