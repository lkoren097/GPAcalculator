/*
 * Author: Lea Koren
 * Date: Dec 15
 * Prompt for Sem 1 Finals
 */
import java.util.Scanner;

public class GPAcalc {

	public static void main(String[] args) {
		
		 Scanner kboard = new Scanner(System.in);
		
		 //System.out.println("Please input number of classes... ");
		 //int numClasses = kboard.nextInt( );

		 
		 System.out.println("Please input 7 grades... ");
		 System.out.print("Enter the first grade: ");
		 String gr1 = kboard.next( );
		    
		 System.out.print("Enter the second grade: ");
		 String gr2 = kboard.next( );
		 
		 System.out.print("Enter the third grade: ");
		 String gr3 = kboard.next( );
		    
		 System.out.print("Enter the fourth grade: ");
		 String gr4 = kboard.next( );
		    
		 System.out.print("Enter the fifth grade: ");
		 String gr5 = kboard.next( );
		    
		 System.out.print("Enter the sixth grade: ");
		 String gr6 = kboard.next( );

		 System.out.print("Enter the seventh grade: ");
		 String gr7 = kboard.next( );
		 
	 	 /*System.out.println("Please input 7 grades... ");
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
		 int num7 = kboard.nextInt( );*/
		 
		 // 
		    
		    
		    // Change this code so that it calls your method.
		    GPAtools calc = new GPAtools();
		    double result = calc.calcAverage(calc.getNum(gr1), calc.getNum(gr2), calc.getNum(gr3), calc.getNum(gr4), calc.getNum(gr5), calc.getNum(gr6), calc.getNum(gr7));

		    //Printing out the result of the test!
		    System.out.println("Your GPA this semester is: " + result);
		
	}

}