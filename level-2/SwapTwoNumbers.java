//swapping two numbers
import java.util.*;

//creating the SwapTwoNumbers class
public class SwapTwoNumbers
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
	  
	    //swapping
	    double temp = num1;
	    num1 = num2 ;
	    num2 = temp;
	  
	    // printing the swapped value
	    System.out.print("The swapped numbers are " + num1 + " and " + num2);

	  
   }
}