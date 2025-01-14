import java.util.*;

public class ToLowerCase{
    
	//method to convert character into lower-case
    public static String converting(String str){
	    String str1 = "";
	    for(int i=0;i<str.length();i++){
		   
			str1 += (char)(str.charAt(i)+32);
		}
		return str1;
	}
	//method to compare the two strings
	public static boolean isCompare (String s1, String s2){
	         if (s1.length() != s2.length()) {
            return false;
        }
			for(int i=0;i<s1.length();i++){
		if(s1.charAt(i)!= s2.charAt(i)){
			return false;
		}
	  }
		return true; 
	}
    public static void main(String [] args){
	    Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		//taking the string input
		String str = sc.nextLine();
		
		String toConvert1 = converting(str);
		//printing string 1
		System.out.println("string1: " + toConvert1);
		String toConvert2 = str.toLowerCase();
		//printing string 2
		System.out.println("string2: " + toConvert2);
		boolean compare = isCompare(toConvert1 , toConvert2);
		
		//printing the result
		if(compare){
		   System.out.println("Both are equal");
		}
		else{
		   System.out.print("Both are not equal");
		}
		sc.close();
	}
}