import java.util.*;

public class AtheleteRun {
    
	public static double calculateRound(double s1 , double s2 ,double s3){
	    // calculating the perimeter of park
        double perimeter = s1 + s2 + s3; 
		
        // calculating the total number of round around the park come under 5km
        double round = 5000 / perimeter;  	
         
        return round;		 
	}
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
		
		double result = calculateRound(side1, side2, side3);

        // printing the output
        System.out.print("The total number of rounds the athlete will run is " + result + " to complete 5 km.");

    }
}