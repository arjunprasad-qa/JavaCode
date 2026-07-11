package com.Collectionpackagez;

import java.util.HashMap;
import java.util.Map;

public class MapProg_1 {

	public static void main(String[] args) 
	
		{
	
			Map<String,Integer> m1=new HashMap<String,Integer>();
			m1.put("Rice",null);
			m1.put("Sugar",2);
			m1.put("Jaggery", 3);
			m1.put("Cereals",25);
			System.out.println(m1);
			
			/*If the specified key is not already associated with a value (or is mapped to null ) then
			  associates it with the given value and returns null , else returns the current value.*/
			System.out.println(m1.putIfAbsent("Rice", 4));			
			System.out.println(m1.putIfAbsent("Apple", 8));
			
			
			System.out.println(m1.size());
			System.out.println(m1);
			
			System.out.println(m1.keySet()); //Returns a set view of the mapped keys
			System.out.println(m1.values()); //Creates a collection of the values of a map
		
			
			System.out.println(m1.containsKey("Sugar"));
			System.out.println(m1.containsValue(2));
			
			//Replaces the entry for the specified key only if it is currently mapped to some value.
			m1.replace("Sugar", 20);
			System.out.println(m1);
			
			//remove() --> //Removes an element’s key mapping
			m1.remove("Sugar");
			System.out.println(m1);
			
			
			//Returns the value mapped with the specified key or null if the key is not mapped
			System.out.println(m1.get("Apple"));
			
			
			//Copy one Map data into Another Map
			Map<String,Integer> m2= new HashMap<>();
			m2.putAll(m1);
			
			boolean b1 = m2.equals(m1);
			System.out.println(b1);
			
			
					
		}
		}

