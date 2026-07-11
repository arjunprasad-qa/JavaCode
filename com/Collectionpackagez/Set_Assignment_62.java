package com.Collectionpackagez;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Assignment_62 {

	public static void main(String[] args) {

		Set<String> s1 = new HashSet<>(Arrays.asList("MKT", "UKT", "GKT", "Null"));
		System.out.println("original Set : " + s1);

		Set<String> s2 = new HashSet<>(Arrays.asList("Manish", "Arya", "Rohin", "Null", "Sam", "Null"));

		// Merges all items from s2 into s1
		s1.addAll(s2);
		System.out.println("Merged Set : " + s1);

		// Size of Set
		System.out.println("Size of Set : " + s1.size());

		s1.remove("Rohin");
		System.out.println("After removing 'Rohin' element from set : " + s1);

		System.out.println(s1.contains("Arya"));
		System.out.println("s1 contains s2 ? : " + s1.containsAll(s2));

		Iterator<String> it = s1.iterator();
		System.out.println("Iterator using iterator --> Forward iteration only");
		while (it.hasNext()) {
			System.out.println("Iterator fetched: " + it.next());
		}

		// Checking whether Set is Empty ?

		System.out.println(s1.isEmpty());
		// Clear Set
		s1.clear();
		System.out.println("Clearing Set : " + s1);

		System.out.println("Is Empty : " + s1.isEmpty());

		System.out.println("Final Set looks like : " + s1);
	}

}
