package com.Collectionpackagez;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FetchValueFromMap {

	public static void main(String[] args) {
		
		Map <String,Integer> m3 = new HashMap<>();
		m3.put("Arjun", 12345);
		m3.put("Manish", 18345);
		m3.put("Sourav", 127345);
		
		System.out.println(m3);
		
		//Case 1: Using EntrySet to fetch both key and value
		
		//let's use for each loop to fetch key and value
		//fetching both key and value using entryset method
		
		
		for(Map.Entry<String,Integer> value1: m3.entrySet())
		{
			System.out.println(value1);
		}
		
		/*
		 Set<Entry<String, Integer>> s2= m3.entrySet();//the pair of values

	        System.out.println("Iteration using Iterator:");
	                Iterator<Entry<Integer, String>> j1= s2.iterator();
	                while(j1.hasNext())
	                {
	                        System.out.println(j1.next());                }  */
	                
	}

}
