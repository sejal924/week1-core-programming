//finding the smallest number
import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking input from the user
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();

        // taking input from the user
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        // taking input from the user
        System.out.print("Enter the third number: ");
        int number3 = sc.nextInt();

        // determining whether the first number is smallest or not
        if (number1 <= number2 && number1 <= number3) {
            System.out.println("Is the first number the smallest? Yes");
        } else {
            System.out.println("Is the first number the smallest? No");
        }
    }
}