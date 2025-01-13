//converting temperature celcius to fahrenheit
import java.util.*;

//creating the CelciusToFahrenheit class
public class CelciusToFahrenheit
{
    public static void main(String[] args)
	{
	    //Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);
		
		//taking the input temperature from user
		System.out.print("Enter the temperature: ");
		double celcius = sc.nextDouble();
		
		//calculating the temperature in fahrenheit
		double farenheitResult = (celcius*9/5) + 32;
		
		//printing the value of celcius and farenheit
		System.out.print("The " + celcius +" celsius is " + farenheitResult +" fahrenheit");
		 
	}
	
}