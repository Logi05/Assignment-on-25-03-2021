package com.test;
import java.util.HashMap;
import java.util.Map;
public class HashMapEg 
 {
	public static void main(String args[])
	{
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		map.put(1, 500);
		map.put(2, 1000);
		map.put(3, 1500);
		map.put(4, 2000);
		map.put(null, null);
		map.put(5, null);

		System.out.println(map);
		for(Map.Entry<Integer, Integer> m:map.entrySet())
		{
			System.out.println("Key is: "+m.getKey()+" "+"Value is: "+m.getValue());
		}
		
		System.out.println(map.containsKey(3));
		System.out.println(map.containsValue(null));
		
		System.out.println(map.get(2));		

		map.remove(2);
		System.out.println("After removing an element: ");
		System.out.println(map);
		
		System.out.println("After adding an element: ");
		map.putIfAbsent(6, 2500);
		System.out.println(map);
	}
	}


