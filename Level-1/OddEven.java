//printing the odd and even numbers array
import java.util.Scanner;

public class OddEven{
    public static void main(String [] args){
	    Scanner sc = new Scanner(System.in);
		
		//taking the input number from user
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		//checking whether the number is natural or not
		if(number<1){
		System.err.print("error");
		}
		else{
			//creating an oddArray and evenArray of size number/2+1
		int[] oddArray = new int[number/2+1];
		int[] evenArray = new int[number/2+1];
		//creating the variable i and j
		int i=0;	
		int j=0;
		for(int k=1; k<=number ;k++){
			//checking whether the number is even or odd
		    if(k%2==0){
			  evenArray[i]=k;
			  i++;
			}
			else{
			  oddArray[j]=k;
			  j++;
			 }
		}
		//printing the value of even array
		for(int q =0; q <evenArray.length-1 ; q++){  
		   System.out.println(evenArray[q]);
		}
		//printing the value of odd array
		for(int r =0; r <oddArray.length-1; r++){  
		   System.out.println(oddArray[r]);
		}
		
	   }	
	}
}