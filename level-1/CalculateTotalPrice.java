//calculating the total price.

import java.util.*;

//creating the CalculateTotalPrice class
public class CalculateTotalPrice
{
     public static void main(String [] args)
	 { 
	        //Creating a Scanner object for user input
	        Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter the unit price of an item: ");
			//taking input the unit price from user
			double unitPrice = sc.nextDouble();
			
			System.out.print("Enter the quantity to be bought: ");
			//taking input the quantity from user
			double quantity = sc.nextDouble();
			
			// calculating total price 
			double totalPrice = unitPrice*quantity;
			
			//printing the value of total price , quantity and unitPrice
			System.out.print(" The total purchase price is INR "+ totalPrice +" if the quantity "+ quantity +" and unit price is INR "+ unitPrice);
	 }
}