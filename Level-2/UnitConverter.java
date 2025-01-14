import java.util.Scanner;

public class UnitConverter {

	//method to convert kilometer to miles
    public static double convertKmToMiles(double km) {
		double kmToMiles = 0.621371;
        return km * kmToMiles;
    }
    
	//method to convert miles to kilometer
    public static double convertMilesToKm(double miles) {
		double milesToKm = 1.60934;
        return miles * milesToKm;
    }
    
	//method to convert meter to feet
    public static double convertMetersToFeet(double meters) {
		double metersToFeet = 3.28084;
        return meters *  metersToFeet;
    }
    
	//method to convert  feet to meter 
    public static double convertFeetToMeters(double feet) {
		double feetToMeters = 0.3048;
        return feet * feetToMeters;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
		//taking the input kilometer from user
        System.out.print("Enter distance in kilometers: ");
        double km = sc.nextDouble();
        double miles = convertKmToMiles(km);
        System.out.println(km + " kilometers is equal to " + miles + " miles.");
        
		//taking the input miles from user
        System.out.print("Enter distance in miles: ");
        miles = sc.nextDouble();
        km = convertMilesToKm(miles);
        System.out.println(miles + " miles is equal to " + km + " kilometers.");
        
		//taking the input meter from user
        System.out.print("Enter distance in meters: ");
        double meters = sc.nextDouble();
        double feet = convertMetersToFeet(meters);
        System.out.println(meters + " meters is equal to " + feet + " feet.");
        
		//taking the input feet from user
        System.out.print("Enter distance in feet: ");
        feet = sc.nextDouble();
        meters = convertFeetToMeters(feet);
        System.out.println(feet + " feet is equal to " + meters + " meters.");
    }
}