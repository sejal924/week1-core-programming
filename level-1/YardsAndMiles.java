//find the distance in yards and miles 

import java.util.*;

//creating the FindDistance class 
public class YardsAndMiles
{
    public static void main(String [] args)
	{       
	       //Creating a Scanner object for user input
	        Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter distance in feet: ");
			//taking input the distance in feet from user
			double distanceInFeet = sc.nextDouble();
			
			//converting into yards
			double yards = distanceInFeet/3;
			
			//converting into miles
			double miles= yards/1760;
			
			//printing the distance in yards and miles
			System.out.print("Distance in yards is "+ yards + "while in miles is "+ miles);

	}
}