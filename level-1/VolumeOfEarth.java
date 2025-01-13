//calculating the volume of Earth in km^3 and miles^3
 
import java.util.*;

//creating the VolumeOfEarth class
public class VolumeOfEarth
{
   public static void main(String [] args)
   {
	 //creating the variable radius 
     int radius = 6378 ;
	 
	 //calculating the volume in cubic kilometers
	 double volumeInKilometer = (4/3)*3.14*radius*radius*radius;
	 
	 //converting the radius into miles 
	 double radiusOfMiles = radius/1.6;
	 
	 //calculating the volume in cubic miles
	 double volumeInMile = (4/3)*3.14*radiusOfMiles*radiusOfMiles*radiusOfMiles ;
	 
	 //printing the calculated volumeInKilometer and volumeInMile
	 System.out.print("The volume of earth in cubic kilometers is "+ volumeInKilometer + " and cubic miles is " +volumeInMile );

   }
}