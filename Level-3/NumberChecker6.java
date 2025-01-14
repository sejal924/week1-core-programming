/*import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;*/

import java.util.*;

public class NumberChecker6 {
    //method to find factor
    public static int[] findFactors(int number) {
        List<Integer> factorsList = new ArrayList<>();
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                factorsList.add(i);
            }
        }
        int[] factors = new int[factorsList.size()];
        for (int i = 0; i < factorsList.size(); i++) {
            factors[i] = factorsList.get(i);
        }
        return factors;
    }
    
	//method to find greatest factor
    public static int findGreatestFactor(int[] factors) {
        int greatestFactor = 0;
        for (int i=0; i<factors.length; i++) {
            if (factors[i] > greatestFactor) {
                greatestFactor = factors[i];
            }
        }
        return greatestFactor;
    }
    
	//method to fid sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int i=0; i<factors.length; i++) {
            sum += factors[i];
        }
        return sum;
    }
    
	//method to find product of factor
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int i=0; i<factors.length; i++) {
            product *= factors[i];
        }
        return product;
    }
    
	//method to find product cube of factors
    public static int productOfCubeOfFactors(int[] factors) {
        int product = 1;
        for (int i=0; i<factors.length; i++) {
            product *= Math.pow(factors[i], 3);
        }
        return product;
    }
    
	//method to find perfect number
    public static boolean isPerfectNumber(int number, int[] factors) {
        return sumOfFactors(factors) == number;
    }
    
	//method to find abundant number
    public static boolean isAbundantNumber(int number, int[] factors) {
        return sumOfFactors(factors) > number;
    }
    
	//method to find deficient number
    public static boolean isDeficientNumber(int number, int[] factors) {
        return sumOfFactors(factors) < number;
    }
    
	//method to find strong number
    public static boolean isStrongNumber(int number) {
        int temp = number;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    private static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		//taking input from user
        int number = sc.nextInt();
        
        int[] factors = findFactors(number);
        System.out.println("Factors of " + number + ": " + Arrays.toString(factors));
        
		//printing the results
        System.out.println("Greatest Factor: " + findGreatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(factors));

        if (isPerfectNumber(number, factors)) {
            System.out.println("It's a Perfect Number");
        } else if (isAbundantNumber(number, factors)) {
            System.out.println("It's an Abundant Number");
        } else if (isDeficientNumber(number, factors)) {
            System.out.println("It's a Deficient Number");
        }

        if (isStrongNumber(number)) {
            System.out.println("It's a Strong Number");
        } else {
            System.out.println("It's not a Strong Number");
        }
    }
}