/ Creating method for null pointer exception

public class NullPointerException{
	
	// method to genrate the Exception by try catch block
	public static void generateException(){
		String s = null;
		 // Attempt to call a String method on the null variable
		System.out.println("The length of String is "+ s.length());
	}
	
	// method to handle the Exception by try catch block
	public static void handlingException(){
		 String s = null;
		try{
			
            System.out.println("Length of text: " + s.length());
		}catch(NullPointerException e){
			//calling built in methods in this null variable to generate excception
			System.out.println("NullPointerException caught");
			System.out.println("Null Pointer Exception => "+e.getMessage());
		}
	} 
	
	public static void main(String [] args){
		
		
		NullPointerException4 demo = new NullPointerException4();
		String s = null;

		try{
					 System.out.println(" Calling method to generating NullPointerException...");
			demo.generateException();
			// Attempt to call a String method on the null variable
            
		}catch(NullPointerException e){
			// Handle the exception
			
            //System.out.println( e.getMessage());
			e.printStackTrace();
		}
	
        // Call the method to handle the exception
	    System.out.println("Calling method to handle NullPointerException...");
		demo.handlingException();
		
		sc.close();
	}
}