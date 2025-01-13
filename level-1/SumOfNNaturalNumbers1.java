//sum of n natural numbers using for loop
import java.util.Scanner;

public class  SumOfNNaturalNumbers1
{
        public static void main(String [] args)
		{
			   //created Scanner object for user input
		       Scanner sc = new Scanner(System.in);
			   
			   System.out.print("Enter the number: ");
			   //taking the natural number input from user
			   int num = sc.nextInt();
			   
			   int sum=0;
			   //calculating the  Sum of N Natural Numbers using formula
			   int formula = num*(num+1)/2;
			   if(num>0)
			   {
				   //calculating the  Sum of N Natural Numbers using for
			      for(int i=num ;i>0 ;i--)
				  {
				       sum=sum+num;
					   num--;
				  }
			   }
			   else
			   {
			        System.out.println("Number is not a natural number");
			   }
			   //checking the whether sum is equal to calculated formula or not
			   if(sum==formula)
			   {
			        System.out.print("Sum of n natural numbers: " + sum);
			   }
			   
		}
}