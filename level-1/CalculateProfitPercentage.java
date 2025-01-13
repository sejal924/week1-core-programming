/*calculating the profit in number and profit percentage 
    based on the cost price and selling price*/
import java.util.*;
  
  //creating the CalculateProfitPercentage class
public class CalculateProfitPercentage
{
    public static void main(String [] args)
     { 
	     //creating the variable costPrice , sellingPrice
         int costPrice = 129 , sellingPrice = 191;
		 
		 //calculating the profit
         int profit = sellingPrice - costPrice;
		 
		 // calculating the profit percentage
		 double profitPercentage = (double)profit /(double)costPrice * 100;
		 
		 //printing the value of cost price and selling price
		 System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice);
		 
		 //printing the calculated profit and profit percentage
		 System.out.print("The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
     }
}