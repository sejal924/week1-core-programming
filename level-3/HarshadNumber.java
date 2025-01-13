import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

       //defining sum variable 
       int sum=0;
       int originalNumber=number;

       //calculating harshad number using while loop
       while(originalNumber != 0 ){
           int remainder = originalNumber % 10;
		   sum = sum + remainder ;
           originalNumber = originalNumber / 10 ;
          
        
       }

       //printing the output
       if(number%sum==0){
        System.out.println("It's an Harshad number");
       }else{
         System.out.println("It's not an Harshad number");
       }
    }
}