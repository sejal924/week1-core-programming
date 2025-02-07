import java.util.Scanner;

public class ToggleCase{
    
    // Method to toggle the case of each character in the string
    public static String toggleCase(String str) {
        String result = "";

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch>='a'&&ch<='z') {
                result = result +(char)(ch-32);
            }
            else if (ch>='A'&&ch<='Z') {
                result = result + (char)(ch+32);
            } else {
                result = result + ch;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Call the method to toggle case
        String toggledStr = toggleCase(str);

        System.out.println("Toggled string: " + toggledStr);

        // Close the scanner
        scanner.close();
    }

}