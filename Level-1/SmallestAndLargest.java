import java.util.Scanner;

public class SmallestAndLargest {

    // Method to find the smallest and largest numbers using if-else
    public static int[] findSmallestLargest(int number1, int number2, int number3) {
        int smallest = number1;
        int largest = number1;

        // Find the smallest number
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }

        // Find the largest number
        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }

        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        //taking input three numbers from user
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        // Finding the smallest and largest numbers
        int[] result = findSmallestLargest(number1, number2, number3);

        //printing the result
        System.out.println("The smallest number is: " + result[0]);
        System.out.println("The largest number is: " + result[1]);
    }
}