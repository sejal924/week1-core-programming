//using the for loop
import java.util.Scanner;

public class CountDown1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // taking input from the user
        System.out.print("Enter the count down number to start:");
        int number = input.nextInt();
		
		if(number>0)
		{
			//using the for loop for count down number
		for(int i=number;i>0;i--)
		{
		    System.out.println(number +" ");
			number--;
		}
		}
		else
		{
			 System.out.print("Number is not a nural number");
		}
    }
}