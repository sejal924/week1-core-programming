import java.util.Scanner;

public class YoungestTallest {
    public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
       
       //creating an array of size 3	   
       int [] age = new int[3];
       int [] height = new int[3];
       
       for(int i=0; i<3; i++){
	       //taking the input age and height from user
	       System.out.print("Enter the age of friend" +(i+1) + ": ");
		   age[i] = sc.nextInt();
		   System.out.print("Enter the height of friend" +(i+1) + ": ");
		   height[i] = sc.nextInt();  
      } 
	  
	    //creating the variable for storing youngestAge and tallestHeight
	    int youngestAge = age[0];
	    int tallestHeight =height[0];
		
		//finding youngest  and tallest person
        for(int i=1; i<3; i++){
		     if(age[i]<youngestAge){
			    youngestAge = i ;
			 }
			 if(height[i]>tallestHeight){
			    tallestHeight = i;
			 }
      }
	  //printing 
       System.out.println("The youngest friend among three friend is friend" + youngestAge);
       System.out.println("The tallest friend among three friend is friend" + tallestHeight);	   
	}
}
