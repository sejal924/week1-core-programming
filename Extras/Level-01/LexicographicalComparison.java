import java.util.Scanner;

public class LexicographicalComparison{

    // Method to compare two strings lexicographically
    public static int compareStringsLexicographically(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());

        // Compare characters one by one
        for (int i = 0; i < minLength; i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            if (char1 < char2) {
                return -1; // str1 comes before str2
            } else if (char1 > char2) {
                return 1; // str1 comes after str2
            }
        }

        // If characters are the same, the shorter string comes first
        if (str1.length() < str2.length()) {
            return -1; // str1 comes before str2
        } else if (str1.length() > str2.length()) {
            return 1; // str1 comes after str2
        } else {
            return 0; // Strings are equal
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the two strings
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Call the method to compare the strings lexicographically
        int result = compareStringsLexicographically(str1, str2);

        // Output the result based on the comparison
        if (result < 0) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
        } else if (result > 0) {
            System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order");
        } else {
            System.out.println("Both strings are equal.");
        }

        scanner.close();
    }

}