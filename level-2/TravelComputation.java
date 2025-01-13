import java.util.Scanner;

public class TravelComputation {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        // Taking user inputs for name, cities, and distances
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter your starting city (fromCity): ");
        String fromCity = sc.nextLine();
        
        System.out.print("Enter your viaCity: ");
        String viaCity = sc.nextLine();
        
        System.out.print("Enter your destination city (toCity): ");
        String toCity = sc.nextLine();
        
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
        double fromToVia = sc.nextDouble();
        
        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
        double viaToFinalCity =sc.nextDouble();
        
        System.out.print("Enter the total time taken for the journey (in hours): ");
        double timeTaken = sc.nextDouble();
        
        // Calculate the total distance traveled
        double totalDistance = fromToVia + viaToFinalCity;
        
        // Calculate the average speed of the journey
        double averageSpeed = totalDistance / timeTaken;
        
        // Print the results
        System.out.println("\nJourney Details for " + name + ":");
        System.out.println("Starting City: " + fromCity);
        System.out.println("Via City: " + viaCity);
        System.out.println("Destination City: " + toCity);
        System.out.println("Distance from " + fromCity + " to " + viaCity + ": " + fromToVia + " miles");
        System.out.println("Distance from " + viaCity + " to " + toCity + ": " + viaToFinalCity + " miles");
        System.out.println("Total distance traveled: " + totalDistance + " miles");
        System.out.println("Total time taken: " + timeTaken + " hours");
        System.out.println("Average speed of the journey: " + averageSpeed + " miles/hour");
        
    
        sc.close();
    }
}