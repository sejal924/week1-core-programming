
 import java.util.Scanner;

public class LargestNumber {
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

        // determining whether the first number is largest or not
        if (number1 >= number2 && number1 >= number3) {
            System.out.println("Is the first number the largest? Yes");
        } else {
            System.out.println("Is the first number the largest? No");
        }

        // determining whether the second number is largest or not
        if (number2 >= number1 && number2 >= number3) {
            System.out.println("Is the second number the largest? Yes");
        } else {
            System.out.println("Is the second number the largest? No");
        }

        // determining whether the third number is largest or not
        if (number3 >= number1 && number3 >= number2) {
            System.out.println("Is the third number the largest? Yes");
        } else {
            System.out.println("Is the third number the largest? No");
        }
    }
}

