import java.util.Scanner;

public class ArrayIndexOutOfBoundException{
	
	//method to generate exception
	public static void generatingException(String[] name){
		
	    try{
			System.out.println("Printing the name of students..");
			for(int i=0;i<5;i++){
				System.out.println(name[6]);
			}
		}catch(ArrayIndexOutOfBoundsException e){
		   //System.out.println(e.getMessage() );
		   e.printStackTrace();
		}
	}
	
	//method to handle exception using try catch 
	public static void handlingException(String[] name){
		
		try{
			System.out.println("Printing the name of students..");
			for(int i=0;i<5;i++){
				System.out.println(name[6]);
			}	 
		}catch(ArrayIndexOutOfBoundsException e){
			 System.out.println("Array Index Out Of Bound Exception caught => " + e.getMessage() );
		}
		 
	}

    public static void main(String[] args){
	  
	 Scanner sc=new Scanner(System.in);
	 
	 String[] name=new String[5];
	 
	 //taking input from the user
	 for(int i=0;i<5;i++){
	    System.out.println("Enter the Name of person " + (i+1) + ":");
	    name[i]= sc.next();
	 }
	 
     //calling generate exception method
	  System.out.println("Calling method to generate ArrayIndexOutOfBoundException: ");
      generatingException(name);
	 
	 //calling method to handle exception
	 System.out.println("Calling method to handle ArrayIndexOutOfBoundException: ");
	 handlingException(name);
	 
	 sc.close();
	 
  }
}