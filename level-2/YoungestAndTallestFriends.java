//
import java.util.Scanner;

public class YoungestAndTallestFriends 
{
    public static void main(String [] args)
	{
	      Scanner sc = new Scanner(System.in);
		  
		  System.out.print("Enter the age of amar: ");
		  int ageOfAmar = sc.nextInt();
		  System.out.print("Enter the age of akbar: ");
		  int ageOfAkbar = sc.nextInt();
		  System.out.print("Enter the age of anthony: ");
		  int ageOfAnthony = sc.nextInt();
		  
		  System.out.print("Enter the height of amar: ");
		  double heightOfAmar = sc.nextDouble();
		  System.out.print("Enter the height of akbar: ");
		  double heightOfAkbar = sc.nextDouble();
		  System.out.print("Enter the height of anthony: ");
		  double heightOfAnthony = sc.nextDouble();
		  
		  //checking smallest age among the friends
		  if(ageOfAmar<ageOfAkbar && ageOfAmar<ageOfAnthony){
		   System.out.print("The smallest age having among the friends is: "+ ageOfAmar); 
	      }
	      else if(ageOfAkbar<ageOfAmar && ageOfAkbar<ageOfAnthony){
		   System.out.print("The smallest age having among the friends is: "+ ageOfAkbar);
		   }
		    else{
		   System.out.print("The smallest age having among the friends is: "+ ageOfAnthony); 
	     }
		 //checking tallest height among the friends
		 if(heightOfAmar>heightOfAkbar && heightOfAmar>heightOfAnthony){
		  System.out.print("The tallest person among the friends is: " + heightOfAmar);
		 }
         else if(heightOfAkbar>heightOfAmar && heightOfAkbar>heightOfAnthony){
		  System.out.print("The tallest person among the friends is: " + heightOfAkbar);
		 }
		 else {
		  System.out.print("The tallest person among the friends is: " + heightOfAnthony);
		 }
	}
}