import java.util.Scanner;

public class MostFrequentCharacter{

    // Method to find the most frequent character in the string
    public static char findMostFrequentCharacter(String str) {
        // Array to store the frequency of each character 
        int[] freq = new int[255];

        // Variable to keep track of the most frequent character
        char mostFrequentChar = str.charAt(0);
        int maxFrequency = 0;

        // Traverse the string and count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++; 

            // Update the most frequent character 
            if (freq[ch] > maxFrequency) {
                mostFrequentChar = ch;
                maxFrequency = freq[ch];
            }
        }

        return mostFrequentChar;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the string
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();

        // Call the method to find the most frequent character
        char mostFrequentChar = findMostFrequentCharacter(str);

        // Output the result
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");

        scanner.close();
    }

}