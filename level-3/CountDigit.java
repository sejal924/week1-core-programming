import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

       //defining count variable 
       int count=0;
       int originalNumber=number;

       //calculating count of digits in number using while loop
       while(originalNumber != 0 ){
           count++;
           originalNumber= originalNumber/10;
       }

       //printing the output
         System.out.println("There are " + count + " digits in the number " + number + ".");

    }
}