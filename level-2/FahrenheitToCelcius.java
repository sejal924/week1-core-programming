//converting temperature fahrenheit to celcius
import java.util.*;

//creating the FahrenheitToCelcius class
public class FahrenheitToCelcius
{
    public static void main(String[] args)
	{
	    //Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);
		
		//taking the input temperature from user
		System.out.print("Enter the temperature: ");
		double fahrenheit = sc.nextDouble();
		
		//calculating the temperature in celcius
		double celciusResult = (fahrenheit-32)*5/9 ;
		
		//printing the value of farenheit and celcius 
		System.out.print("The " + fahrenheit +" fahrenheit is " + celciusResult +" celcius");
		 
	}
	
}