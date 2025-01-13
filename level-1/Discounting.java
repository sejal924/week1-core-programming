//finding the discounted amount and discounted price the student will pay for the course.
 
import java.util.*;

//creating the Discounting class
public class Discounting
{
  public static void main(String [] args)
  {
	  //Creating a Scanner object for user input
      Scanner sc = new Scanner(System.in);
	  
	  System.out.print("Enter the fees amount: ");
	  //taking input the fees from the user
	  int fees = sc.nextInt();
	  
	  System.out.print("Enter the discount percent: ");
	  //taking input the discount percent  from the user
	  double discountPercent = sc.nextDouble();
	  
	  //calculating the discount 
	  double discount = discountPercent*fees/100;
	  
	  //calculating the discountedFees
	  double discountedFees = fees-discount;
	  
	  //printing the calculated value of discount and discountedFees
	  System.out.print("The discount amount is INR "+ discount+ " and final discounted fee is INR " + discountedFees);

	  
  }
}