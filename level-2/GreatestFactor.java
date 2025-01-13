import java.util.Scanner;

public class GreatestFactor
{
     public static void main(String [] args)
	 {
		 //creating scanner object for user input
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		//taking number input
		int number = sc.nextInt();
		
		int greatestFactor = 1;
		for(int i= number -1 ;i >=1;i--){
			//checking the greatest factor
		    if(number%i==0){
			   greatestFactor=i;
			   break;
			}
		}
		//printing the 	greatest factor
		System.out.print("greatest factor of a number is: " + greatestFactor);
	 }
}