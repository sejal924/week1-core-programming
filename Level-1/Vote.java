//checking whether the student can vote or not
import java.util.Scanner;

public class Vote{
    public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		
		//creating an array
		int[] age = new int[10];
		
		//taking the input age from user
		for(int i=0; i<10;i++){
		   System.out.print("Enter the age of student" + (i+1) +": ");
		   age[i] = sc.nextInt();
		}
		//checking who can vote using for loop
		for(int i=0;i<age.length;i++){
		    if(age[i]<0){
			  System.out.println("Invalid age of Student " + age[i]);
			}
			else if(age[i]>=18){
			   System.out.println("The student with the age " + age[i] + " can vote");			   
			}
			else{
			  System.out.println("The student with age " + age[i] + " cannot vote");
			}
		}
	}
}