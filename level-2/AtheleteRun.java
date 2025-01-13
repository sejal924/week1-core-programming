import java.util.*;

public class AtheleteRun {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking input of side1
        System.out.print("Enter the length of first side of park in meter: ");
        double side1 = sc.nextDouble();

        // taking input of side2
        System.out.print("Enter the length of second side of park in meter: ");
        double side2 = sc.nextDouble();

        // taking input of side3
        System.out.print("Enter the length of third side of park in meter: ");
        double side3 = sc.nextDouble();

        // calculating the perimeter of park
        double perimeter = side1 + side2 + side3;

        // calculating the total number of round around the park come under 5km
        double round = 5000 / perimeter;

        // printing the output
        System.out.print("The total number of rounds the athlete will run is " + round + " to complete 5 km.");

        sc.close();
    }
}