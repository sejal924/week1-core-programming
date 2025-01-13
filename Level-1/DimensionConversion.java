import java.util.Scanner;

public class DimensionConversion{
    public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		
		//taking the input row from user
		System.out.print("Enter the row: ");
		int row = sc.nextInt();
		//taking the input column from user
		System.out.print("Enter the column: ");
		int column = sc.nextInt();
		
		//creating the two Dimensional array 
		int [][] twoDimension = new int[row][column];
		
		//taking input row and column
		for(int i=0;i<row;i++){
		  for(int j=0;j<column;j++){
		     System.out.print("Enter the number: ");
               	twoDimension[i][j] = sc.nextInt();	 
		 }
		}
		//creating the one dimensional array of size row*column
		int[] oneDimension = new int[row * column];
		int index=0;
		
		//converting the two Dimensional array into one dimensional
		for(int i=0;i<row;i++){
		  for(int j=0;j<column;j++){
		      oneDimension[index] = twoDimension[i][j];
			  index++;
         }
		 }
		 //printing the one dimensional array
		 System.out.print("The array in one dimension is: ");
		 for(int i=0;i<row * column;i++){
		  System.out.print(oneDimension[i]+" ");
		 }
	}
}