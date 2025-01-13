import java.util.Scanner;

public class  LargestSecondLargest3{
    public static void main(String [] args){
	    Scanner sc = new Scanner(System.in);
		 
		// Taking input number from user
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		int maxDigit=10;
		// Creating the array of size maxDigit
		int[] digits = new int[maxDigit];
		int index=0;
		
		//assisgning the digit of a number to array
		while(number>0 && index< maxDigit){
		    int remainder= number%10;
			digits[index]=remainder;
			number = number/10;
			index++;
		}
		
		int largest=0;
		int secLargest =0;
		//finding largest and second largest
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