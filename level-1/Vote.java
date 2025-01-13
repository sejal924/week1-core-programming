import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking input from the user
        System.out.print("Enter the age of a person: ");
        int age = sc.nextInt();

        // determing whether the person is elligible for vote or not
        if (age >= 18) {
            System.out.println("The persons's age is " + age + " and he can vote.");
        } else {
            System.out.println("The persons's age is " + age + " and he cannot vote.");
        }

    }
}