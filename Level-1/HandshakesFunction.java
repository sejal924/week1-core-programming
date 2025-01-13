import java.util.Scanner;

public class HandshakesFunction{
	
	//method to calculate maximum number of handshakes
	public int calculateHandshakes(int students){
		
		int maxH;
		maxH = (students * (students - 1)) /2;
		return maxH;
		
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//taking user input in students variable
		System.out.println("Enter the number of students: ");
		int numberOfStudents = sc.nextInt();
		
		//calculating maximun number of Handshakes
		HandshakesFunction2 obj=new HandshakesFunction2();
		int handshakes= obj.calculateHandshakes(numberOfStudents);
		
		//printing the result
		System.out.println("The maximun number of handshakes among " + numberOfStudents + " is " + handshakes + ".");
		
		
		
		sc.close();
	}
	
}