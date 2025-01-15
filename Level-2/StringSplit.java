import java.util.Scanner;

public class StringSplit {
    
	//method to find length of the string
    public static int findStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                 str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Do nothing, exception expected
        }
        return count;
    }
    
	//method to spilt the text into words
    public static String[] splitText(String text) {
        int length = findStringLength(text);
        int wordCount = 1; // Assuming at least one word

        // Count the number of words (spaces)
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store the indexes of spaces
        int[] spaceIndexes = new int[wordCount - 1]; 
        int spaceIndex = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[spaceIndex++] = i;
            }
        }

        // Extract words
        String[] words = new String[wordCount];
        int startIndex = 0;
        for (int i = 0; i < wordCount; i++) {
            if (i < wordCount - 1) {
                words[i] = text.substring(startIndex, spaceIndexes[i]);
                startIndex = spaceIndexes[i] + 1; 
            } else {
                words[i] = text.substring(startIndex);
            }
        }

        return words;
    }
    
	//method to compare the two string
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
		//taking the input string form user
        String inputString = sc.nextLine();

        String[] split = splitText(inputString);
        String[] builtInSplit = inputString.split(" "); 

        boolean arraysAreEqual = compareArrays(split, builtInSplit);
        
		//printing the results
        System.out.println("User define split:");
        for (String word : split) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in Split:");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        System.out.println("\nArrays are equal: " + arraysAreEqual);
		
		sc.close();
    }
}