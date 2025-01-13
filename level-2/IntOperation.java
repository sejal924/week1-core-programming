//printing the integer operations
import java.util.*;

//creating an IntOperation class
public class IntOperation 
{
  public static void main(String [] args)
  { 
         //Creating a Scanner object for user input
         Scanner sc = new Scanner(System.in);
		  
		//taking the inputs a ,b and c
		System.out.print("Enter a: ");
	    int a = sc.nextInt();
		System.out.print("Enter b: ");
	    int b = sc.nextInt();
		System.out.print("Enter c: ");
	    int c = sc.nextInt();
		
		//performing integer operations
		int opt1 = a + b *c;
        int opt2 = a * b + c;
		int opt3 = c + a / b;
        int opt4 = a % b + c;
		
		//printing the value of integer operations
		System.out.print("The results of Int Operations are " + opt1 +", "+ opt2 +", "+ opt3 +" and " + opt4);
  }
}