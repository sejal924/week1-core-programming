import java.util.Scanner;

public class StudentGrades {
    
	//method to generate the student score
    public static int[][] generateStudentScores(int numStudents) {
		// 2D array to store scores (Physics, Chemistry, Maths)
        int[][] scores = new int[numStudents][3]; 
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
				// Generate random scores between 0 and 100
                scores[i][j] = (int) (Math.random() * 101); 
            }
        }
        return scores;
    }
    
	//method to calculate the result
    public static double[][] calculateResults(int[][] scores) {
		// 2D array to store total, average, percentage
        double[][] results = new double[scores.length][3]; 
        for (int i = 0; i < scores.length; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = Math.round(percentage * 100.0) / 100.0; 
        }
        return results;
    }
    
	//method to calculate grade
    public static String[] calculateGrades(double[][] results) {
        String[] grades = new String[results.length];
        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];
            if (percentage >= 80) {
                grades[i] = "A";
            } 
			else if (percentage >= 70 && percentage <=79) {
                grades[i] = "B";
            } 
			else if (percentage >= 60 && percentage <= 69) {
                grades[i] = "C";
            } 
			else if (percentage >= 50 && percentage <= 59) {
                grades[i] = "D";
            } 
			else if (percentage >= 40 && percentage <= 49) {
                grades[i] = "E";
            } 
			else {
                grades[i] = "R";
            }
        }
        return grades;
    }
    
	//method to display score card
    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
       
        System.out.println("Student\tPhysics\t\tChemistry\tMaths\t\tTotal\t\tAverage\t\tPercentage\tGrade");
        
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t\t%d\t\t%d\t\t%.2f\t\t%.2f\t\t%.2f\t\t%s\n",
                    i + 1, scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], results[i][2], grades[i]);
		
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
		//taking the input
        int numStudents = sc.nextInt();

        int[][] studentScores = generateStudentScores(numStudents);
        double[][] studentResults = calculateResults(studentScores);
        String[] studentGrades = calculateGrades(studentResults);

        displayScorecard(studentScores, studentResults, studentGrades);
		
		sc.close();
    }
}