import java.util.Scanner;
import java.util.*;

public class CompareTwoString{
    
	//comapring the two string
	public static boolean compareString(String str1, String str2){
		// Checking if the lengths are equal
        if (str1.length() != str2.length()) {
            return false;
        }
		//comparing both string
		for(int i=0;i<str1.length();i++){
		if(str1.charAt(i)!= str2.charAt(i)){
			return false;
		}
	}
		return true; 
	}
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
	
	//taking the string input
	System.out.print("Enter the string 1: ");
	String str1 = sc.next();
	System.out.print("Enter the string 2: ");
	String str2 = sc.next();
	
	//comparing string with built in method
    boolean isEqual = str1.equals(str2) == compareString(str1 , str2);
	if(isEqual){
		//printing both string are equal
	 System.out.println("String 1 is " + str1);
	 System.out.println("String 2 is " + str2);
	 System.out.println("Both string are same");
	}
	else{
		//printing both string are not equal
	  System.out.print("Both string are not same");
	}

    sc.close();
}	
}
