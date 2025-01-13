import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input number from user
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        // Creating the variable maxFactor
        int maxFactor = 10;

        // Creating the array of size maxFactor
        int[] factor = new int[maxFactor];
        int index = 0;

        // Finding factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
			// Checking the factors
                // Expand the array if needed
                if (index == maxFactor) {
                    maxFactor *= 2; 
					// Double the size
                    int[] temp = new int[maxFactor];
                    for (int j = 0; j < index; j++) {
                        temp[j] = factor[j];
                    }
                    factor = temp;
                }

                factor[index] = i;
                index++;
            }
        }

        // Printing the factors
        System.out.print("Factors are: ");
        for (int k = 0; k < index; k++) { 
            System.out.print(factor[k] + " ");
        }
    }
}