import java.util.*;

public class FootballTeamHeights {
    
	// Method to find the sum of all elements in the array
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int i=0;i<arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // Method to find the mean height of the players
    public static double calculateMeanHeight(int[] arr) {
        return (double) calculateSum(arr) / arr.length;
    }

    // Method to find the shortest height of the players
    public static int findShortestHeight(int[] arr) {
        int shortest = arr[0];
        for (int i=1;i<arr.length;i++) {
            if (arr[i] < shortest) {
                shortest = arr[i];
            }
        }
        return shortest;
    }

    // Method to find the tallest height of the players
    public static int findTallestHeight(int[] arr) {
        int tallest = arr[0];
        for (int i=1;i<arr.length; i++) {
            if (arr[i] > tallest) {
                tallest = arr[i];
            }
        }
        return tallest;
    } 
    public static void main(String[] args) {
		// Array to store heights of 11 players
        int[] heights = new int[11]; 

        // Generate random heights for each player
        Random rand = new Random();
        for (int i = 0; i < heights.length; i++) {
			// Random height between 150 and 250 cm
            heights[i] =  150 + (int) (Math.random() * 101); 
        }

        // Find shortest, tallest, and mean height
        int shortest = findShortestHeight(heights);
        int tallest = findTallestHeight(heights);
        double mean = calculateMeanHeight(heights);

        // Display results
        System.out.println("Shortest Height: " + shortest + " cm");
        System.out.println("Tallest Height: " + tallest + " cm");
        System.out.println("Mean Height: " + mean + " cm");
    }

    
}