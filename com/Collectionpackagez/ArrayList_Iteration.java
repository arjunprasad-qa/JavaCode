package com.Collectionpackagez;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Iteration {

	public static void main(String[] args) {

		ArrayList<String> a1 = new ArrayList<>();

		a1.add("MKT");
		a1.add("NKT");
		a1.add("GKT");

		System.out.println(a1);

		/*
		 * Iterate using for loop for (int i = 0; i < a1.size(); i++) {
		 * System.out.println(a1.get(i)); }
		 * 
		 */

		// Iterate using for each loop
		for (String abc : a1) {
			System.out.println(abc);
		}

		// Sort an ArrayList of Strings:

		Collections.sort(a1);
		System.out.println(a1);
		for (String str : a1) {
			System.out.println(str);
		}

	}

}
