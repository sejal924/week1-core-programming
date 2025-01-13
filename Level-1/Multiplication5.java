import java.util.Scanner;

public class Multiplication5{
   public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
	   //creating the variable number
	   int number;
	   //checking whether the number is between 6 to 9 by using do-while
	   do{
	   System.out.print("Enter the number : ");
	   //taking the input number from user
	    number = sc.nextInt();
	   }while(number <6 || number>9);
	   
	   //creating an array
	   int[] multipleResult = new int[10];
	   for(int i=1;i<=10; i++){
		   //multiplying
		   multipleResult[i-1]= number*i;
		}
		//printing the table
		for(int i=1;i<=10; i++){
		  System.out.println(number + "*" + i +" = " + multipleResult[i-1]);
		}
	   
}
}