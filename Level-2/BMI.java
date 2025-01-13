import java.util.Scanner;

public class BMI{
    public static void main(String [] args){
	    Scanner sc =new Scanner(System.in);
        
		//taking the input number from user
		System.out.print("Enter number of person: ");
		int number = sc.nextInt();
		
		//creating an array of length number
		double[] weight = new double[number];
		double[] height = new double[number];
		double[] BMI    = new double[number];
		String[] weightStatus = new String[number];
		
		//taking the weight , height of a person
		for(int i=0; i<number; i++){
		    System.out.print("Enter the weight of person" + (i+1) + ":");
			weight[i] = sc.nextDouble();
			System.out.print("Enter the height of person" + (i+1)+ ":");
			height[i] = sc.nextDouble();
			
			//calculating BMI
            BMI[i]    = weight[i]/(height[i] * height[i]);	
			
			//checking the BMI value for weight status
            if(BMI[i] <= 18.4){
		       weightStatus[i]= "Underweight";
		  }
		  else if(BMI[i] >=18.5 && BMI[i] <=24.9){
		       weightStatus[i]= "Normal";
		  }
		  else if(BMI[i] >=25.0 && BMI[i] <=39.9){
		       weightStatus[i]= "Overweight";
		  }
		  else {
		       weightStatus[i]= "Obese";
		  }			
		}
		//printing the value of weight , height , BMI and weightStatus
		for(int i=0; i<number; i++){
		     System.out.println("The height of the person" + (i+1) + " is " + height[i]);
			 System.out.println("The weight of the person" + (i+1) + " is " + weight[i]);
			 System.out.println("The BMI of the person" + (i+1) + " is " + BMI[i]);
			 System.out.println("The weight status of the person" + (i+1) + " is " + weightStatus[i]);
		}
		 
	}
}