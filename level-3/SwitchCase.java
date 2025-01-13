import java.util.Scanner;
import java.lang.*;

public class SwitchCase{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter a first number: ");
        double first = sc.nextDouble();

        // taking input from user
        System.out.print("Enter a first number: ");
        double second = sc.nextDouble();
 
        // taking input from user
        System.out.print("Enter a operators(+, -, *, /): ");
        String op = sc.next();

       //calculating the answer
       double answer = 0;
       for(int i=0;i<op.length();i++){
         char c=op.charAt(i); 
         
         switch(c){

              case '+':
               answer= first + second;
               System.out.println("Addition of number " + first + " and " + second + " is " + answer);
               break;

              case '-':
               answer= first - second;
               System.out.println("Substraction of number " + first + " and " + second + " is " + answer);
               break;

              case '*':
               answer= first * second;
               System.out.println("Multiplication of number " + first + " and " + second + " is " + answer);
               break;
             
              case '/':
               answer= first / second;
               System.out.println("Division of number " + first + " and " + second + " is " + answer);
               break;
             
             default :
                System.out.println("Invalid Operator");
                break;

          }
       }
    }
}