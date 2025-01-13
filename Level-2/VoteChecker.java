import java.util.Scanner;

public class VoteChecker {

    // Method to check if a student can vote
    public boolean canStudentVote(int age) {
        if (age < 0) {
            // Invalid age
            return false;
        }
		else if(age >= 18){
        // Return true if age is 18 or above, otherwise false
        return true;
		}
		else{
		  return false;
		}
    }

    public static void main(String[] args) {
        // Create an instance of VoteChecker
        VoteChecker checker = new VoteChecker();

        // Array to store the ages of 10 students
        int[] studentAges = new int[10];

        // Scanner to take user input
        Scanner sc = new Scanner(System.in);

        // Loop to take input for 10 students
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            studentAges[i] = sc.nextInt();

            // Call canStudentVote() to check voting eligibility
            boolean canVote = checker.canStudentVote(studentAges[i]);
            
			
            // Display the result
            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

        sc.close();
    }
}
