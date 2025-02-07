import java.util.Scanner;

public class SubstringCount{

    // Method to count occurrences of a substring in a string
    public static int countSubstringOccurrences(String str, String substring) {
        int count = 0;
        int index = 0;

        // Loop through the string and find all occurrences
        // indexOf(string substring, int startIndex)
        while ((index = str.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length(); // Move past the current match
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the main string
        System.out.print("Enter the main string: ");
        String str = scanner.nextLine();

        // Take input
        System.out.print("Enter the substring: ");
        String substring = scanner.nextLine();

        // Call the method to count occurrences
        int count = countSubstringOccurrences(str, substring);

        // Output the result
        System.out.println("The substring '" + substring + "' occurs " + count + " times.");

        scanner.close();
    }

}