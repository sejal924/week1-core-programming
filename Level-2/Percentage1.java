//Computing the percentage and then calculating the grade
import java.util.Scanner;

public class Percentage1{
     public static void main(String [] args){ 
	     Scanner sc = new Scanner(System.in);
		
		//taking input number of students from user
	    System.out.print("Enter number of students: ");
		int number = sc.nextInt();
		
		//creatind 2-D array
		double[][] marks = new double[number][3];
		double[] percentage   = new double[number];
		String[] grade   = new String[number];
		
		for(int i=0;i<number;i++){
		   // Input  for math
		   do {
                System.out.print("Enter marks of math of student" + (i + 1) + ": ");
                marks[i][0] = sc.nextDouble();
                if (marks[i][0] < 0) {
                    System.out.println("Invalid marks,enter a marks of math again");
                }
            } while (marks[i][0] < 0);
            // Input  for physics
            do {
                System.out.print("Enter marks of physics of student" + (i + 1) + ": ");
               marks[i][1] = sc.nextDouble();
                if (marks[i][1] < 0) {
                    System.out.println("Invalid marks,enter a marks of physics again");
                }
            } while (marks[i][1] < 0);
			// Input  for chemistry
		   do {
                System.out.print("Enter marks of chemistry of student" + (i + 1) + ": ");
                marks[i][2] = sc.nextDouble();
                if (marks[i][2] < 0) {
                    System.out.println("Invalid marks,enter a marks of chemistry again");
                }
            } while (marks[i][2] < 0);
		    //calculating mark
		  percentage[i] = (marks[i][2]+marks[i][1]+marks[i][0])/3;
		  
		 //calculating grade
		 if( percentage[i]>=80){
		       grade[i]="A";
		 }
		 else if( percentage[i]>=70 &&  percentage[i]<=79){
		       grade[i]="B";
		 }
		 else if (percentage[i]>=60 && percentage[i] <=69){
		       grade[i]="C";
		 }
		else if (percentage[i]>=50 && percentage[i] <=59){
               grade[i]="D";
		 } 
		 else if (percentage[i]>=40 && percentage[i]<=49){
		       grade[i]="E"; 
		 }
		 else if (percentage[i]<=39){
		        grade[i]="R"; 
		 }
		}
		//printing the marks of math, physics, chemistry , percentage and grade
		for(int i=0;i<number;i++){
		    System.out.println("Marks of math of student" + (i + 1) + " is: " + marks[i][0]);
			System.out.println("Marks of physics of student" + (i + 1) + " is: " + marks[i][1]);
			System.out.println("Marks of chemistry of student" + (i + 1) + " is: " + marks[i][2]);
			System.out.println("Percentage of student" + (i + 1) + " is: " + percentage[i]);
			System.out.println("Grade of student" + (i + 1) + " is: " + grade[i]);			
        }	
}
}