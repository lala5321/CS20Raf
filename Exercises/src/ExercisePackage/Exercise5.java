/*

Program: Exercise6.java        Last Date of this Revision: March 8, 2022

Purpose: Create a change application that prompts the user for an amount less than $1.00 and then displays the minimum number of coins necessary to make the change.

Author: Rafat E
School: CHHS
Course: Computer Science  20
 
Done 1

*/

package ExercisePackage;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {

		{
			Scanner input = new Scanner (System.in);

			System.out.print("Enter the change in cents: "  );

			       int change = input.nextInt();

			       int quarters = change / 25;                //Number of quarters
			       
			       int dimes = ((change % 25)/10);            //Number of dimes  

			       int nickels = ((change % 25)% 10 ) / 5;    //Number of nickels

			       int pennies = ((change % 25)% 10) % 5;     //Number of pennies
			       

			       System.out.println("\n \nThe minimum number of coins is: " +"\n") ;

			       System.out.println("Quarters: " + quarters +  "\n");
			     
			       System.out.println("Dimes: " + dimes + "\n");

			       System.out.println("Nickels: " + nickels + "\n");

			       System.out.println("Pennies: " + pennies);

			}
	
		
}
	
}
	
/* Screen Dump

Enter the change in cents: 212
 
The minimum number of coins is: 

Quarters: 8

Dimes: 1

Nickels: 0

Pennies: 2

*/
