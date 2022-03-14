/*

Program: Exercise6.java          Last Date of this Revision: March 8, 2022

Purpose: An application that prompts users for a three digit number and calculates / displays the digit in the hundreds place, digit in tens place, and digits in ones place.

Author: Rafat E, 
School: CHHS
Course: Computer Programming 20
 
Done1

*/

package ExercisePackage;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		

		{
			Scanner userinput = new Scanner(System.in);
			
			System.out.print("Please enter a three digit number: ");
			
			int digit = userinput.nextInt();
			
			int onesdigit = digit%10; //Calculate ones digit
			int tensdigit = (digit%100)/10; //Calculate tens digit
			int hundredsdigit = digit/100; //Calculate Hundreds Digit
			
			System.out.print("\nThe digit in the hundreds place is: " +hundredsdigit);
			System.out.print("\nThe digit in the tens place is: " +tensdigit);
			System.out.print("\nThe digit in the ones place is: " +onesdigit);
			

}
		
	}
	
}


/* Screen Dump

Please enter a three digit number: 189

The digit in the Hundreds place is: 1
The digit in the tens place is: 8
The digit in the ones place is: 9

*/