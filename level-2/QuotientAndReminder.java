//printing  quotient and reminder of two number

import java.util.*;
//creating the QuotientAndRemainder class
public class QuotientAndRemainder
{
   public static void main(String [] args)
   {
      //Creating a Scanner object for user input
      Scanner sc = new Scanner(System.in);
	  System.out.print("Enter first number: ");
	  //taking input the first number
	  double num1 = sc.nextDouble();
	  
	  System.out.print("Enter second number: ");
	  //taking input the second number
	  double num2 = sc.nextDouble();
	  
	  //finding the quotient  
	  double quotient = Math.floor(num1/num2);
	  
	  //finding the reminder
	  double reminder  = num1%num2;
	  
	  //printing the quotient and reminder
	  System.out.print("The Quotient is "+ quotient + " and Reminder is "+ reminder + " of two number " + num1 + " and " + num2);

   }
   
}