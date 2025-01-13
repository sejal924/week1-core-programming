import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking input from the user
        System.out.print("Enter the first number: ");
        int number = sc.nextInt();

        // determing whether the number is natural numbe ror not
        if (number > 0) {

            // calculating sum of n numbers
            int sum = (number * (number + 1)) / 2;

            // printing result
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number.");
        }

    }
}