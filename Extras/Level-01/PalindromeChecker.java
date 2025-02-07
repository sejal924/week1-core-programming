import java.util.Scanner;

public class PalindromeChecker{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input string from user
        System.out.print("Enter a string: ");
        String text = input.next();

        boolean isPalindrome = true;

        //checking whether string is palindrome or not
        int length = text.length();
        for (int i = 0; i < length / 2; i++) {
            char a=text.charAt(i);
            char b=text.charAt(length-i-1);
            if (a!=b) {
                isPalindrome = false;
                break;
            }
        }

        // Output the result
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        input.close();
    }
}