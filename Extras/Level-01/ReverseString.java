import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input string from user
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Initialize an empty reverse string
        String reverse = "";

        //reversing the string
        for (int i = text.length() - 1; i >= 0; i--) {
            char c=text.charAt(i);
            reverse = reverse + c;
        }

        // Output the reversed string
        System.out.println("Reversed string: " + reverse);

        input.close();
    }
}