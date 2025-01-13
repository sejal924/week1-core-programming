import java.util.Scanner;

public class UnitConvertor6 {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    // Main method for testing the conversions
    public static void main(String[] args) {
       
	   Scanner sc = new Scanner(System.in);
        
		//taking the input fahrenheit from user
        System.out.print("Enter value in fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celsius = convertFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " fahrenheit is equal to " + celsius + " celsius.");
        
		//taking the input celsius from user
        System.out.print("Enter value in celsius: ");
        celsius = sc.nextDouble();
        fahrenheit = convertCelsiusToFahrenheit(celsius);
        System.out.println(celsius + " celsius is equal to " + fahrenheit + " fahrenheit.");
        
		//taking the input pounds from user
        System.out.print("Enter value in pounds: ");
        double pounds = sc.nextDouble();
        double kilograms = convertPoundsToKilograms(pounds);
        System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms.");
        
		//taking the input kilograms from user
        System.out.print("Enter value in kilograms: ");
        kilograms = sc.nextDouble();
        pounds = convertKilogramsToPounds(kilograms);
        System.out.println(kilograms + " kilograms is equal to " + pounds + " pounds.");
		
		//taking the input gallons from user
        System.out.print("Enter value in gallons: ");
        double gallons = sc.nextDouble();
        double liters = convertGallonsToLiters(gallons);
        System.out.println(gallons + " gallons is equal to " + liters + " liters.");
		
		//taking the input liters  from user
        System.out.print("Enter value in liters : ");
        liters  = sc.nextDouble();
        gallons = convertLitersToGallons(liters );
        System.out.println(liters  + " liters  is equal to " + gallons + " gallons.");
		
		sc.close();
    }
}