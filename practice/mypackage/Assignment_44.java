package practice.mypackage;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_44 {

	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);

		System.out.println("Enter Array Size");
		int size = s1.nextInt();

		// Initialize the array with the user defined Size
		System.out.println("Enter your Element");
		int[] a1 = new int[size];
		for (int i = 0; i < size; i++) {
			a1[i] = s1.nextInt();
		}
		System.out.println(Arrays.toString(a1));

		s1.close();

	}

}
