// printing table
import java.util.Scanner;

public class Table
{
   public static void main(String [] args)
   {
       //creating scanner object for user input
       Scanner sc = new Scanner(System.in);
	   
	   System.out.print("Enter the number: ");
	   //taking the  number input from user
	   int number = sc.nextInt();
	    
		if(number>=6 && number<=9){
			 System.out.println("table of" + number + "is: ");
	     for(int i= 1 ;i<=10 ;i++){
			 //printing the table
			System.out.println(number*i);
	   } 
		}	   
   }
}