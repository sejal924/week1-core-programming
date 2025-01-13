// finding the maximum number of handshakes among N number of students

import java.util.*;

//creating the NumberOfHandshakes class 
public class NumberOfHandshakes
{
     public static void main(String [] args)
     { 
	   //Creating a Scanner object for user input
	   Scanner sc= new Scanner(System.in);
	   
	   System.out.print("Enter the number of students: ");
	   //taking input the number of student 
	   int numberOfStudents = sc.nextInt();
	   
	   //finding maximum handshake
	   int maximumHandshake = (numberOfStudents * (numberOfStudents - 1)) / 2;
	   
	   //printing the number of possible handshakes
	   System.out.print(" The number of possible handshakes " + maximumHandshake);
	   
	 }
}