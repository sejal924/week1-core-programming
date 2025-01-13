import java.lang.Math;
import java.util.Scanner;

public class Quadratic {

    public  double[] findRoots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            // Two distinct real roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            // One real root
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            // No real roots (imaginary roots)
            return new double[0]; // Return an empty array
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
		// Take input  a, b, and c
        System.out.print("Enter the value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter the value of c: ");
        double c = sc.nextDouble();
        
		// Create an instance of Quadratic
		Quadratic obj = new Quadratic();
		
		// Find the roots of the quadratic equation
        double[] roots = obj.findRoots(a, b, c);
        
		//displaying the result
        if (roots.length == 0) {
            System.out.println("No real roots.");
        } else if (roots.length == 1) {
            System.out.println("One real root: " + roots[0]);
        } else {
            System.out.println("Two real roots: " + roots[0] + ", " + roots[1]);
        }

        sc.close();
    }
}