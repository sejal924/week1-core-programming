//Computing the percentage and then calculating the grade
import java.util.Scanner;

public class Percentage{
     public static void main(String [] args){ 
	     Scanner sc = new Scanner(System.in);
		 
	    System.out.print("Enter number of students: ");
		int number = sc.nextInt();
		
		double[] math = new double[number];
		double[] physics = new double[number];
		double[] chemistry   = new double[number];
		double[] percentage   = new double[number];
		String[] grade = new String[number];
		
		for(int i=0;i<number;i++){
		   // Input  for math
		   do {
                System.out.print("Enter marks of math of student" + (i + 1) + ": ");
                math[i] = sc.nextDouble();
                if (math[i] < 0) {
                    System.out.println("Invalid marks,enter a marks of math again");
                }
            } while (math[i] < 0);
            // Input  for physics
            do {
                System.out.print("Enter marks of physics of student" + (i + 1) + ": ");
                physics[i] = sc.nextDouble();
                if (physics[i] < 0) {
                    System.out.println("Invalid marks,enter a marks of physics again");
                }
            } while (physics[i] < 0);
			// Input  for chemistry
		   do {
                System.out.print("Enter marks of chemistry of student" + (i + 1) + ": ");
                chemistry[i] = sc.nextDouble();
                if (chemistry[i] < 0) {
                    System.out.println("Invalid marks,enter a marks of chemistry again");
                }
            } while (chemistry[i] < 0);
		    //calculating mark
		  percentage[i] = (physics[i]+chemistry[i]+math[i])/3;
		 
		 //calculating grade
		 if(percentage[i]>=80){
		       grade[i]="A";
		 }
		 else if(percentage[i]>=70 && percentage[i]<=79){
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
		 //printing the marks of math,physics, chemistry , percentage and grade
		for(int i=0;i<number;i++){
		    System.out.println("Marks of math of student" + (i + 1) + " is: " + math[i]);
			System.out.println("Marks of physics of student" + (i + 1) + " is: " + physics[i]);
			System.out.println("Marks of chemistry of student" + (i + 1) + " is: " + chemistry[i]);
			System.out.println("Percentage of student" + (i + 1) + " is: " + percentage[i]);
			System.out.println("Grade of student" + (i + 1) + " is: " + grade[i]);	
			
        }		
		 	  
		 
}
}