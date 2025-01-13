import java.util.Scanner;

public class ChocolateDivider {

    // Method to find the chocolates per child and  remaining chocolates
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;
		
        return new int[]{chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        //taking input number of chocolates from user
        System.out.print("Enter the total number of chocolates: ");
        int numberOfChocolates = sc.nextInt();

        //taking input number of children from user
        System.out.print("Enter the total number of children: ");
        int numberOfChildren = sc.nextInt();

            // Find the quotient and remainder
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            // Output the result
            System.out.println("Each child gets " + result[0] + " chocolates.");
            System.out.println("Remaining chocolates: " + result[1]);
  
    }
}