//converting weight in pounds to kilograms
import java.util.*;

//creating the PoundsToKilograms class
public class PoundsToKilograms
{
      public static void main(String [] args)
	  {
	      //Creating a Scanner object for user input
          Scanner sc = new Scanner(System.in);
		  
		  System.out.print("Enter weight in pounds: ");
	      //taking input the weight
	      double weight = sc.nextDouble();
		  
		  //converting weight in pounds to kilograms
		  double kilogram = weight/2.2;
		   
		  //printing the converted value of weight
		  System.out.print("The weight of the person in pound is "+ weight +" and in kg is " + kilogram);
	  }
}

