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
