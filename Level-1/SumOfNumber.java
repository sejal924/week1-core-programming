import java.util.Scanner;

public class SumOfNumber{
   public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
		
		//taking the input numbers from user
		System.out.print("Enter the number: ");
		double numbers = sc.nextDouble(); 
		
		//creating an array of size 10
		double[] arr = new double[10];
		//creating the variable totalSum , index
		double totalSum = 0.0;
		int index=0;
		
		//adding the numbers to array
		while(index<=10 && numbers!=0 && numbers>0){
		   arr[index]=numbers;
		   index++;
		   System.out.print("Enter the number: ");
		   numbers = sc.nextDouble();
		   
		}
		//printing the numbers
		for(int i=0;i<index;i++){
		   System.out.println("The number" + (i+1) + " is" + arr[i]);
		}
		//printing the totalSum
		for(int i=0;i<index;i++){
		   totalSum+=arr[i];
		}
		System.out.print("The total value of all numbers" + totalSum);
   }
}