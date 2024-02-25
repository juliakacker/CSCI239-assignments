package Ch2_PrExercise8;

import java.util.*;

public class Ch2_PrExercise8 
{
		
		static Scanner console = new Scanner(System.in);

		public static void main(String[] args) 
		{
			double dec1;
			double dec2;
			double dec3;
			double dec4;
			double dec5;
			
			int num;
			
			
			System.out.print("Enter the first decimal number: ");
			dec1 = console.nextDouble();
			System.out.println();
			
			System.out.print("Enter the second decimal number: ");
			dec2 = console.nextDouble();
			System.out.println();
			
			System.out.print("Enter the third decimal number: ");
			dec3 = console.nextDouble();
			System.out.println();
			
			System.out.print("Enter the fourth decimal number: ");
			dec4 = console.nextDouble();
			System.out.println();
			
			System.out.print("Enter the fifth decimal number: ");
			dec5 = console.nextDouble();
			System.out.println();
			
			num = (int) (dec1 + dec2 + dec3 + dec4 + dec5 + 0.5);
			
			System.out.println("The sum to the nearest integer: " + num);

	}

}
