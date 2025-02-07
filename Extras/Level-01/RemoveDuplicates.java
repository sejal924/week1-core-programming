import java.util.Scanner;

public class RemoveDuplicates{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from user
        System.out.print("Enter a string: ");
        String input = scanner.next();
        
        //without duplicates String
        String result="";

        // Use a boolean array to track if a character is already added
        int[] seen = new int[256];  // Assuming ASCII characters

        for(int i=0;i<input.length();i++){
            int a=input.charAt(i);
            seen[a]++;
        }

        // Iterate through the input string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // If the character has not been seen before, add it to the result
            if (seen[currentChar]>0) {
                result =result + currentChar;
                seen[currentChar] = 0;
            }
        }

        // Output 
        System.out.println("Modified string (duplicates removed): " + result.toString());

        scanner.close();
    }
}