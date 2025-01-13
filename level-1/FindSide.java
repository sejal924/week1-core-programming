// finding the side of the square

import java.util.*;
 
//Creating the FindSide class 
public class FindSide
{
     public static void main (String [] args)
	 {  
	     //Creating a Scanner object for user input
	       Scanner sc =new Scanner(System.in);
		   
		   System.out.print("Enter the perimeter of a square: ");
		   //taking the perimeter input from user
		   double perimeter = sc.nextDouble();
		   
		   //finding side of the square
		   double side = perimeter/4;
		   
		   //printing the value of side and perimeter
		   System.out.print("The length of the side is "+side+" whose perimeter is " +perimeter);

	 }
}