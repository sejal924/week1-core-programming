import java.lang.*;
import java.util.Scanner;

public class FizzBuzz{
   public static void main(String [] args){
       Scanner sc= new Scanner(System.in);
	   
	   //taking the input from user
	   System.out.print("Enter the number: ");
	   int number = sc.nextInt();
	   
	   //creating the array of size number+1
	   String [] FizzBuzz = new String[number+1];
	   if(number>0){
	   for(int i=0; i<=number;i++){
		  // checking i is divisible by 3 and 5 
	      if(i%3==0 && i%5==0 && i!=0){
		     FizzBuzz[i] = "FizzBuzz";
		  }
		  // checking i is divisible by 3
		  else if(i%3==0 && i!=0){
		      FizzBuzz[i] = "Fizz";
		  }
		  // checking i is divisible by 5
		  else if (i%5==0 && i!=0){
		      FizzBuzz[i] = "Buzz";
		  }
		  else{
		     FizzBuzz[i]= String.valueOf(i);  
		  }
	   }
	   //printing the position
	   for(int i=0; i<=number;i++){
	   System.out.println("Position"+ (i) + " =" + FizzBuzz[i]);
	   }
	   } 
   }
}