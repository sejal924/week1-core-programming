// printing a multiplication table of a number

import java.util.Scanner;

public class Multiplication{
    public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		
		//taking the input number from user
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		int[] multiple = new int[10];
		//multiplying 
		for(int i=1;i<=10; i++){
		   multiple[i-1]= number*i;
		}
		for(int i=1;i<=10; i++){
			//printing the table
		  System.out.println(number + "*" + i +" = " + multiple[i-1]);
		}
		
    }
}