import java.util.Scanner;

public class VowelConsonantCounter {
    
	//method to check character nature
    public static String checkCharacter(char c) {
        c = Character.toLowerCase(c);

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return "Vowel";
        } else if ((c >= 'a' && c <= 'z')) {
            return "Consonant";
        } else {
            return "Not a Letter";
        }
    }
    
	//method to count vowel and consonants
    public static int[] countVowelsConsonants(String str) {
        int[] counts = new int[2]; // counts[0] for vowels, counts[1] for consonants
        for (int i = 0; i < str.length(); i++) {
            String str = checkCharacter(str.charAt(i));
            if (str.equals("Vowel")) {
                counts[0]++;
            } else if (str.equals("Consonant")) {
                counts[1]++;
            }
        }
        return counts;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int[] counts = countVowelsConsonants(str);
        
		//printing the result
        System.out.println("Number of Vowels: " + counts[0]);
        System.out.println("Number of Consonants: " + counts[1]);
		
		sc.close();
    }
}