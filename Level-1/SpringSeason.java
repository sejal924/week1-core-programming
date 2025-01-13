import java.util.Scanner;

public class SpringSeason {
    public static boolean checkingSeason(int month,int day){
	// the month number of march and june is 3 and 6 respectively.
	    if ((month == 3 && day >= 20) ||
                (month > 3 && month < 6) ||
                (month == 6 && day <= 20)) {
           return true;
        } else {
            return false;
        } 
	}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking input from the user
        System.out.print("Enter the month: ");
        int month = sc.nextInt();

        // taking input from the user
        System.out.print("Enter the day: ");
        int day = sc.nextInt();

        boolean isSpringSeason = checkingSeason( month, day);
		if(isSpringSeason==true){
		 System.out.println("Its a Spring Season");
		}
		else{
		 System.out.println("Not a Spring Season");
		}
    }
}