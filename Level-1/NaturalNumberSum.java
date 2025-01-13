import java.util.Scanner;

public class NaturalNumberSum {

    // Method to find the sum of n natural numbers
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        //taking input Number of natural numbers
        System.out.print("Enter the value of number: ");
        int number = sc.nextInt();

        // Calculate the sum of n natural numbers
        int sum = calculateSum(number);

        // Output the result
        System.out.println("The sum of the first " + number + " natural numbers is: " + sum);
        }
}