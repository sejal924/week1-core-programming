import java.util.Scanner;

public class SumOfNaturalNumbers {
    
	//method to calculate the sum of natural number by recursive method
	public static int sumOfNaturalNumbersRecursive(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumOfNaturalNumbersRecursive(n - 1);
        }
    }
    
	//method to calculate the sum of natural number by formula
    public static int sumOfNaturalNumbersFormula(int n) {
        return (n * (n + 1)) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		//taking the input from user
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();
        
		//checking number is valid or not
        if (number <= 0) {
            System.err.print("error");
        }
        else{
        int recursiveSum = sumOfNaturalNumbersRecursive(number);
        int formulaSum = sumOfNaturalNumbersFormula(number);
        
		//printing the sum
        System.out.println("Sum of first " + number + " natural numbers (recursive): " + recursiveSum);
        System.out.println("Sum of first " + number + " natural numbers (formula): " + formulaSum);
		
		//checking whether both result match or not
        if (recursiveSum == formulaSum) {
            System.out.println("Both results match");
        } else {
            System.out.println("Results do not match");
        }
     }
	}
}