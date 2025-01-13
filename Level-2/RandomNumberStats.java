import java.util.*;
import java.util.Scanner;

public class RandomNumberStats {

    public  int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            // Generate random number between 1000 and 9999
            randomNumbers[i] = (int) (Math.random() * 9000) + 1000; 
        }
        return randomNumbers;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        // Array to store average, min, and max
		double[] result = new double[3]; 
        int sum = 0;

        for(int i=0; i<numbers.length; i++){
		   sum +=numbers[i];
		}
        
		// Calculate average
        result[0] = (double) sum / numbers.length; 
     
		// Find minimum and maximum values using loop
        int min = numbers[0];
        int max = numbers[0];
        for (int i=0; i<numbers.length;i++) {
			// Update min if a smaller value is found
            min = Math.min(min, numbers[i]); 
			// Update max if a larger value is found
            max = Math.max(max, numbers[i]); 
        }
        // Store minimum value
        result[1] = min; 
		// Store maximum value
        result[2] = max; 
		

        return result;
    }

    public static void main(String[] args) {
        int size = 4;
		
	    RandomNumberStats numbers = new RandomNumberStats();
		// Generate 4 random numbers
        int[] randomNumbers = numbers.generate4DigitRandomArray(size);

        for(int i=0;i<4;i++){
		System.out.println("Generated random number" +(i+1) + " is: " + randomNumbers[i]);
		}
		
		
		RandomNumberStats minMaxAvg = new RandomNumberStats();
        double[] stats = minMaxAvg.findAverageMinMax(randomNumbers);

        System.out.println("Average: " + stats[0]);
        System.out.println("Minimum: " + stats[1]);
        System.out.println("Maximum: " + stats[2]);
    }
}