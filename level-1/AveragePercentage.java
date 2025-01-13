//Finding the average percent mark in PCM

import java.util.*;
 
 //creating the AveragePercent class
public class AveragePercentage 
{ 
      public static void main(String [] args)
      {  
	      //creating the variable math,physics,chemistry
          int math = 94;
          int physics = 95;
          int chemistry =96;
		  
		  //calculating percentage 
          double percentage = (math+physics+chemistry)*100/300;
		  
		  // printing calculated percentage
          System.out.print("Sam's average mark in PCM is: " + percentage);
      }
}