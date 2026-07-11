package Packageselenium2;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment_54 {

	public static void main(String[] args) {

		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("MKT");
		a1.add("Surya");
		a1.add("Mani");
		System.out.println(a1);
		boolean b = a1.contains("MKT");
		System.out.println(b);
		System.out.println(a1);
		a1.remove(0);
		System.out.println(a1);

		ArrayList<Character> initial = new ArrayList<Character>();
		initial.add('A');
		initial.add('W');
		initial.add('P');
		System.out.println(initial);

		ArrayList<Double> salary = new ArrayList<Double>();
		salary.add(12.1);
		salary.add(10.9);
		salary.add(12.3);
		System.out.println(salary);

		ArrayList<String> str = new ArrayList<String>(Arrays.asList("Sam", "Akash", "Narayan"));

		str.addAll(a1);
		System.out.println(str);

		str.addAll(0, a1);
		System.out.println(str);
	}

}
