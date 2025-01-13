import java.util.Scanner;

public class LeapYearChecker {
    //method to check whether year is leap year or not
    public static boolean isLeapYear(int year) {
        // Leap year conditions for the Gregorian calendar (year >= 1582)
        if (year < 1582) {
            return false; 
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		//taking the input from user
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        
		//printing year is leap year or not
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}