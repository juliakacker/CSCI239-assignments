//You are given a file consisting of students’ names in the following form: lastName firstName middleName. (Note that a student may not have a middle name.) Write a program that converts each name to the following form: firstName middleName lastName. Your program must read each student’s entire name in an object and must consist of a method that takes as input a string, consisting of a student’s name, and returns the string consisting of the altered name. Use the string method index to find the index of “,” , the method length to find the length of the string, and the method substring to extract the firstName, middleName, and lastName. (String methods are described in Chapter 3.)

package Ch7_PrExercise16;
import java.util.*;
import java.io.*;

public class Ch7_PrExercise16 
{
	static Scanner console = new Scanner(System.in);
	
	public static String name() 
	{
		String inputtedName;
	    int firstComma;
	    int secondComma;
	    String alteredName = "";
	    String firstName = "";
	    String middleName = "";
	    String lastName = "";
	    
	    System.out.print("Enter a student's full name (last,first,middle format): ");
	    inputtedName = console.nextLine();
	    
	    firstComma = inputtedName.indexOf(",");
	    secondComma = inputtedName.indexOf(",", firstComma + 1);
	    
	    lastName = inputtedName.substring(0, firstComma); 
	    
	    if (secondComma == -1) {
	        firstName = inputtedName.substring(firstComma + 1); 
		    alteredName = firstName + " " + lastName;

	    } else {
	        firstName = inputtedName.substring(firstComma + 1, secondComma); 
	        middleName = inputtedName.substring(secondComma + 1);
		    alteredName = firstName + " " + middleName + " " + lastName;
	    }
	    
	    return alteredName;
	}
	
	public static void main(String[] args) 
	{
		String alteredName = name();
        System.out.println("Altered Name: " + alteredName);
	}

}
