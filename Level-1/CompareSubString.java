import java.util.*;


public class CompareSubString{
    
	//method to return substring
   public static String subString(String str, int start, int end){
       String subStr = "";
       for(int i=start; i<end;i++){
	        subStr += str.charAt(i);
      }
       return subStr;	  
   }
   
   //method to compare the two string
   public static boolean compareString(String str1, String str2){
		for(int i=0;i<str1.length();i++){
		if(str1.charAt(i)!= str2.charAt(i)){
			return false;
		}
	  }
		return true; 
	}
	
   public static void main (String [] args){
       Scanner sc = new Scanner(System.in);
	   
	   System.out.print("Enter the string: ");
	   //taking the input string from user
	   String str = sc.next();
	   
	   System.out.print("Enter the starting index: ");
	   //taking the starting index from user
	   int start = sc.nextInt();
	   
	   System.out.print("Enter the ending index: ");
	   //taking the ending index from user
	   int end = sc.nextInt();
	   
	   String result = subString(str,start,end);
	   String isSubString = str.substring(start,end);
	   
	   //printing the substrings
	   System.out.println("Substring is:" + result);
	   System.out.println("Substring is:" + isSubString);
	   
	   boolean compare = compareString(result, isSubString);
	    
	   //printing whether the substrings are equal or not
	   if(compare){
	      System.out.println("Both the substring are same");
	   }
	   else{
	      System.out.println("Both the substring are not same");
	   }
	   sc.close();
   }
}