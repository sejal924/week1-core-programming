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
	  
	  //checking whether the year is leap year or not
	  if(year%400 ==0)
	  { 
           //printing the year is leap year
	       System.out.print("The year "+ year +" is a leap year"); 
	  }
	  //checking whether the year is leap year or not
	  else if(year%4==0)
	  {
	    if(year%100!=0)
		{
			//printing the year is leap year
		    System.out.print("The year "+ year +" is a leap year");
		}
	  }
	  else 
	  {
		   //printing the year is not a leap year
	       System.out.print("The year "+ year +" is not a leap year");
		
	  } 
	}
	  
	}
