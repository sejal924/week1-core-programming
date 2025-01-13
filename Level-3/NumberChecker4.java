import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker4 {
    
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
    
	//method to reverse the array
    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }
    
	//method to check arrays are equal or not
    public static boolean arraysAreEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }
    
	//method to check isPalindrome
    public static boolean isPalindrome(int[] original, int[] reversed) {
        return arraysAreEqual(original, reversed);
    }
    
	//method to check duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int i=0;i<digits.length;i++) {
            if (digits[i] == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		//taking input from user
        int number = sc.nextInt();

        int count = countDigits(number);
        int[] digits = storeDigits(number, count);
        int[] reversedDigits = reverseArray(digits);
        
		//printing the result
        System.out.println("Number: " + number);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Reversed Digits: " + Arrays.toString(reversedDigits));

        if (isPalindrome(digits, reversedDigits)) {
            System.out.println("It's a Palindrome");
        } else {
            System.out.println("It's not a Palindrome");
        }

        if (isDuckNumber(digits)) {
            System.out.println("It's a Duck Number");
        } else {
            System.out.println("It's not a Duck Number");
        }
		
		sc.close();
    }
}