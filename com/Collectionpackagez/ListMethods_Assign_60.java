package com.Collectionpackagez;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

/* WAP on list methods:add() ,addall() ,remove(),removeall()
,contains(),containsAll(),isempty(),iterator(),	ListIterator() */

public class ListMethods_Assign_60 {

	public static void main(String[] args) {

		ArrayList<String> a1 = new ArrayList<>();
		a1.add("MKT");
		a1.add("PKT");
		a1.add("JKT");
		System.out.println(a1);

		ArrayList<String> a2 = new ArrayList<>(Arrays.asList("Java", "Python", "C#"));
		a1.addAll(a2);
		System.out.println(a1);

		a1.remove(0);
		System.out.println(a1);

		a1.remove("JKT");
		System.out.println(a1);

		boolean b = a1.contains("Javaa");
		System.out.println(b);

		boolean bool = a1.containsAll(a2);
		System.out.println(bool);

		System.out.println(a1.isEmpty());

		Iterator<String> itr1 = a1.iterator();
		System.out.println("Iteration using Irerator - Forward direction");
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		ListIterator<String> itr2 = a1.listIterator();
		System.out.println("Iteration using ListIrerator - Forward direction");
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		System.out.println("Iteration using ListIrerator - backward direction");
		while (itr2.hasPrevious()) {
			System.out.println(itr2.previous());
		}

	}

}
