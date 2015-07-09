package com.jd;

public class JavaMisc {
	
	public static void main(String []args) {
		
		fortest1();
	}

	public static void fortest1() {
		
		String [] numbers = {"ONE","TWO","THREE"};
		
		for(String str : numbers ) {
			System.out.println(str);
		}
		
		for (int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		
	}
}
