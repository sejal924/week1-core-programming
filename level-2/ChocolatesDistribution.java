//dividing N number of chocolates among M children.
import java.util.*;

//creating the ChocolatesDistribution class
public class ChocolatesDistribution
{
    public static void main(String [] args)
	{
	    //Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);
		  
		System.out.print("Enter number of children: ");
		//taking the input number of children from user
		int numberOfChildren = sc.nextInt();
		
		System.out.print("Enter number of chocolates: ");
		//taking the input number of chocolates from user
		int numberOfchocolates = sc.nextInt();
		
		//calculating distribution of chocolates
		int distributedChocolates = numberOfchocolates/numberOfChildren;
		
		//calculating  remaining chocolates
         int remainingChocolates = numberOfchocolates%numberOfChildren;
		 
		//printing the value of  number of chocolates and  remaining chocolates
		System.out.print("The number of chocolates each child gets is "+ distributedChocolates +" and the number of remaining chocolates are " + remainingChocolates);
	} 
}
