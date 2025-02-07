import java.util.Scanner;

public class FibonacciSequenceGenerator{
	
	//method to display fibonacci series
	public static void fibonacciSeries(int number){
		int a=0, b=1;
		System.out.print(a+ " " +b);
		for(int i=3;i<=number;i++){
			int fib=a+b;
			a=b;
			b=fib;
			System.out.print(" " + fib);
		}
	}
	
	public static void main(String[] args){
		Scanner scanner =new Scanner(System.in);
		
		//taking input from the user
		System.out.println("Enter a Number:");
		int number = scanner.nextInt();
		
		//displaying the fibonacci series 
		fibonacciSeries(number);
		
		scanner.close();
	}
}