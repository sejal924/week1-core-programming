import java.util.Scanner;

public class ReverseTheNumber{
    public static void main(String [] args){
	    Scanner sc = new Scanner(System.in);
		
		// Taking input number from user
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		int originalNumber = number;
		int count =0;
		//counting the digits in the number
		while(originalNumber != 0 ){
           count++;
           originalNumber= originalNumber/10;
       }
	   //creating an array of size count
		int[] arr = new int[count];
		int i=0;
		//assisgning the digits of a number to array
		while(number>0){
		   int remainder = number%10;
		   arr[i] = remainder;
		   number = number/10;
		   i++;
		}
		//printing the reverse of the number
		System.out.print("reverse of the number is: ");
		for(int j=0; j<count; j++){
		    System.out.print(arr[j]);
		}
	 }
}