package practice.mypackage;

import java.util.Scanner;

public class Assignment_15 {

	public static void main(String[] args) {
	    // Creating Scanner object to read human input from the console
        Scanner scanner = new Scanner(System.in);

        // 1. Ask the user to input a number
        System.out.print("Enter any whole number: ");
        int number = scanner.nextInt(); 

        System.out.println("\n--- Checking Number ---");

        // 2. The Logic: Any number perfectly divisible by 2 (remainder is 0) is Even
        if (number % 2 == 0) {
            System.out.println("Number" +" " + number + " is an EVEN number.");
        } 
        // 3. Otherwise, it is Odd
        else {
            System.out.println("Number" + number + " is an ODD number.");
        }

        // Close the scanner class
        scanner.close();
	}

}
