/* The manager of a football stadium wants you to write a program that calculates the total ticket sales after each game. There are four types of tickets—box, sideline, premium, and general admission. After each game, data is stored in a file in the following form:
ticketPrice numberOfTicketsSold

Sample data are shown below: 
250 5750
100 28000
50 35750
25 18750

The first line indicates that the box ticket price is $250 and that 5750 tickets were sold at that price. Output the number of tickets sold and the total sale amount. Format your output with two decimal places. */

package Ch3_PrExercise5;
import java.util.*;
import java.io.*;

public class Ch3_PrExercise5 
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner inFile = new Scanner(new FileReader("inData.txt"));

        double boxTicketPrice = inFile.nextDouble();
		double boxTicketsSold = inFile.nextDouble();
		double sidelineTicketPrice = inFile.nextDouble();
		double sidelineTicketsSold = inFile.nextDouble();
		double premiumTicketPrice = inFile.nextDouble();
		double premiumTicketsSold = inFile.nextDouble();
		double genadminTicketPrice = inFile.nextDouble();
		double genadminTicketsSold = inFile.nextDouble();
		double boxTicketSales = boxTicketPrice * boxTicketsSold;
		double sidelineTicketSales = sidelineTicketPrice * sidelineTicketsSold;
		double premiumTicketSales = premiumTicketPrice * premiumTicketsSold;
		double genadminTicketSales = genadminTicketPrice * genadminTicketsSold;
		
		double totalTicketsSold = boxTicketsSold + sidelineTicketsSold + premiumTicketsSold + genadminTicketsSold;
		double totalSales = boxTicketSales + sidelineTicketSales + premiumTicketSales + genadminTicketSales;

        System.out.printf("The total number of tickets sold: %.2f%n", totalTicketsSold);
        System.out.printf("The total sale amount is: %.2f", totalSales);

        inFile.close();
    }
}

