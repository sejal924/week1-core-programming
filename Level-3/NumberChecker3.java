import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker3 {
    
	//create the method to count digits
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }
    
	//create the method to store the digits
    public static int[] storeDigits(int number, int count) {
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }
    
	//create the method to add the digits 
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int i=0; i<digits.length; i++) {
            sum += digits[i];
        }
        return sum;
    }
    
	//create the method to add sum of sqaure of digit
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int i=0; i<digits.length;i++) {
            sum += Math.pow(digits[i], 2);
        }
        return sum;
    }
    
	//method to check harshad number
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sumOfDigits = sumOfDigits(digits);
        return number % sumOfDigits == 0;
    }
    
	
	//method to calculate frequency
    public static int[][] findDigitFrequencies(int[] digits) {
        int[][] frequencies = new int[10][2]; // 10 possible digits (0-9)

        for (int i = 0; i < digits.length; i++) {
            frequencies[digits[i]][0] = digits[i]; // Store the digit
            frequencies[digits[i]][1]++; // Increment frequency
        }

        return frequencies;
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		//taking input from user
        int number = sc.nextInt();

        int count = countDigits(number);
        int[] digits = storeDigits(number, count);
        
		
		//printing the results
        System.out.println("Number: " + number);
        System.out.println("Digit Count: " + count);
        System.out.println("Digits: " + Arrays.toString(digits));

        System.out.println("Sum of Digits: " + sumOfDigits(digits));
        System.out.println("Sum of Squares of Digits: " + sumOfSquares(digits));

        if (isHarshadNumber(number, digits)) {
            System.out.println("It's a Harshad Number");
        } else {
            System.out.println("It's not a Harshad Number");
        }

        System.out.println("Digit Frequencies:");
        int[][] frequencies = findDigitFrequencies(digits);
        for (int i=0;i< frequencies.length;i++) {
            if (frequencies[i] > 0) { 
			// Print only digits that actually occur
                System.out.println(frequencies[0] + ": " + frequencies[1] + " times");
            }
        }
		
		 /*System.out.println("Digit Frequencies:");
        int[][] frequencies = findDigitFrequencies(digits);
        for (int[] row : frequencies) {
            if (row[1] > 0) { 
			// Print only digits that actually occur
                System.out.println(row[0] + ": " + row[1] + " times");
            }
        }*/
    }
}