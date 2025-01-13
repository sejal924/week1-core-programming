import java.util.Scanner;

public class SimpleInterest {

    // Method to calculate simple interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        //taking input principal from user
        System.out.print("Enter the Principal amount: ");
        double principal = scanner.nextDouble();

        //taking input rate from user
        System.out.print("Enter the Rate of Interest: ");
        double rate = scanner.nextDouble();

        //taking input time from user
        System.out.print("Enter the Time in years: ");
        double time = scanner.nextDouble();

        // Calculating simple interest
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        // printing the result
        System.out.printf("The Simple Interest is " +  simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time + " years");
    }
}