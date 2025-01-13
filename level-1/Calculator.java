// performing addition, subtraction, multiplication, and division.

import java.util.*;

//creating the Calculator class
public class Calculator
{
   public static void main(String [] args)
   {
	   //Creating a Scanner object for user input
       Scanner sc = new Scanner(System.in);
	   System.out.print("Enter first number: ");
	   
	   // taking input the first number from user
	   double num1 = sc.nextDouble(); 
	   
	   System.out.print("Enter second number: ");
	    // taking input the second number from user
	   double num2 = sc.nextDouble();
	   
	   // adding two numbers
	   double add = num1+num2;
	   //subtrating two numbers
	   double subtract = num1-num2;
	   //multiplying two numbers
	   double multiple = num1*num2;
	   //dividing two numbers
	   double divide = num1/num2;
	   
	   //printing the value of addition, subtraction, multiplication, division
	   System.out.print("The addition, subtraction, multiplication and division value of 2 numbers " + num1+ " and "+ num2+ " is " +add +"," +subtract+"," + multiple+",and " + divide);

   }
}