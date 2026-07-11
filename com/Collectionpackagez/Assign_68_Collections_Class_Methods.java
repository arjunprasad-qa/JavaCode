package com.Collectionpackagez;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assign_68_Collections_Class_Methods {

	public static void main(String[] args) {

		ArrayList<String> s1 = new ArrayList<>(Arrays.asList("Sameer", "Jana", "Ramesh"));
		System.out.println("ArrayList before Sorting : " + s1);

		Collections.sort(s1); // Return type - Void
		System.out.println(s1); // List sorted with Ascending Order once you print Obviously

		Collections.reverse(s1); // List will be Reversed simply
		System.out.println(s1);

		Collections.sort(s1, Collections.reverseOrder()); // No return type - Void
		System.out.println(s1);

		ArrayList<Integer> i1 = new ArrayList<>(Arrays.asList(11, 34, 5, 11, 5, 45, 11));
		// Collections.min(i1); // No return type - Void
		System.out.println("Min Vlaue : " + Collections.min(i1));
		System.out.println("Max Vlaue : " + Collections.max(i1));
		System.out.println("Frequency of Element : " + Collections.frequency(i1, 11));

		List<Integer> a1 = new ArrayList<>(Arrays.asList(111, 345, 5, 101, 50));

		List<Integer> l12 = Collections.synchronizedList(a1);
		System.out.println("Synchronized List : " + l12);
		int a = Collections.binarySearch(l12, 5);
		System.out.println("Index of 5 : " + a);

		Set<String> s21 = new HashSet<>(Arrays.asList("Sam", "Rahul", "Tapannu"));
		Set<String> ss = Collections.synchronizedSet(s21);
		System.out.println("Synchronized Set : " + ss);

		Map<Integer, String> m1 = new HashMap<>();
		m1.put(1, "Hindi");
		m1.put(1, "English");

		Map<Integer, String> sm = Collections.synchronizedMap(m1);
		System.out.println("Synchronized Map : " + sm);

		Map<Integer, String> um = new HashMap<>();
		um.put(1, "Sam");
		um.put(2, "Samm");
		um.put(3, "Same");

		System.out.println(um);
		Map<Integer, String> newum = Collections.unmodifiableMap(um);
		newum.put(1, "Pam");
		System.out.println(newum);
	}

}
