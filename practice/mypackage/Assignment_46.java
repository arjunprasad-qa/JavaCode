package practice.mypackage;

import java.util.Arrays;

public class Assignment_46 {

	public static void main(String[] args) {

		int[] originalArray = { 10, 42, 5, 99, 18 };
		int[] reversedArray = new int[originalArray.length];

		// Both initialization and updates are handled inside the loop controls
		for (int i = originalArray.length - 1, j = 0; i >= 0; i--, j++) {
			reversedArray[j] = originalArray[i];
		}

		System.out.println("Original Array: " + Arrays.toString(originalArray));
		System.out.println("Reversed Array: " + Arrays.toString(reversedArray));

	}
}
