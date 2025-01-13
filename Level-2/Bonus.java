import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating arrays
        double[] oldSalary = new double[10];
        double[] yearOfService = new double[10];
        double[] newSalary = new double[10];
        double[] bonus = new double[10];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Taking input for salaries and years of service
        for (int i = 0; i < 10; i++) {
            // Input for salary
            do {
                System.out.print("Enter salary for employee " + (i + 1) + ": ");
                oldSalary[i] = sc.nextDouble();
                if (oldSalary[i] < 0) {
                    System.out.println("Invalid salary ,enter a salary again");
                }
            } while (oldSalary[i] < 0);

            // Input  for years of service
            do {
                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                yearOfService[i] = sc.nextDouble();
                if (yearOfService[i] < 0) {
                    System.out.println("Invalid years of service,enter a year of survice again.");
                }
            } while (yearOfService[i] < 0);

            totalOldSalary += oldSalary[i];
        }

        // Calculating bonus, total bonus, new salary, and total new salary
        for (int i = 0; i < 10; i++) {
            if (yearOfService[i] > 5) {
                bonus[i] = oldSalary[i] * 0.05;
            } else {
                bonus[i] = oldSalary[i] * 0.02;
            }
            totalBonus += bonus[i];
            newSalary[i] = bonus[i] + oldSalary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("The total bonus amount the company Zara has to pay: " + totalBonus);
        System.out.println("The total old salary of all the employees is:  " + totalOldSalary);
        System.out.println("The total new salary of all the employees is: " + totalNewSalary);

    }
}