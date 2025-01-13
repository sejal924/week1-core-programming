import java.util.Scanner;

public class BMI1{
    public static void main(String [] args){
	    Scanner sc =new Scanner(System.in);
        
		//taking the input number from user
		System.out.print("Enter number of person: ");
		int number = sc.nextInt();
		
		//creating an two dimension array
		double[][] personData = new double[number][3];
		String[] weightStatus = new String[number];
		
		//taking the weight , height of a person
		for(int i=0;i<number;i++){
		      do{
			     System.out.print("Enter the weight of person" + (i+1) + ":");
			     weight[i][0] = sc.nextDouble();
                 if (weight[i][0] < 0) {
                    System.out.println("Invalid weight ,enter a weight again");
                }				 
		}while(weight[i][0]<0);
		      do{
			     System.out.print("Enter the height of person" + (i+1) + ":");
			     height[i][1] = sc.nextDouble();
                 if (height[i][1] < 0) {
                    System.out.println("Invalid height ,enter a height again");
                }				 
		}while(height[i][1]<0);      
		
		//calculating BMI
		BMI[i][2]   = weight[i][0]/(height[i][1] * height[i][1]);
        //checking the BMI value for weight status		
		if(BMI[i][2] <= 18.4){
		       weightStatus[i]= "Underweight";
		  }
		  else if(BMI[i][2] >=18.5 && BMI[i][2] <=24.9){
		       weightStatus[i]= "Normal";
		  }
		  else if(BMI[i][2] >=25.0 && BMI[i][2] <=39.9){
		       weightStatus[i]= "Overweight";
		  }
		  else {
		       weightStatus[i]= "Obese";
		  }				
		
    }
	    //printing the value of weight , height , BMI and weightStatus
		for(int i=0; i<number; i++){
		     System.out.println("The weight of the person" + (i+1) + " is " + weight[i][0]);
			 System.out.println("The height of the person" + (i+1) + " is " + height[i][1]);
			 System.out.println("The BMI of the person" + (i+1) + " is " + BMI[i][2]);
			 System.out.println("The weight status of the person" + (i+1) + " is " + weightStatus[i]);
		}
	
  }
}