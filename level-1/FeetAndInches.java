//converting height(in centimeter)  into feet and inches

import java.util.*;

//creating the FeetAndInches class
public class FeetAndInches
{
    public static void main(String [] args)
	{
		//Creating a Scanner object for user input
	    Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter you height in cm: ");
		//taking input the height from the user
	    double height = sc.nextDouble();
		
		//converting into inches
		double inches = height/2.54;
		
		//converting into feet
		double feet = height/(12*2.54);
		
		//printing the value of centimeter ,feet and inches
		System.out.println("Your Height in cm is " + height+" while in feet is " + feet +" and inches is " + inches);

		
	}
}