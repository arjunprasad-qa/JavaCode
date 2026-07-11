package com.Collectionpackagez;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorLegacyClass_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Create a Vector (Default initial capacity is 10)
		Vector<String> v1 = new Vector<>();

		// 2. addElement(Object obj) -> Legacy method to add items
		v1.addElement("Reema");
		v1.addElement("Rahul");
		v1.addElement("Amit");
		v1.addElement("Priya");
		v1.add("null");

		System.out.println("--- Basic Vector Info ---");
		System.out.println("Current Vector: " + v1);

		// size() tells you how many items are ACTUALLY in the vector
		System.out.println("Size (Number of elements): " + v1.size());

		// capacity() -> Just like the length of the underlying Array
		System.out.println("Capacity (Total available slots): " + v1.capacity());

		/*
		 * Iteration using Enumeration (The Legacy) // We use the elements() method to
		 * get the Enumeration
		 */
		System.out.println("-------------------------------------------------");

		System.out.println("1. Iteration using Enumeration:");
		Enumeration<String> e = v1.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

		System.out.println("-------------------------------------------------");
		/*
		 * Iteration using Iterator (The Universal Way) // We use the iterator() method
		 */

		System.out.println("2. Iteration using Iterator (Forward only):");
		Iterator<String> it = v1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("-------------------------------------------------");

		/*
		 * Iteration using ListIterator (The Advanced Way) // We use the listIterator()
		 * method
		 */

		System.out.println("3. Iteration using ListIterator (Moving forward):");
		ListIterator<String> lit3 = v1.listIterator(); // Start at the very end

		while (lit3.hasNext()) {
			System.out.println(lit3.next());
		}

		System.out.println("3. Iteration using ListIterator (Moving forward):");
		// ListIterator<String> lit = v1.listIterator(); // Start at the very end

		while (lit3.hasPrevious()) {
			System.out.println(lit3.previous());
		}

		System.out.println("\n--- Fetching Elements ---");
		// firstElement() -> Gets the first item (Index 0)
		System.out.println("First Element: " + v1.firstElement());

		// lastElement() -> Gets the last item in the list
		System.out.println("Last Element: " + v1.lastElement());

		System.out.println("\n--- Removing Elements ---");
		// removeElement(Object obj) -> Removes the specific object
		v1.removeElement("Amit");
		System.out.println("After removing 'Amit': " + v1);

		// removeElementAt(int index) -> Removes the element at the given index
		v1.removeElementAt(1); // Removes "Rahul" (which is now at index 1)
		System.out.println("After removing element at index 1: " + v1);

		System.out.println("\n--- Clearing the Vector ---");
		// removeAllElements() -> Empties the entire Vector
		v1.removeAllElements();
		System.out.println("After removeAllElements(), Size is now: " + v1.size());

		// Notice that even though we removed all elements, the capacity remains 10!
		System.out.println("Capacity after clearing: " + v1.capacity());
	}

}
