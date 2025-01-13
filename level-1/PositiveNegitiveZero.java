import java.util.Scanner;

public class PositiveNegitiveZero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking input from the user
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        // determing whether the person is elligible for vote or not
        if (number > 0) {
            System.out.println("Number is Positive");
        } else if (number < 0) {
            System.out.println("Number is Negative");
        } else {
            System.out.println("Number is Zero");
        }

    }
}