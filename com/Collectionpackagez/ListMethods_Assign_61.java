package com.Collectionpackagez;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* WAP on list methods: add(), addAll(), remove(), removeAll(),
   contains(), containsAll(), isEmpty(), iterator(), ListIterator(),
   size(), get(), set() and demonstrating List properties (duplicates/nulls). */

public class ListMethods_Assign_61 {

	public static void main(String[] args) {

		System.out.println("--- 1. Demonstrating Core List Properties ---");
		List<String> a1 = new ArrayList<>();
		a1.add("MKT");
		a1.add("PKT");
		a1.add("JKT");
		a1.add("MKT"); // Property 1: Lists allow duplicate values
		a1.add(null); // Property 2: Lists allow null values
		System.out.println("Original List a1: " + a1);

		System.out.println("\n--- 2. Adding Collections (addAll) ---");
		List<String> a2 = new ArrayList<>(Arrays.asList("Java", "Python", "C#"));
		a1.addAll(a2); // Merges all items from a2 into a1
		System.out.println("List a1 after addAll(a2): " + a1);

		System.out.println("\n--- 3. Fetching and Updating (size, get, set) ---");
		System.out.println("Total size of the list: " + a1.size());
		System.out.println("Item at index 2: " + a1.get(2));

		a1.set(2, "UPDATED_JKT"); // Replaces the value at index 2
		System.out.println("After setting new value at index 2: " + a1);

		System.out.println("\n--- 4. Removing Elements (remove, removeAll) ---");
		a1.remove(0); // Removes the item exactly at index 0 (The first "MKT")
		System.out.println("After remove(0): " + a1);

		a1.remove("UPDATED_JKT"); // Removes the specific object by its name
		System.out.println("After remove(\"UPDATED_JKT\"): " + a1);

		a1.removeAll(a2); // Strips out every single element that belongs to a2
		System.out.println("After removeAll(a2): " + a1);

		System.out.println("\n--- 5. Verifying Elements (contains, containsAll, isEmpty) ---");
		// This will be false because we just used removeAll(a2) which removed "Java"
		boolean containsJava = a1.contains("Java");
		System.out.println("Does a1 contain 'Java'? " + containsJava);

		boolean containsAllA2 = a1.containsAll(a2);
		System.out.println("Does a1 contain all elements of a2? " + containsAllA2);

		System.out.println("Is list a1 empty? " + a1.isEmpty());

		System.out.println("\n--- 6. Iteration using Iterator (Forward Only) ---");
		Iterator<String> itr1 = a1.iterator();
		while (itr1.hasNext()) {
			System.out.println("Iterator fetched: " + itr1.next());
		}

		System.out.println("\n--- 7. Iteration using ListIterator (Forward & Backward) ---");
		ListIterator<String> itr2 = a1.listIterator();

		System.out.println("-> Moving Forward:");
		while (itr2.hasNext()) {
			System.out.println("ListIterator forward: " + itr2.next());
		}

		System.out.println("-> Moving Backward:");
		while (itr2.hasPrevious()) {
			System.out.println("ListIterator backward: " + itr2.previous());
		}
	}
}
