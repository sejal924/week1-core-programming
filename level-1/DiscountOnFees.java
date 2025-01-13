//finding the discounted amount and discounted price the student will pay for the course
import java.util.*;

//creating the DiscountOnFees class
public class DiscountOnFees
{
        public static void main(String [] args)
		{
			 //creating the variable fees and discountPercent
		     int fees = 125000;
			 int discountPercent = 10;
			 
			 // calculating discount
			 double discount = fees*discountPercent/100;
			 
			 //calculating discountedFee
			 double discountedFee = fees - discount ;
			 
			 //printing the calculated value of discount and discountedFee
			 System.out.print("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);

		}
}