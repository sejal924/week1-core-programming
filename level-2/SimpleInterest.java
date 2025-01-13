//calculating Simple Interest
import java.util.*;

//creating the SimpleInterest class
public class SimpleInterest
{
    public static void main(String [] args)
	{
	    //Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);
		 
		System.out.print("Enter principal amount: ");
		//taking the input principal amount from user
		double principal = sc.nextDouble();
		
		System.out.print("Enter rate: ");
		//taking the input rate from user
		double rate = sc.nextDouble();
		
		System.out.print("Enter time: ");
		//taking the input time from user
		double time = sc.nextDouble();
		
		//calculating Simple interest
		double SI = (principal*rate*time) / 100;
		
		//printing the calculated Simple interest
		System.out.print("The Simple Interest is "+ SI +" for Principal "+ principal +" , Rate of Interest "+ rate +" and Time "+ time);

	}
}