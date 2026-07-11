package com.Collectionpackagez;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConcurrentException_Collections_SyncMethod {

	public static void main(String[] args) {

		System.out.println("--- Demonstrating Unhandled ConcurrentModificationException ---");

		// 1. Create a standard List and add elements
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Selenium");

		// 2. Make the list synchronized
		List<String> syncList = Collections.synchronizedList(list);

		// 3. Iterate over the synchronized list
		synchronized (syncList) {
			for (String tool : syncList) {
				System.out.println("Reading: " + tool);

				if (tool.equals("Java")) {
					// 4. Modify the list directly while iterating!
					// This instantly corrupts the Iterator's modCount snapshot.
					syncList.add("TestNG");
				}
			}
		}

		// 5. This line will NEVER print because the program crashes during the loop!
		System.out.println("Program finished successfully.");
	}
}
