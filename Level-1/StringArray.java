import java.util.*;

public class StringArray{
    
	 // Method to convert string to char array
    public static char[] charArray(String str){
	    int length = str.length();
        char [] strArray = new char[length];
		for(int i=0;i<length; i++){
		   strArray[i] = str.charAt(i);
		}
		return strArray;
	}
	
	//method to compare the two char arrays
	public static boolean compareArray(char[] str1, char[] str2){
	        if (str1.length != str2.length) {
            return false;
        }
		   for(int i=0;i<str1.length;i++){
		        if(str1[i]!=str2[i]){
				    return false; 
				}
		   }
		   return true;
	}
    public static void main(String [] args){
	 Scanner sc= new Scanner(System.in);
	 
	 System.out.print("Enter the String: ");
	 //taking string input from user
	 String str = sc.next();
	 
	 char[] str1 = charArray(str);
	 char [] str2 = str.toCharArray();
	 
	 //printing the char-array
	 for(int i=0;i<str1.length;i++){
	 System.out.print(str1[i] + " ");
	 }
	 System.out.println();
	 for(int i=0;i<str2.length;i++){
	 System.out.print(str2[i] + " ");
	 }
	 boolean compare = compareArray(str1,str2);
	 
	 //printing whether the string are same or not
	 if(compare){
	    System.out.println("Both the string are same");
	 }
	 else{
	    System.out.println("Both string are not same");
	 }
	 sc.close();
	}
}
