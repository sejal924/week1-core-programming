//finding area of a triangle in square inches and square centimeters 

import java.util.*;

//creating the AreaOfTriangle class
public class AreaOfTriangle
{
   public static void main(String [] args)
   { 
       //Creating a Scanner object for user input
       Scanner sc = new Scanner(System.in);
	   System.out.print("Enter base of a triangle in feet: ");
	   //taking input the base from user
	   double base = sc.nextDouble();
	   
	   System.out.print("Enter height of a triangle in feet: ");
	   //taking the input height from user
	   double height = sc.nextDouble();
	   
	   //converting height(feet) into inches
	   double heightInches = height*12;
	   //converting base(feet) into inches
	   double baseInches = base*12;
	   
	   //converting height(feet) into centimeter
	   double heightCentimeter = height*12*2.54;
	    //converting base(feet) into centimeter
	   double baseCentimeter = height*12*2.54;
	   
	   //calculating the area of a triangle in square inches
	   double squareInches = baseInches*heightInches*1/2;
	   
	   //calculating the area of a triangle in square centimeter
	   double squareCentimeter = baseCentimeter*heightCentimeter*1/2;
	   
	   //printing the calculated value of squareInches and squareCentimeter
	   System.out.print("Area of a triangle in square inches is " +squareInches +" and in square centimeters is " +squareCentimeter);
   }
}