package practice.mypackage;

import java.util.Scanner;

public class Assignment_12 {

	public static void main(String[] args) {
		
		// Creating Scanner object to read human input
        Scanner s1 = new Scanner(System.in);

        // 1. Collecting Human Input for Account Type
        System.out.print("Enter your Account Type (Platinum / Gold / Standard): ");
        String actualAccountType = s1.next(); // Reads the word typed by the user

        // 2. Collecting Human Input for Withdrawal Amount
        System.out.print("Enter the amount you want to withdraw: ");
        int withdrawalAmount = s1.nextInt(); // Reads the number typed by the user

        System.out.println("\n--- Processing ATM Transaction ---");

            
        // IF Block: Matches if user types "Platinum"
        if ("Platinum".equals(actualAccountType)) {
            System.out.println("Platinum Account Validated.");
            System.out.println("Limit Allowed: Up to  Rs 1,00,000/day.");
            
            //  Added the nested condition here to match Gold and Standard!
            if (withdrawalAmount <= 100000) {
                System.out.println("Success! Dispensing cash: "  + withdrawalAmount);
            } else {
                System.out.println("Transaction Declined: Amount exceeds Platinum daily limit");
            }
        } 
        
        // ELSE IF Block: Matches if user types "Gold"
        else if ("Gold".equals(actualAccountType)) {
            System.out.println("Gold Account Validated.");
            System.out.println("Limit Allowed Up to ₹50,000 per day.");
            
            if (withdrawalAmount <= 50000) {
                System.out.println("Success! Dispensing cash:"  + withdrawalAmount);
            } else {
                System.out.println("Transaction Declined: Amount exceeds Gold daily limit");
            }
        } 
        
        // ELSE Block: Catch all input if anything else typed

        else {
            System.out.println("Standard / Other Account Type Detected.");
            System.out.println("Limit Allowed: Up to ₹20,000 per day.");
            
            if (withdrawalAmount <= 20000) {
                System.out.println("Success! Dispensing cash:" + withdrawalAmount);
            } else {
                System.out.println("Transaction Declined: Amount exceeds Standard daily limit");
            }
        }

        // Close the scanner class
        s1.close();

	}

}
