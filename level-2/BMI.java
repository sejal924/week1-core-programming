//finding the BMI of a person
import java.util.Scanner;

public class BMI
{
     public static void main(String [] args)
	 {
		 //creating scanner object for user input
	      Scanner sc = new Scanner(System.in);
		  System.out.print("Enter weight (in kg) of the person: ");
		  //taking input weight from user
		  double weight = sc.nextDouble();
		  
		  System.out.print("Enter height (in cm) of the person: ");
		  //taking input height from user
		  double height = sc.nextDouble();
		  
		  //converting height(in cm) to height(in m)
		  double heightInMeter = height/100;
		   
		  //calculating BMI
		  double BMI =  weight/(heightInMeter * heightInMeter);
		  
		  //checking BMI condition
		  if(BMI <= 18.4){
		      System.out.print("Underweight");
		  }
		  else if(BMI >=18.5 && BMI <=24.9){
		       System.out.print("Normal");
		  }
		  else if(BMI >=25.0 && BMI <=39.9){
		       System.out.print("Overweight"); 
		  }
		  else {
		  System.out.print("Obese");
		  }
		    
	 }
}