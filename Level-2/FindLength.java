import java.util.*;

public class FindLength{
    
	//method to find the length of the string
	public static int findStringLength(String str){
	       int count=0;
		   //use try-catch block to handle exception
		   try{
		        while(true){
				    str.charAt(count);
					count++;
				}
		   }
			   catch (Exception e){
			       //System.out.print("StringIndexOutOfBoundsException");
			   }
           return count;
	}
    public static void main(String[] args){
	     Scanner sc = new Scanner(System.in);
		 
		 //taking string input
		 System.out.print("Enter the string: ");
		 String str = sc.next();
		 
		 
		 int length = findStringLength(str);
		 //calculating length by built-in method
		 int builtInLength = str.length();
		 
		 //printing the result
		 System.out.println("String Length by user method: " + length);
        System.out.println("String Length by built-in Method: " + builtInLength);
		 
	}
}