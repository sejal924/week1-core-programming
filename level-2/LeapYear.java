// finding Year is a Leap Year or not a Leap Year. 
import java.util.*;

//creating LeapYear class
public class LeapYear
{
    public static void main(String [] args)
	{
	  //Creating a Scanner object for user input
      Scanner sc = new Scanner(System.in);
	  
	  System.out.print("Enter year: ");
	  //taking the input year
	  int year = sc.nextInt();
	  
	  //finding leap year
	  if(year%400 ==0)
	  {
	       System.out.print("The year "+ year +" is a leap year"); 
	  }
	  else if(year%4==0)
	  {
	    if(year%100!=0)
		{
		    System.out.print("The year "+ year +" is a leap year");
		}
	  }
	  else 
	  {
	       System.out.print("The year "+ year +" is not a leap year");
		
	  } 
	}
}

