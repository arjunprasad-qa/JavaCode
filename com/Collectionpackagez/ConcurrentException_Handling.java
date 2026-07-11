package com.Collectionpackagez;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.List;

public class ConcurrentException_Handling {

	public static void main(String[] args) {

		System.out.println("--- Demonstrating Handled ConcurrentModificationException ---");

		// 1. Create a standard List and add elements
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Selenium");

		// 2. Make the list synchronized
		List<String> syncList = Collections.synchronizedList(list);

		// 3. We wrap the risky loop inside a try-catch block!
		try {
			synchronized (syncList) {
				for (String tool : syncList) {
					System.out.println("Reading: " + tool);

					if (tool.equals("Java")) {
						// 4. Modify the list directly while iterating!
						// This instantly throws the exception...
						syncList.add("TestNG");
					}
				}
			}
		}

		catch (ConcurrentModificationException e) {
			// 5. ...and this block immediately catches it!
			System.out.println("-> CAUGHT THE ERROR: Someone wrote on the clipboard!");
		}

		// 6. Because the exception was safely caught, the program survives and this
		// line WILL print!
		System.out.println("Program finished successfully.");
	}
}