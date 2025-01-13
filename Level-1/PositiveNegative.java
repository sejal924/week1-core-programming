/*checking whether the number is positive , negative or zero and also odd even 
 also comparing first number and last number*/
import java.util.Scanner;

public class PositiveNegative{
    public static void main(String[] args){
	    Scanner sc= new Scanner(System.in);
		
		//creating an array of size 5
		int[] number = new int[5];
		for(int i=0; i<5;i++){
			//taking an input number from user
		   System.out.print("Enter the number" + (i+1) +": ");
		   number[i] = sc.nextInt();
		}
		for(int i=0; i<number.length; i++){
			//checking the number is positive or not 
		    if(number[i]>0){
				//checking the number even or not
			   if(number[i]%2==0){
			     System.out.println("The number" + (i+1) + " is positive even number");
			   }
			   //printing the number is positive odd
			   else{
			     System.out.println("The number" + (i+1) + " is positive odd number");
			   }
			}
			//checking the number is negative or not
			else if(number[i]<0){
			   System.out.println("The number" + (i+1) + " is negative number");
			}
			//printing the number is zero
			else{
			  System.out.println("The number" + (i+1) + " is zero number");
			}
		}
		//comparing the first and last number
		if(number[0] > number[number.length-1]){
		   System.out.println("The first number is grater than last number"); 
		}
		else if(number[0] < number[number.length-1]){
		   System.out.println("The last number is grater than first number"); 
		}
		else{
		  System.out.println("The last number is equal to first number"); 
		}
	}
}