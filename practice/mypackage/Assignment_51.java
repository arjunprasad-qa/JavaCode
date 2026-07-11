package practice.mypackage;

import java.util.Arrays;

public class Assignment_51 {

	public static void main(String[] args) {

		String str = "Automation Framework QA";

		String str1 = new String("Automations for QE");

		System.out.println(str.concat(" Testing"));

		boolean b1 = str.equalsIgnoreCase(str1);
		System.out.println(b1);

		String s1[] = str.split(" ");
		System.out.println(Arrays.toString(s1));

		String s2[] = str.split(" ", 2);
		System.out.println(Arrays.toString(s2));

		boolean b2 = str1.matches("(.*)for(.*)");
		System.out.println(b2);
	}

}
