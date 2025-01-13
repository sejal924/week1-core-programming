// finding the power of a number

import java.util.Scanner;
public class Power 
{
     public static void main(String [] args)
	 {
	    //creating scanner object for user input
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter number: ");
		//taking input number from user
		int number = sc.nextInt();
		System.out.print("Enter power: ");
		//taking input power from user
		int power = sc.nextInt();
		
		int result =1;
		for(int i=1;i<=power;i++){
			//calculating power
		  result = result*number;
		}
		//printing the result
		System.out.print("the power of a number is: "+ result);
	 }
}