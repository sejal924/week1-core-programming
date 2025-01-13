//calculating the bonus
import java.util.Scanner;

public class  BonusOfEmployees
{
     public static void main (String [] args)
	 {
		 //creating the scanner object for user input
	     Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Enter the salary: ");
		 //taking the input salary from user
		 double salary = sc.nextDouble();
		 
		 System.out.print("Enter year of service: ");
		 //taking the input year of service from user
		 double yearOfService = sc.nextDouble();
		 
		 double bonus;
		 //checking if year of service is greater then 5 or not
		 if(yearOfService>5){
			 //calculating bonus
		      bonus = (5*salary)/100;
			  
			  //printing bonus amount
			  System.out.print("bonus is: "+ bonus);
		 }
		 	 
	 }
}