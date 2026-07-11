package Packageselenium2;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment_55 {

	public static void main(String[] args) {

		ArrayList<String> a1 = new ArrayList<String>();

		a1.add("MKT");
		a1.add("Surya");
		a1.add("Mani");
		System.out.println(a1);

		boolean b = a1.contains("MKT");
		System.out.println(b);

		ArrayList<String> str = new ArrayList<String>(Arrays.asList("Sam", "Akash", "Narayan"));

		boolean b6 = str.contains("Sam");
		System.out.println(b6);
		System.out.println(str);

		boolean b1 = str.equals(a1);
		System.out.println(b1);

		boolean b2 = str.containsAll(a1);
		System.out.println(b2);

	}
}
