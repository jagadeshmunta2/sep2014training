package com.jd;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		map1();
	}

	public static void map1() {
		System.out.println("*** Hash Map Example ***");
		Map<String, Integer> population = new HashMap<String, Integer>();
		updateMap(population);
		System.out.println("*** Tree Map Example ***");
		Map<String, Integer> population1 = new TreeMap<String, Integer>();
		updateMap(population1);
		System.out.println("*** LinkedHash Map Example ***");
		Map<String, Integer> population2 = new LinkedHashMap<String, Integer>();
		updateMap(population2);				
	}
	
	public static void updateMap(Map<String,Integer> population) {

		population.put("Nellore", 2);
		population.put("Hyd", 100);
		population.put("Kadapa", 2);

		System.out.println(population); // debugging
		int nellorePop = population.get("Nellore").intValue();
		System.out.println("Nellore population=" + nellorePop);

		Map<String, Integer> indiaPop = new HashMap<String, Integer>();
		indiaPop.putAll(population);
		System.out.println(indiaPop); // debugging


		Set<String> cities = population.keySet();
		Collection<Integer> vals = population.values();

		for (String city : cities) {
			System.out.println(city + "=" + population.get(city));
		}

		long totalPop = 0;
		for (Integer val : vals) {
			totalPop = totalPop + val;
		}
		System.out.println("Total population="+totalPop);
		population.clear();
		System.out.println(population); // debugging
	}

}
