import java.util.Scanner;

public class NumberChecker {

    // Method to check if a number is positive
    public boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check if a number is even
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    public int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        // Create an instance of NumberChecker
        NumberChecker obj = new NumberChecker();

        // Array to store 5 numbers
        int[] numbers = new int[5];

        // Scanner to take user input
        Scanner sc = new Scanner(System.in);

        // Taking input for the array
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // Loop through the array to check conditions
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + numbers[i] + " is ");
            if (obj.isPositive(numbers[i])) {
                System.out.print("positive and ");
                if (obj.isEven(numbers[i])) {
                    System.out.println("even.");
                } else {
                    System.out.println("odd.");
                }
            } else {
                System.out.println("negative.");
            }
        }

        // Compare the first and last elements of the array
        int comparisonResult = obj.compare(numbers[0], numbers[numbers.length - 1]);
        if (comparisonResult == 1) {
            System.out.println("The first number is greater than the last number.");
        } else if (comparisonResult == 0) {
            System.out.println("The first and last numbers are equal.");
        } else {
            System.out.println("The first number is less than the last number.");
        }

        sc.close();
    }
}
