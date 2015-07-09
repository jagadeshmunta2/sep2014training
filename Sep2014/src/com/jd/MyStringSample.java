/**
 * 
 */
package com.jd;

/**
 * This is a sample class to demonstrate Java Strings.
 * 
 * @author Jagadesh Babu Munta
 * 
 */
public class MyStringSample {

	String s = "Hello";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyStringSample sample = new MyStringSample();
		// sample.example1();
		// sample.example2();
		// System.out.println(sample.reverseString("Hello123456789Thanks"));
		// System.out.println(sample.reverseString("madam"));
		sample.words("Hello World! another ");
	}

	public static void example1() {
		String s = "Hello";
		char[] c1 = { 'H', 'e', 'l', 'l', 'o' };
		String s1 = new String(c1);
		System.out.println(s);
		System.out.println(s1);
		String s2 = new String(s);
		System.out.println(s2);
		String s3 = new String(10 + "");
		System.out.println(s3);
	}

	public void example2() {
		String s = "Hello";
		int l = s.length();
		char c = s.charAt(4);
		System.out.println(s + " length=" + l + ",character at 4th position="
				+ c);
		String s1 = "World";
		String newstring = s.concat(s1);
		System.out.println("New string=" + newstring + ",s=" + s); // 300
		s = s.concat(s1); // 350
		s = "My string"; // 400
		s1 = s; // Strings will always make a copy -- because immutable
		System.out.println("New string=" + newstring + ",s=" + s);
		String newstring2 = s + s1; // concate of s and s1
		for (int i = 1; i <= 10; i++) {
			s = s + "," + i;
		}
		System.out.println(s);

		char[] chars = new char[s.length()]; // doesn't have any reference -- no
												// address reference
		s.getChars(0, s.length(), chars, 0);
		System.out.println(chars);
		for (int i = 0; i < chars.length; i++) {
			System.out.print("'" + chars[i] + "',");
		}
		/*
		 * s.getChars(0, 4, chars, 15); System.out.println(chars); for (int i=0;
		 * i<chars.length;i++) { System.out.print("'"+chars[i]+"',"); }
		 */

		System.out.println();
		char[] nchars = new char[s.length()];
		int j = 0;
		for (int i = chars.length - 1; i >= 0; i--) {
			// System.out.print(chars[i]);
			nchars[j++] = chars[i];
		}

		String reverse = new String(nchars);
		System.out.println(reverse);
	}

	/**
	 * Reverse of a given string
	 * 
	 * @param s
	 * @return
	 */
	public String reverseString(String s) {
		// 1. Get all chars from given string
		char[] chars = new char[s.length()]; // doesn't have any reference -- no
												// address reference
		s.getChars(0, s.length(), chars, 0);
		// 2. Copy last chars to first chars in a new char array
		char[] nchars = new char[s.length()];
		int j = 0;
		for (int i = chars.length - 1; i >= 0; i--) {
			nchars[j++] = chars[i];
		}
		return new String(nchars);
	}

	public void words(String s) {
		// 1. Split into the words by split method
		String[] words = s.split(" ");
		System.out.println("Number of words=" + words.length);
		for (String word : words) {
			System.out.println(word);
		}

		// Print each word backwards
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i] + " ");
		}

		// I am the world! --- world! the am I

		String largeString = "Hello World -- \"this is beautiful!\"";
		System.out.println(largeString);

		s = "      hello world            ";
		String s1 = "hello world";
		if (s.equals(s1)) { // ==
			System.out.println("s and s1 are equal");
		} else {
			System.out.println("s and s1 are NOT equal");
		}

		System.out.println(s + ";after trim() = " + s.trim());
		if (s.trim().equals(s1)) { // ==
			System.out.println("s and s1 are equal");
		} else {
			System.out.println("s and s1 are NOT equal");
		}

		String sub = s.trim().substring(4);
		System.out.println(sub);
		sub = sub.substring(1, 4);
		System.out.println(sub);
		if (true) {
			System.out.println("Always true");
		}

	}

}
