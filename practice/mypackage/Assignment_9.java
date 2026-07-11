package practice.mypackage;

public class Assignment_9 {

	public static void main(String[] args) {
		 // 1. Math.max(a, b) - Finds the highest number
        int maxNumber = Math.max(45, 85);
        System.out.println("Maximum value between 45 and 85 is: " + maxNumber);

        // 2. Math.min(a, b) - Finds the lowest number
        int minNumber = Math.min(45, 85);
        System.out.println("Minimum value between 45 and 85 is: " + minNumber);

        // 3. Math.abs(a) - Gives the absolute (positive) value, ignoring the minus sign
        int negativeNum = -150;
        System.out.println("Absolute value of -150 is: " + Math.abs(negativeNum));

        // 4. Math.sqrt(a) - Finds the Square Root of a number
        double squareRoot = Math.sqrt(64);
        System.out.println("Square root of 64 is: " + squareRoot);

        // 5. Math.random() - Generates a random double value between 0.0 and 1.0
        double randomFraction = Math.random();
        System.out.println("A random fraction between 0 and 1: " + randomFraction);

        // 6. Generating a random whole number between 1 and 100
        int randomWholeNum = (int) (Math.random() * 100);
        System.out.println("A random fraction between 0 and 100): " + randomWholeNum);

	}

}
