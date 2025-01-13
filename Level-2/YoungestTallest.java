import java.util.Scanner;

public class YoungestTallest {
    
	// Find index of the friend with the youngest age
    public static int findYoungest(int[] ages) {
        int youngestIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        return youngestIndex;
    }

    // Find index of the friend with the tallest height
    public static int findTallest(double[] heights) {
        int tallestIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        return tallestIndex;
    }

    // Get friend's name 
    public static String getFriendName(int index) {
        String[] names = {"Amar", "Akbar", "Anthony"};
        return names[index]; 
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		// Array to store ages of friends
        int[] ages = new int[3];

        // Array to store heights of friends
        double[] heights = new double[3];

        // Taking input for age and height
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of friend" + (i+1) + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter the height (in cm) of friend" + (i+1) + ": ");
            heights[i] = sc.nextDouble();
        }
		
        // Find youngest friend
        int youngest = findYoungest(ages);
        String youngestName = getFriendName(youngest);
        System.out.println("Youngest friend is: " + youngestName);

        // Find tallest friend
        int tallest = findTallest(heights);
        String tallestName = getFriendName(tallest);
        System.out.println("Tallest friend is: " + tallestName);

        sc.close();

    }
}