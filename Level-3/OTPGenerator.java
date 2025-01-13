import java.util.*;


public class OTPGenerator {

    public static int generateOTP() {
        //Random rand = new Random();
		// Generate a 6-digit random number between 100000 and 999999
        int otp = 100000 + (int)(Math.random()*900000) ; 
        return otp;
    }

    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length - 1; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
					// If any two OTPs are the same, return false
                    return false; 
                }
            }
        }
		// All OTPs are unique
        return true; 
    }

    public static void main(String[] args) {
        int[] generatedOTPs = new int[10];

        for (int i = 0; i < 10; i++) {
            generatedOTPs[i] = generateOTP();
        }
        
		
        if (areOTPsUnique(generatedOTPs)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Some OTPs are duplicates.");
        }
		for (int i = 0; i < 10; i++) {
            System.out.print(generatedOTPs[i] + " , ");
        }
    }
}