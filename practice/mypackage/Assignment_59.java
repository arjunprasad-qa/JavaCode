package practice.mypackage;

import java.util.ArrayList;
import java.util.List;

public class Assignment_59 {

	public static void main(String[] args) {

		// Upcasting from ArrayList to LIST
		List<String> l1 = new ArrayList<String>();
		l1.add("Ram");
		l1.add("Sita");
		l1.add("Laxman");
		l1.add(null);
		l1.add(null);

		System.out.println(l1);

		l1.iterator();

		l1.listIterator();

	}

}
