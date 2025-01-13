import java.util.*;

public class TrigonometricFunctions {

    public static double[] calculateTrigonometric(double angle) {
        // Convert the angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Return the results in an array
        return new double[] {sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		//taking input angel from user
        System.out.print("Enter the angle: ");
		double angle= sc.nextDouble();

        // Calculate the trigonometric functions
        double[] results = calculateTrigonometric(angle);

        // printing the results
        System.out.println("Sine of " + angle + " degrees: " + results[0]);
        System.out.println("Cosine of " + angle + " degrees: " + results[1]);
        System.out.println("Tangent of " + angle + " degrees: " + results[2]);
    }
}