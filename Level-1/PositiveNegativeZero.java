import java.util.Scanner;

public class PositiveNegativeZero {
    //Method to check positive , negative or zero number
    public static int natureOfNumber(int num){
        if (num > 0) {
            return 1;
        } 
		else if (num < 0) {
           return -1;
        } 
		else {
            return 0;
        }
	}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking input from the user
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        
        int result = natureOfNumber(number);
		//printing the nature of number
		if(result==1){
		  System.out.print("The number is positive");
		 }
		else if(result==-1){
		  System.out.print("The number is negative");
		}
		else{
		  System.out.print("The number is zero");
		}

    }
}