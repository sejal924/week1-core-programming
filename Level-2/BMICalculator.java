import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI for each person and populate the 2D array
    public void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100; // Convert height from cm to meters
            data[i][2] = weight / (heightInMeters * heightInMeters); // Calculate BMI
        }
    }

    // Method to determine BMI status for each person
    public String[] determineBMIStatus(double[][] data) {
        String[] statuses = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                statuses[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }
        return statuses;
    }

    public static void main(String[] args) {
        // Create an instance of BMICalculator
        BMICalculator calculator = new BMICalculator();

        // 2D array to store weight, height, and BMI
        double[][] data = new double[10][3];

        // Scanner to take user input
        Scanner sc = new Scanner(System.in);

        // taking weight and height of each person
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }

        // Calculate BMI for each person
        calculator.calculateBMI(data);

        // Determine BMI statuses for each person
        String[] statuses = calculator.determineBMIStatus(data);

        // Display the results
        for (int i = 0; i < data.length; i++) {
            System.out.println("Weight of the person " + (i+1) + " is " + data[i][0] + " , height is " + data[i][1] + " , calculated BMI is " + data[i][2] +" and status is " + statuses[i]);
        }

        sc.close();
    }
}
