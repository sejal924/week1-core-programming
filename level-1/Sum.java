import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking input from the user
        System.out.println("Enter the number:");
        double num = sc.nextDouble();

        // creating variable to store total addition
        double total = 0;

        // checking whether has entered 0 or not
        // if entered number is 0 then terminate the loop
        // else add num to total and taking input again
        while (num != 0) {
            total = total + num;
            System.out.print("Enter the number again:");
            num = sc.nextDouble();
        }

        // printing the result
        System.out.println("The total value is: " + total);

        sc.close();
    }
}