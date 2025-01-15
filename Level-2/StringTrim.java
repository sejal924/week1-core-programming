import java.util.Scanner;

public class StringTrim {
    
	//method to find the trim indices of string
    public static int[] findTrimIndices(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Find the starting index (trim leading spaces)
        while (start < str.length() && str.charAt(start) == ' ') {
            start++;
        }

        // Find the ending index (trim trailing spaces)
        while (end >= 0 && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }
     
	 //method to create the substring
    public static String createSubstring(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
     
	 //method to compare two strings
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
		//taking input string from user
        String str = sc.nextLine();

        int[] indices = findTrimIndices(str);
        String customTrimmed = createSubstring(str, indices[0], indices[1]);
        String builtInTrimmed = str.trim();

        boolean areEqual = compareStrings(customTrimmed, builtInTrimmed);
        
		//displaying the result
        System.out.println("Custom Trimmed String: " + customTrimmed);
        System.out.println("Built-in Trimmed String: " + builtInTrimmed);
        System.out.println("Strings are equal: " + areEqual);
		
		sc.close();
    }
}
