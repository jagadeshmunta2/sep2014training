package com.jd;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestException {
	
	public static void main(String [] args) {
		TestException te = new TestException();
		te.test1(null);
		te.test1("Hello");
		te.test2();
		try {
			te.test3();
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println("WARNING: test.txt file is not found! existing the program.");
		}
		
		try {
			te.test4();
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println("WARNING: test3.txt file is not found! existing the program.");
			System.out.println(e.getMessage());
		}
		
		try {
			te.test5(100);
		} catch (EmpNotThereException e) {
			e.printStackTrace();
		}
		
	}

	
	public void test1(String s) {
		//
		try {
			System.out.println("String length="+s.length());
		} catch (NullPointerException npe) {
			//System.out.println("--- got NPE!");
			s = "Default";
		}
		System.out.println(s+":"+s.length());
	}
	
	
	public void test2() {
		File f = new File("test.txt");
		BufferedReader reader = null;
		try {
			 reader = new BufferedReader(new FileReader(f));
			 
		} catch (FileNotFoundException e) {
			System.out.println("In catch block...");
			//e.printStackTrace();
			System.out.println("Error message:"+e.getMessage());
		} finally {
			System.out.println("Closing the file..");
			try {
				if (reader!=null) {
					reader.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		//
	}
	
	
	public void test3() throws FileNotFoundException { // or throws IOException or throws Exception
		File f = new File("test3.txt");
		BufferedReader reader = new BufferedReader(new FileReader(f));		
	}
	
	public void test4() throws FileNotFoundException { // or throws IOException or throws Exception
		File f = new File("test3.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(f));
		} catch (FileNotFoundException ex) {
			System.out.println("File not found in test4!");
			//throw ex; // re-throw the exception
			throw new FileNotFoundException("test3.txt not there!");
		}
	}
	
	public void test5(int empNo) throws EmpNotThereException{
		if (empNo<1) {
			throw new EmpNotThereException("Employee number is negative or zero is not accepted");
		} else {
			System.out.println("Given emp no:"+empNo);
		}
	}
}
