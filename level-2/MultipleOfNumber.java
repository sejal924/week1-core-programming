//calculating the multiple of the number
import java.util.Scanner;

public class MultipleOfNumber
{
      public static void main(String [] args)
	  {    
	       //creating scanner object for user input
	       Scanner sc = new Scanner(System.in);
		   
		   System.out.print("Enter the number: ");
		   //taking input the number from user
		   int number = sc.nextInt();
		   
		   for(int i=100;i>=1;i--)
		   {
		        if(number%i==0){
				   System.out.println(i+" is a multiple of the number " + number);
				}
		   }
		   
		   
	  }
}