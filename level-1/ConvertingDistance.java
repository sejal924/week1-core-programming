// converting distance in kilometers to miles.

import java.util.*;

//creating the ConvertingDistance class
public class ConvertingDistance
{
   public static void main(String [] args)
   {       
           //Creating a Scanner object for user input
           Scanner sc = new Scanner(System.in);
		   
		   System.out.print("Enter Kilometer: ");
		   //taking input the kilometer from user
           double kilometer = sc.nextDouble();
		   
		   //converting the kilometer to miles
		   double miles = kilometer/1.6;
		   
		   //printing the total miles 
		   System.out.print("The total miles is " + miles+"  mile for the given " +kilometer+"km");

   }
}