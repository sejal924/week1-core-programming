import java.util.Scanner;

public class UnitConverter5 {

	//method to convert yards to feet
    public static double convertYardsToFeet(double yards){
		double yardsToFeet = 3;
        return yards * yardsToFeet;
    }
    
	//method to convert feet to yards
    public static double convertFeetToYards(double feet) {
		double feetToYards = 0.333333;
        return feet * feetToYards;
    }
    
	//method to convert meters to inches
    public static double convertMetersToInches(double meters) {
		double metersToInches = 39.3701;
        return meters *  metersToInches;
    }
    
	//method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
		double inchesToMeters = 0.0254;
        return inches * inchesToMeters;
    }
	
	//method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
		double inchesToCentimeters = 2.54;
        return inches * inchesToCentimeters;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
		//taking the input yards from user
        System.out.print("Enter value in yards: ");
        double yards = sc.nextDouble();
        double feet = convertYardsToFeet(yards);
        System.out.println(yards + " yards is equal to " + feet + " feet.");
        
		//taking the input feet from user
        System.out.print("Enter value in feet: ");
        feet = sc.nextDouble();
        yards = convertFeetToYards(feet);
        System.out.println(feet + " feet is equal to " + yards + " yards.");
        
		//taking the input meter from user
        System.out.print("Enter value in meters: ");
        double meters = sc.nextDouble();
        double inches = convertMetersToInches(meters);
        System.out.println(meters + " meters is equal to " + inches + " inches.");
        
		//taking the input inches from user
        System.out.print("Enter value in inches: ");
        inches = sc.nextDouble();
        meters = convertInchesToMeters(inches);
        System.out.println(inches + " inches is equal to " + meters + " meters.");
		
		//taking the input inches from user
        System.out.print("Enter value in inches: ");
        inches = sc.nextDouble();
        double centiMeters = convertInchesToCentimeters(inches);
        System.out.println(inches + " inches is equal to " + centiMeters + " centimeters.");
		
		sc.close();
    }
}