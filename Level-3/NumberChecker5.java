import java.util.Scanner;
import java.lang.Math;

public class NumberChecker5 {
    
	//method to check prime number
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    
	//method to check neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == number;
    }
    
	//method to check number is spy number
    public static boolean isSpy(int number) {
        int sum = 0;
        int product = 1;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }
    
	//method to check number is automprphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String numStr = Integer.toString(number);
        String squareStr = Integer.toString(square);
        return squareStr.endsWith(numStr);
    }
    
	//method to check number is buzz number or not
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		//taking the input from user
        int number = sc.nextInt(); 
        
		//printing result
        if (isPrime(number)) {
            System.out.println("It's a Prime Number");
        } else {
            System.out.println("It's not a Prime Number");
        }

        if (isNeon(number)) {
            System.out.println("It's a Neon Number");
        } else {
            System.out.println("It's not a Neon Number");
        }

        if (isSpy(number)) {
            System.out.println("It's a Spy Number");
        } else {
            System.out.println("It's not a Spy Number");
        }

        if (isAutomorphic(number)) {
            System.out.println("It's an Automorphic Number");
        } else {
            System.out.println("It's not an Automorphic Number");
        }

        if (isBuzz(number)) {
            System.out.println("It's a Buzz Number");
        } else {
            System.out.println("It's not a Buzz Number");
        }
    }
}