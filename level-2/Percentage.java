//Computing the percentage and then calculating the grade
import java.util.Scanner;

public class Percentage
{
    public static void main(String [] args)
	{ 
	     //creating scanner object for user input
	     Scanner sc = new Scanner(System.in);
		 
		 //taking input marks of physics,chemistry,math
		 System.out.print("Enter physics mark: ");
		 double physics = sc.nextDouble();
		 System.out.print("Enter chemistry mark: ");
		 double chemistry = sc.nextDouble();
		 System.out.print("Enter math mark: ");
		 double math = sc.nextDouble();
		 
		 //calculating mark
		 double marks = (physics+chemistry+math)*100/300;
		 
		 if(marks>=80){
		       System.out.print("The marks is:" + marks + 
			   "with the remarks (Level 4 , above agency-normalized standards) and grade is A");
		 }
		 else if(marks>=70 && marks<=79){
		    System.out.print("The marks is:" + marks + 
			   "with the remarks (Level 3 , at agency-normalized standards) and grade is B");    
		 }
		 else if (marks>=60 && marks <=69){
		 System.out.print("The marks is:" + marks + 
			   "with the remarks (Level 2 , below, but approaching agency-normalized standards) and grade is C");
		 }
		else if (marks>=50 && marks <=59){
		 System.out.print("The marks is:" + marks + 
			   "with the remarks (Level 1 , well below, agency-normalized standards) and grade is D");
		 } 
		 else if (marks>=40 && marks <=49){
		 System.out.print("The marks is:" + marks + 
			   "with the remarks (Level 1 , too below, agency-normalized standards) and grade is E");
		 }
		 else if ( marks<=39){
		 System.out.print("The marks is:" + marks + 
			   "with the remarks (remedial standards) and grade is R");
		 }
		 
	}
}