/*

Program: Digits.java          Last Date of this Revision: March 8, 2022

Purpose: An application that prompts users for a two digit number and calculates / displays the digit in tens place and digit in ones place.

Author: Rafat E, 
School: CHHS
Course: Computer Programming 20

Done

*/

package Chapter3Package;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		

		{
			Scanner userinput = new Scanner(System.in);
			
			System.out.print("Please enter a two digit number: ");
			
			int digit = userinput.nextInt();
			
			int onesdigit = digit%10; //Calculate ones digit
			int tensdigit = digit/10; //Calculate tens digit
			
			System.out.print("\nThe digit in the tens place is: " +tensdigit);
			System.out.print("\nThe digit in the ones place is: " +onesdigit);
			
}
		
	}
	
}


/* Screen Dump

Please enter a two digit number: 93

The digit in the ones place is: 3
The digit in the tens place is: 9


*/