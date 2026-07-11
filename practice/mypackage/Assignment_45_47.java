package practice.mypackage;

import java.util.Arrays;

public class Assignment_45_47 {

	public static void main(String[] args) {

		int a1[] = { 1, 2, 3, 4, 5 };
		int a2[] = new int[5];
		for (int i = 0; i < a1.length; i++) {
			a2[i] = a1[i];
		}

		System.out.println("Input Array a1[] : " + Arrays.toString(a1));

		System.out.println("Output Array a2[] : " + Arrays.toString(a2));

		if (Arrays.equals(a2, a1)) {
			System.out.println("Arrays are equal");
		}

		else {
			System.out.println("Arrays are not equal");
		}
	}
}
