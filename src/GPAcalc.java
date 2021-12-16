/*
 * Author: Lea Koren
 * Date: Dec 15
 * Prompt for Sem 1 Finals
 */
import java.util.Scanner;

public class GPAcalc {

	public static void main(String[] args) {
		
		 Scanner kboard = new Scanner(System.in);
		
	 	 System.out.println("Please input 7 grades... ");
		 System.out.print("Enter the first grade: ");
		 int num1 = kboard.nextInt( );
		    
		 System.out.print("Enter the second grade: ");
		 int num2 = kboard.nextInt( );
		 
		 System.out.print("Enter the third grade: ");
		 int num3 = kboard.nextInt( );
		    
		 System.out.print("Enter the fourth grade: ");
		 int num4 = kboard.nextInt( );
		    
		 System.out.print("Enter the fifth grade: ");
		 int num5 = kboard.nextInt( );
		    
		 System.out.print("Enter the sixth grade: ");
		 int num6 = kboard.nextInt( );

		 System.out.print("Enter the seventh grade: ");
		 int num7 = kboard.nextInt( );
		    
		    
		    // Change this code so that it calls your method.
		    GPAtools calc = new GPAtools();
		    double result = calc.calcAverage(num1, num2, num3, num4, num5, num6, num7);

		    //Printing out the result of the test!
		    System.out.println("Your GPA this semester is: " + result);
		
	}

}