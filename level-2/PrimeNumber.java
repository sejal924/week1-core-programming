//  check if the given number is a prime number or not

import java.util.Scanner;
public class PrimeNumber
{
      public static void main(String [] args)
	  {
		  //creating Scanner object for user input
	      Scanner sc = new Scanner(System.in);
		  
		  System.out.print("Enter the number: ");
		  //taking input number from user
		  int number = sc.nextInt();
		  
		  //creating variable
		  boolean isPrime = true;
		  
		  if(number>1){
		       for(int i=2 ; i< number/2 ; i++)
			   {
				   //checking whether number is prime or not
			       if(number%i==0){
					//printing number is not a prime number
				   System.out.print("number " + number + " is not a prime number");
				   isPrime = false;
				   break;
			   }
			   
			 }
         }	
           if(isPrime)
		   {
			   //printing number is prime number
		    System.out.print("number " + number + " is a prime number");
           }		   
	  }
}