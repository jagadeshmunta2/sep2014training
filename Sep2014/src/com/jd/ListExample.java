/**
 * 
 */
package com.jd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Jagadesh Babu Munta
 *
 */
public class ListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		example1();
		example2();
	}
	
	public static void example1() { // utilities 
		List<String> list = new ArrayList<String>(); // initial capacity = 16
		System.out.println("Is empty?"+list.isEmpty()); // true
		System.out.println("#of names:"+list.size()); // 0
		
		list.add("First name");
		printSize(list); // 1
		list.add("Second Name");
		printSize(list); // 2
		
		list.add("Malik");
		list.add("Malik");
		list.add("Babu");
		list.add("Jayaprakash");
		
		printSize(list);
		
		list.remove(0);
		printSize(list);// First name removed
		
		boolean isAvailable = list.contains("Malik");
		System.out.println("Is Malik availabe?"+isAvailable); // true
		isAvailable = list.contains("First Name");
		System.out.println("Is First Name availabe?"+isAvailable); // false
		
		// 1st style to get all elements
		int index = 1;
		System.out.println("List of names:");
		for (String name: list) {
			System.out.println((index++)+"."+name);
		}
		// 2nd style in getting all elements
		System.out.println("List of names(using 2nd style):");
		Iterator it = list.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
		
		
		Collections.sort(list);
		System.out.println("After sorting:\n"+list);
		
		Collections.reverse(list);
		System.out.println("After reverse:\n"+list);

		Collections.shuffle(list);
		System.out.println("After shuffle:\n"+list);
		Collections.shuffle(list);
		System.out.println("After shuffle:\n"+list);
		
		int pos = list.indexOf("Malik");
		int pos2 = list.indexOf("Jayaprakash");
		System.out.println("pos="+pos+",pos2="+pos2);
	}

	
	public static void example2() {
		
		List<String> list = new LinkedList<String>();
		list.add("Malik");
		list.add("Malik");
		list.add("Jayaprakash");
		list.add("Babu");
		System.out.println(list);
		
		list.remove("Babu");
		list.remove("Malik");
		
		System.out.println(list);
		
		list.clear();
		System.out.println(list);
		
	}
	
	public static void printSize(List<String> list) {
		System.out.println("Is empty?"+list.isEmpty()); 
		System.out.println("#of names:"+list.size());
		System.out.println(list);
		
	}
	

}
