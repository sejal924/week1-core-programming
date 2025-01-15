import java.util.Scanner;

public class VowelConsonantIdentifier {
    
	//method to check the character nature
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
    
	//method to find the vowel , consonants
    public static String[][] findVowelConsonants(String str) {
        String[][] charTypes = new String[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            charTypes[i][0] = String.valueOf(str.charAt(i));
            charTypes[i][1] = checkCharacter(str.charAt(i));
        }
        return charTypes;
    }
    
	//method to display the nature of the character
    public static void displayCharTypes(String[][] charTypes) {
        System.out.println("Character\tType");
        for (String[] charType : charTypes) {
            System.out.println(charType[0] + "\t" + charType[1]);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
		//taking the input string from user
        String str = sc.nextLine();

        String[][] charTypes = findVowelConsonants(str);
        displayCharTypes(charTypes);
		
		sc.close();
    }
}