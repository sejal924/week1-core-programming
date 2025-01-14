import java.util.Scanner;

public class NumberformatException{
	
	//method to generate exception
	public static void generatingException(String s){
		
		
		int num;
	    try{
			s=s+'a';
		   num=Integer.parseInt(s);	 
		}catch(NumberFormatException e){
		   //System.out.println(e.getMessage() );
		   e.printStackTrace();
		}
	}
	
	//method to handle exception using try catch 
	public static void handlingException(String s){
		
		int num;
		try{
			s=s+'a';
	     	num=Integer.parseInt(s);	 
		}catch(NumberFormatException e){
			 System.out.println("Number format Exception caught => " + e.getMessage() );
		}
		 
	}
	
    public static void main(String[] args){
	  
	 Scanner sc=new Scanner(System.in);
	 
	 //taking input from the user
	 System.out.println("Enter the Number:");
	 String s= sc.next();
	 
     //calling generate exception method
	  System.out.println("Calling method to generate NumberFormatException: ");
      generatingException(s);
	 
	 //calling method to handle exception
	 System.out.println("Calling method to handle NumberFormatException: ");
	 handlingException(s);
	 
	 sc.close();
	 
  }
}