// finding the total income of a person by salary and bonus
import java.util.*;

//creating the TotalIncome class  
public class  TotalIncome
{
    public static void main(String[] args)
	{ 
	          //Creating a Scanner object for user input
	          Scanner sc= new Scanner(System.in);
			  
			  //taking the input salary from user
			  System.out.print("Enter salary: ");
			  double salary = sc.nextDouble();
			  
			  //taking the bonus from user
			  System.out.print("Enter bonus: ");
			  double bonus = sc.nextDouble();
			  
			  //calculating income
			  double income = salary+bonus;
			  
			  //printing salary , bonus and total income
			  System.out.print("The salary is INR " + salary +" and bonus is INR " + bonus + " .Hence Total Income is INR " + income);

	}
}
