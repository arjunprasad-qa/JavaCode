package practice.mypackage;

import java.util.Scanner;

public class ReverseStr_Practice {

	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your String");
		String str1 = s1.next();

		String str2 = "";

		for (int i = str1.length() - 1; i >= 0; i--) {
			char ch = str1.charAt(i);
			str2 = str2 + ch;

		}
		System.out.println("Reverse String is " + str2);

		if (str2.equals(str1)) {
			System.out.println("Palindrome");
		}
		/*
		 * else { System.out.println("Not Palindrome"); }
		 */
		s1.close();

	}

}
