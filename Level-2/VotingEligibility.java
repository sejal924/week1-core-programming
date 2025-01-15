import java.util.Scanner;

public class VotingEligibility {
    
	//method to generate student age
    public static int[] generateStudentAges(int numStudents) {
        int[] ages = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
			// Generate random ages between 10 and 99
            ages[i] = (int) (Math.random() * 90) + 10; 
        }
        return ages;
    }
    
	//method to check voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] votingStatus = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            votingStatus[i][0] = String.valueOf(ages[i]);
            if (ages[i] >= 18) {
                votingStatus[i][1] = "Can Vote";
            } else {
                votingStatus[i][1] = "Cannot Vote";
            }
        }
        return votingStatus;
    }
    
	//method to display voting status
    public static void displayVotingStatus(String[][] votingStatus) {
        System.out.println("Age\tVoting Eligibility");
        for (String[] student : votingStatus) {
            System.out.println(student[0] + "\t" + student[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
		//taking the input number of student from user
        int numStudents = sc.nextInt();

        int[] studentAges = generateStudentAges(numStudents);
        String[][] votingStatus = checkVotingEligibility(studentAges);

        displayVotingStatus(votingStatus);
		
		sc.close();
    }
}