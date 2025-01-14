import java.util.Scanner;

public class IndexOutOfBoundException{
	
	//method to generate exception
	public static void generatingException(String s){
		
		
	    try{
		    //accessing the index of string using charAt method
			 for(int i=0;i<s.length();i++){
				System.out.println("char at index " + i + " of String is: " );
			    System.out.println( s.charAt(s.length()+i)); 
			 }
			
		}catch(IndexOutOfBoundsException e){
		   //System.out.println(e.getMessage() );
		   e.printStackTrace();
		}
	}
	
	//method to handle exception using try catch 
	public static void handlingException(String s){
		
		try{
		//accessing the index of string using charAt method
			 for(int i=0;i<s.length();i++){
				System.out.println("char at index " + i + " of String is: " );
			    System.out.println( s.charAt(s.length()+i)); 
			 }
			
		}catch(IndexOutOfBoundsException e){
			 System.out.println("Index out of Bound Exception caught  => " + e.getMessage() );
		}
		 
	}
	
	

    public static void main(String[] args){
	  
	 Scanner sc=new Scanner(System.in);
	 
	 //taking input from the user
	 System.out.println("Enter the String");
	 String s= sc.next();
	 
     //calling generate exception method
	  System.out.println("Calling method to generate IndexOutOfBoundException: ");
      generatingException(s);
	 
	 //calling method to handle exception
	 System.out.println("Calling method to handle IndexOutOfBoundException: ");
	 handlingException(s);
	 
	 sc.close();
	 
   }
  }