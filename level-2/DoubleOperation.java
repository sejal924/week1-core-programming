//printing the double operations
import java.util.*;

//creating an DoubleOperation class
public class DoubleOperation 
{
  public static void main(String [] args)
  { 
         //Creating a Scanner object for user input
         Scanner sc = new Scanner(System.in);
		  
		//taking the inputs  a ,b and c
		System.out.print("Enter a: ");
	    double a = sc.nextDouble();
		System.out.print("Enter b: ");
	    double b = sc.nextDouble();
		System.out.print("Enter c: ");
	    double c = sc.nextDouble();
		
		//performing double operations
		double opt1 = a + b *c;
        double opt2 = a * b + c;
		double opt3 = c + a / b;
        double opt4 = a % b + c;
		
		//printing the value of double operations
		System.out.print("The results of double Operations are " + opt1 +", "+ opt2 +", "+ opt3 +" and " + opt4);
  }
}