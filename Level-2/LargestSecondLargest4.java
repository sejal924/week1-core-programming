import java.util.Scanner;

public class  LargestSecondLargest4{
    public static void main(String [] args){
	    Scanner sc = new Scanner(System.in);
		
        // Taking input number from user		
		System.out.print("Enter the number: ");
		long number = sc.nextLong();
		
		int maxDigit=10;
		long[] digits = new long[maxDigit];
		int index=0;
		
		while(number>0 ){
		   if(index == maxDigit){
			   //increasing the maxDigit 
		    maxDigit +=10;
			
			//creating the new array 
			long[] temp = new long[maxDigit];
			for(int i=0;i<index;i++){
				//assigning the value of digit array to temp array
			   temp[i]=digits[i];
			}
			digits=temp;
		}
			//assisgning the digit of a number to array
		    long remainder= number%10;
			digits[index]=remainder;
			number = number/10;
			index++;
		}
		//finding largest and second largest
		long largest=0;
		long secLargest =0;
		for(int i=0;i<index; i++){
		    if(digits[i]>largest) {
			secLargest=largest;
			largest=digits[i];
			}
			else if(digits[i]>secLargest && largest!=digits[i]){
			    secLargest =digits[i];
			}
		}
		//printing the value of largest and second largest
        System.out.println("The largest number is: " + largest);
        System.out.println("The second largest number is: " + secLargest);		
	 }
}