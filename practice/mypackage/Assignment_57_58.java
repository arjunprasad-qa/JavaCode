package practice.mypackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class Assignment_57_58 {

	public static void main(String[] args) {

		ArrayList<String> str = new ArrayList<String>(Arrays.asList("MKT", "GroTech", "Minds"));

		Iterator<String> itr = str.iterator();

		System.out.println("Iteration using Iterator in forward direction");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		ListIterator<String> i2 = str.listIterator();
		System.out.println("Iteration using ListIterator in forward Direction:");
		while (i2.hasNext()) {
			System.out.println(i2.next());
		}
		System.out.println("Iteration using ListIterator in backword Direction:");
		while (i2.hasPrevious()) {
			System.out.println(i2.previous());
		}
	}

}
