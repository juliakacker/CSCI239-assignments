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

