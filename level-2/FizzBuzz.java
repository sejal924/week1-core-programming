import java.util.Scanner;

public class FizzBuzz
{
 public static void main(String[] args)
    {
		//creating scanner object for user input
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter number: ");
	   //taking the input number
	   int number = sc.nextInt();
	   
	   if(number>0)
	   { 
              System.out.println(0);
			  //printing number
	          for(int i=1 ;i<=number;i++){
				  //checking whether number is divisible by 3 and 5 or not
			        if(i%3==0 && i%5==0){
					System.out.println("FizzBuzz");
					}
					//checking whether number is divisible by 3 or not
                    else if(i%3==0){
					System.out.println("Fizz");
					}
					//checking whether number is divisible by 5 or not
                    else if(i%5==0){
					 System.out.println("Buzz");
					} 
					//printing number
                    else{
					   System.out.println(i);
                     }					
			  }
	   }
	}
}