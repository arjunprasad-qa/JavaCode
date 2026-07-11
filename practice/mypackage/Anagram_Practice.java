package practice.mypackage;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram_Practice {

	public static void main(String[] args) {

		// human input
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter your Word1");
		String c1 = s1.next();
		System.out.println("Please enter your Word2");
		String c2 = s1.next();
		/*
		 * String c1 ="tone"; String c2 ="note";
		 */
		if (c1.length() != c2.length()) {
			System.out.println("Not Anagram");
		} else {
			char[] a = c1.toCharArray();
			char[] b = c2.toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);

			if (Arrays.equals(a, b)) {
				System.out.println("Anagram");
				System.out.println("a" + Arrays.toString(a));
				System.out.println("b" + Arrays.toString(b));
			}

			else {
				System.out.println("Not an ANagram");
			}
			s1.close();
		}
	}
}
