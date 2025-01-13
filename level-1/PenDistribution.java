//finding the pen distributed per student and remaining non- distributed pen
import java.util.*;

//creating the PenDistribution class
public class PenDistribution
{
   public static void main(String [] args)
   {
	  //creating the variable pens and students
      int pens = 14;
	  int students = 3;
	  
	  // calculating the distributedPen
	  int distributedPen = pens/students;
	  
	  // calculating the nonDistributedPen
	  int nonDistributedPen = pens%students;
	  
	  // printing the calculated value of distributedPen and nonDistributedPen
	  System.out.print("The Pen Per Student is " + distributedPen+ " and the remaining pen not distributed is " + nonDistributedPen);

   }
}