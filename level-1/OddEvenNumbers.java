//printing odd and even numbers between 1 to the number
import java.util.Scanner;

public class OddEvenNumbers
{
      public static void main(String [] args)
	  {
		    //creating the scanner object for user input
	        Scanner sc = new Scanner(System.in);
			
            System.out.print("Enter the number: ");
			//taking the number input from user
            int number = sc.nextInt();
            
			//checking the number is natural number or not
			 if(number>0){
				 //using the for loop 
			      for(int i= 1;i <=number ;i++)
                    {
						//checking whether the number is even or not
					     if(i%2==0)
						 {
						      System.out.println("Number " + i + " is even number");
						 }
						 else 
						 {
						      System.out.println("Number " + i + " is odd number");
						 }
                    }					
			 } 
			 else{
			     System.out.print("Number is not a natural number");	 
			 }
	  }
}
