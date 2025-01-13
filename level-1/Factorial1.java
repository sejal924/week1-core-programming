// calculating the factorial using for loop
import java.util.Scanner;
public class  Factorial1
{
     public static void main(String [] args)
	 {     
	      //creating the scanner object for user input
	      Scanner sc = new Scanner(System.in);
		  
		  System.out.print("Enter the number: ");
		  //taking the number input from user
		  int number = sc.nextInt();
		  
		  
		  int fac=1;
		  int n=number;
		  if(number>0)
		  {
		  //checking if number is 0 or 1 
		  if(number ==0 || number ==1)
		  {
		        System.out.print("Factorial of" + number + " is: " + fac);	
		  }
		  else
		  {
			  //using the for loop to calculate the factorial
		   for(int i=n ; i>0 ;i--)
		   {
		        fac = fac*n;
                n--;				
		   }
		   
		   //printing the value of factorial
		    System.out.print("Factorial of: " + number + " is: " + fac);	
		  }
		  }
		  else 
		  {
			  System.out.print("Number is not a natural number");
		  }
		  
	 }
}