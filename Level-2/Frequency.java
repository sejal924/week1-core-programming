import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input number
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        // Array to store frequency of digits (0-9)
        int[] frequency = new int[10];

        // Calculate frequencies
        while (number > 0) {
			 // Extract the last digit
            int remainder = number % 10;
			 // Increment the count for that digit
            frequency[remainder]++;  
            // Remove the last digit			
            number = number / 10;      
        }

        // Display frequencies
        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
    }
}