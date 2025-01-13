// finding the maximum number of handshakes among N number of students

import java.util.*;
 
public class NumberOfHandshakes
{    
     //Method to calculate Handshakes
     public static int Handshakes(int num){
	     return  (num * (num - 1)) / 2 ;
	 }
     public static void main(String [] args)
     { 
	   //Creating a Scanner object for user input
	   Scanner sc= new Scanner(System.in);
	   
	   System.out.print("Enter the number of students: ");
	   //taking input the number of student 
	   int numberOfStudents = sc.nextInt();
	   
	   int maximumHandshake = Handshakes(numberOfStudents);
	   
	   //printing the number of possible handshakes
	   System.out.print(" The number of possible handshakes " + maximumHandshake);
	   
	 }
}