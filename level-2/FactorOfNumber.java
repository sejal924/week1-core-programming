//finding the factors of a number 
import java.util.Scanner;

public class FactorOfNumber
{
 public static void main(String [] args)
 {
	    //creating the scanner object for user input
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		//taking user input
		int number = sc.nextInt();
		System.out.println("The factors of a number are: ");
		//finding factors
		for(int i=1;i<number;i++)
		{
		     if(number%i==0)
			 {
			    System.out.println(i);
			 }
		}
 }
}