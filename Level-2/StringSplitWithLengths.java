import java.util.Scanner;

public class StringSplitWithLengths {
    
	//method to find length of the string
    public static int findStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                char c = str.charAt(count);
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
    //method to get words with length
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] wordLengths = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i];
            wordLengths[i][1] = String.valueOf(findStringLength(words[i])); 
        }

        return wordLengths;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
		//taking the input string from user
        String str = sc.nextLine();

        String[] words = splitText(str);
        String[][] wordLengths = getWordsWithLengths(words);
        
		//printing the result
        System.out.println("Word\tLength");
        for (String[] wordLength : wordLengths) {
            System.out.println(wordLength[0] + "\t" + Integer.parseInt(wordLength[1])); 
        }
		sc.close();
    }
}