package com.jd;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class SetExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		set1();
	}
	
	public static void set1() {
		//Set<String> set = new HashSet<String>();
		//Set<String> set = new TreeSet<String>();
		Set<String> set = new LinkedHashSet<String>();
		set.add("item4");
		set.add("item1");
		set.add("item2");
		set.add("item3");
		
		int numItems = set.size();
		System.out.println("Number of items:"+numItems+"\nItems list:"+set);
		
		// print all elements in a collection -- set
		Iterator it = set.iterator();
		while(it.hasNext()) {
			String item = (String) it.next(); // cast to required object
			System.out.println(item);
		}
		
		// 2nd way to print all elements in a collection
		for (String item: set) {
			System.out.println(item);
		}
		set.add("item2");
		set.add("item5");
		numItems = set.size();
		System.out.println("Number of items:"+numItems+"\nItems list:"+set);
		set.add("item6");
		numItems = set.size();
		System.out.println("Number of items:"+numItems+"\nItems list:"+set);
		
	}

}
