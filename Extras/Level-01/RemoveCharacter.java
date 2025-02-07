import java.util.Scanner;

public class RemoveCharacter{

    // Method to remove all occurrences of a specific character from the string
    public static String removeCharacter(String str, char charToRemove) {
        // Initialize an empty string to store the result
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != charToRemove) {
                result += str.charAt(i); // Concatenate character to the result string
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the string
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();

        // Take input for the character to remove
        System.out.print("Character to Remove: ");
        char charToRemove = scanner.next().charAt(0);

        // Call the method to remove occurrences of the character
        String modifiedString = removeCharacter(str, charToRemove);

        // Output the result
        System.out.println("Modified String: " + modifiedString);

        scanner.close();
    }

}