// using the while loop
import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking input from the user
        System.out.println("Enter the count down number to start:");
        int number = sc.nextInt();

        if (number > 0) {
            // using while loop count down the number
            while (number > 0) {
                System.out.println(number + " ");
                number--;
            }
        } else {
            System.out.println("Number is not a natural number.");
        }

        
    }
}