import java.util.Scanner;

public class QuotientAndRemainder {

    // Method to find the remainder and quotient of a number
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        //taking input two integers from user
        System.out.print("Enter the first number (dividend): ");
        int number = sc.nextInt();

        System.out.print("Enter the second number (divisor): ");
        int divisor = sc.nextInt();

        // Check if divisor is 0 to avoid division by zero
        if (divisor == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            // Find the quotient and remainder
            int[] result = findRemainderAndQuotient(number, divisor);

            // printing the result
            System.out.println("The quotient is: " + result[0]);
            System.out.println("The remainder is: " + result[1]);
        }

    }
}