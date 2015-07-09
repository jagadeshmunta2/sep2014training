package com.jd;

import java.util.StringTokenizer;

/**
 * Second exmaple on Java Strings
 * 
 * @author Jagadesh Babu Munta
 *
 */
public class StringSample2  {
	String str = "This. This is a new String This!";
	
	public static void main(String myargs[]) {
		System.out.println("Test program");
		StringSample2 sample2 = new StringSample2();
		sample2.strToChars(sample2.str);
		System.out.println(sample2.sub(sample2.str, 6));
		System.out.println(sample2.sub(sample2.str, 6, 11));
		System.out.println(sample2.replaceChar(sample2.str, 'i', 'a'));
		System.out.println(sample2.convertToUpper(sample2.str));
		System.out.println(sample2.convertToLower(sample2.str));
		System.out.println("Is it starting with Hello?"+sample2.isStartingWith(sample2.str, "Hello"));
		System.out.println("Is it starting with This?"+sample2.isStartingWith(sample2.str, "This"));
		System.out.println("HELlo".equals("hello"));
		System.out.println("HELlo".equalsIgnoreCase("hello"));
		System.out.println("HELlo".toLowerCase().equals("hello"));
		System.out.println("HELlo".toUpperCase().equals("HELLO"));
		System.out.println(sample2.search(sample2.str,"hello"));
		System.out.println(sample2.search(sample2.str,"This"));
		System.out.println(sample2.search(sample2.str,"this"));
		System.out.println(sample2.searchIgnoreCase(sample2.str,"this"));
		sample2.testStringBuffer();
		sample2.testTokenizer();
		
		String n = "100";
		System.out.println(n+200);
		int n1 = Integer.parseInt(n);
		System.out.println(n1+200);
	}
	
	public void strToChars(String s) {
		char [] chars = s.toCharArray();
		String s1 = new String(chars);
		if (s.equals(s1)) {
			System.out.println("Both strings are equal = "+s);
		} else {
			System.out.println("Both strings are NOT equal :"+s+"<>"+s1);			
		}
	}
	
	public String sub(String s, int pos ) {
		String subs1 = s.substring(pos);
		return subs1;
	}
	
	public String sub(String s, int sp, int ep ) {
		String subs1 = s.substring(sp, ep);
		return subs1;
	}
	
	public String replaceChar(String s, char c1, char c2) {
		//System.out.println("Debug: c1="+c1);
		//s.replace(c1, c2);
		return s.replace(c1, c2);		
	}
	
	public String convertToUpper(String s) {
		return s.toUpperCase();
	}
	
	public String convertToLower(String s) {
		return s.toLowerCase();
	}
	//  1-10, 11-25,
	//  id,  name
	
	public boolean isStartingWith(String s, String with) {
		return s.startsWith(with);
	}
	
	public boolean isEndingWith(String s, String with) {
		return s.endsWith(with);
	}
	
	public boolean search(String s, String s1) {
		/*int pos = s.indexOf(s1); // -1 if not found else exact position
		if (pos==-1) {
			return false;
		} else {
			return true;
		}*/
		
		if (s.indexOf(s1)==-1) { // This is a string 
			return false;
		} else {
			return true;
		}
	}

	public boolean searchIgnoreCase(String s, String s1) {
		/*int pos = s.indexOf(s1); // -1 if not found else exact position
		if (pos==-1) {
			return false;
		} else {
			return true;
		}*/
		
		if (s.toLowerCase().indexOf(s1.toLowerCase())==-1) {
			return false;
		} else {
			return true;
		}
	}
	
	public void testStringBuffer(){
		// 10 hellos -- hello1, hello2..
		String s = "";
		for (int i=1;i<=10;i++) {
			s=s+"hello"+i+",";
		}
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer();
		for (int i=1;i<=10;i++) {
			sb.append("hello").append(i).append(",");
		}		
		s = sb.toString();
		System.out.println(s);
		System.out.println(sb.reverse().toString());
		if (s.equals(sb.reverse().toString())) {
			System.out.println("It is a palindrome.");
		} else {
			System.out.println("It is not a palindrome.");			
		}

		StringBuilder sb1 = new StringBuilder();
		for (int i=1;i<=10;i++) {
			sb1.append("hello");
			sb1.append(i);
			sb1.append(",");
		}	
		s = sb1.toString();
		System.out.println(s);
		
	}
	
	public void testTokenizer() {
		String s = "This is a new String";
		StringTokenizer st = new StringTokenizer(s," ");
		System.out.println("Word count="+st.countTokens());
		String s1 = null;
		String [] words = new String[st.countTokens()];
		int i=0;
		while (st.hasMoreTokens()) {
			words[i] = st.nextToken();
			System.out.println(words[i]);
			i++;
		}
		
		StringBuilder sb = new StringBuilder();
		for (int j=i-1;j>=0;j--) {
			sb.append(words[j]).append(" ");			
		}
		
		String reverse = sb.toString();
		System.out.println(reverse);
	}
	
	public void test() {
		char c ='.';
		if (c=='.') {
			System.out.println("found .");
		}
	}
	
}
