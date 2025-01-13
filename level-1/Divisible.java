//finding number is divisible by 5 or not
import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        
		//Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // taking input from the user
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        // determining whether the number is divisible by 5 or not
        if (number % 5 == 0) {
            System.out.println("Is the number " + number + " divisible by 5 ? Yes");
        } else {
            System.out.println("Is the number " + number + " divisible by 5 ? NO");
        }

        sc.close();
    }
}