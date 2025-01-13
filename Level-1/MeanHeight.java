//finding the mean height of players present in a football team.
 
import java.util.Scanner;

public class MeanHeight{
    public static void main(String [] args){
	      Scanner sc = new Scanner(System.in);
		  
		  //creating an array footballTeam of size 11
		  double[] footballTeam = new double[11];
		  
		  //creating the variable sumOfHeight
		  double sumOfHeight=0.0;
		  
		  for(int i=0;i<11; i++){
		      System.out.print("Enter the height of player" + (i+1) + ": ");
			  //taking input footballTeam from user
			      footballTeam[i] = sc.nextDouble();
				  // adding the footballTeam to sumOfHeight
				  sumOfHeight += footballTeam[i];		   
		  }
		  //calculating the meanHeight
		  double meanHeight = sumOfHeight/11;
		  //printing the meanHeight
		  System.out.print("The mean height of the football playeris: " + meanHeight);
	}
}