import java.util.Scanner;

public class IllegalArgumentException{
	
	//method to generate exception
	public static String generatingException(String s){
		
		 String sub="";
	    try{
		   //generating the IllegalArgument Exception
		   int endIndex=s.length()-1;
		   int startIndex=endIndex+20;
		   sub=s.substring(startIndex,endIndex+1);
			
		}catch(Exception e){
		   //System.out.println(e.getMessage() );
		 //  e.printStackTrace();
		 throw new IllegalArgumentException("Invalid argument");
		}
		return sub;
	}
	
	//method to handle exception using try catch 
	public static String handlingException(String s){
		
		 String sub="";
		try{
		 //generating the IllegalArgument Exception
		   int endIndex=s.length()-1;
		   int startIndex=endIndex+20;
		   sub=s.substring(startIndex,endIndex+1);
			
			
		}catch(Exception e){
			// System.out.println("Illegal Argument Exception caught  => " + e.getMessage() );
			throw new IllegalArgumentException("Invalid argument");
		}
		 return sub;
	}
	
    public static void main(String[] args){
	  
	 Scanner sc=new Scanner(System.in);
	 
	 //taking input from the user
	 System.out.println("Enter the String");
	 String s=sc.next();
	 
     //calling generate exception method
	
	  try{
		  System.out.println("Calling method to generate IllegalArgumentException: ");
      generatingException(s);  
	  }catch(Exception e){
		  e.printStackTrace(); 
	  }
	 
	 //calling method to handle exception
	 try{
	 System.out.println("Calling method to handle IllegalArgumentException: ");
	 handlingException(s);
	 }catch(Exception e){
		System.out.println("Illegal Argument Exception caught  => " + e.getMessage() ); 
	 }
	 
	 sc.close();
	 
  }
}