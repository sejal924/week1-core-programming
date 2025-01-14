import java.util.*;

public class NumberChecker {

    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static int[] storeDigits(int number, int count) {
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i=0;i<digits.length ; i++) {
            if (digits[i] == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isArmstrongNumber(int number, int[] digits, int count) {
        int sum = 0;
        for (int i=0;i<digits.length ; i++) {
            sum += Math.pow(digits[i], count);
        }
        return sum == number;
    }

    public static int findLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        for (int i=0; i<digits.length ; i++) {
            if (digits[i] > largest) {
                largest = digits[i];
            }
        }
        return largest;
    }

    public static int findSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i=0; i<digits.length ; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        return secondLargest;
    }

    public static int findSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        for (int i=0; i<digits.length ; i++) {
            if (digits[i] < smallest) {
                smallest = digits[i];
            }
        }
        return smallest;
    }

    public static int findSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i=0; i<digits.length ; i++) {
            if (digits[i] < smallest) {
                secondSmallest = smallest;
                smallest = digits[i];
            } else if (digits[i] < secondSmallest && digits[i] != smallest) {
                secondSmallest = digits[i];
            }
        }
        return secondSmallest;
    }

    public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter the number: ");
        int number = sc.nextInt();

        int count = countDigits(number);
        int[] digits = storeDigits(number, count);

        System.out.println("Number: " + number);
        System.out.println("Digit Count: " + count);
        System.out.println("Digits: " + Arrays.toString(digits));

        if (isDuckNumber(digits)) {
            System.out.println("It's a Duck Number");
        } else {
            System.out.println("It's not a Duck Number");
        }

        if (isArmstrongNumber(number, digits, count)) {
            System.out.println("It's an Armstrong Number");
        } else {
            System.out.println("It's not an Armstrong Number");
        }

        System.out.println("Largest Digit: " + findLargest(digits));
        System.out.println("Second Largest Digit: " + findSecondLargest(digits));
        System.out.println("Smallest Digit: " + findSmallest(digits));
        System.out.println("Second Smallest Digit: " + findSecondSmallest(digits));
		
		sc.close();
    }
}