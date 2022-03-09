/*

Program: RectanglePerimeter.java          Last Date of this Revision: March 8, 2022

Purpose: An application that prompts users for a length and width of a rectangle and displays the perimeter.

Author: Rafat E, 
School: CHHS
Course: Computer Programming 20
 
Done

*/

package Chapter3Package;

import java.util.Scanner;

public class RectanglePerimeter {

	public static void main(String[] args) {

		{
			
			Scanner userinput = new Scanner(System.in);
			
			System.out.print("Enter the length of the rectangle: "); //Long side of rectangle
			
			int L = userinput.nextInt();  

			System.out.print("\nEnter the width of the rectangle: "); //Short side of rectangle
			
			int W = userinput.nextInt();  
			
			int perimeter = 2 * W + 2 * L; //Formula
			
			System.out.print("\nThe perimeter of a rectangle with a length of " + L);
			System.out.print(" and a width of "+ W);
			System.out.print(" is "+ perimeter);

}
		
	}
	
	
}

/* Screen Dump

Enter the length of the rectangle: 13

Enter the width of the rectangle: 4

The perimeter of a rectangle with a length of 13 and a width of 4 is 34
                
*/
