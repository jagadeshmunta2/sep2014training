package com.jd.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.jd.Calculator;

import static org.junit.Assert.*;

public class CalculatorTest {
	
	@BeforeClass
	public static void setup() {
		
	}
	
	@AfterClass
	public static void unsetup() {
		
	}

	@Test
	public void addTest1() {
		int r = Calculator.add(10, 50);
		assertEquals("Addition is not correct", 60, r );
		r = Calculator.add(0, 0);
		assertEquals("Addition is not correct", 0, r );
		r = Calculator.add(-1, 1);
		assertEquals("Addition is not correct", 0, r );
		//r = Calculator.add(Integer.MAX_VALUE, Integer.MAX_VALUE);
		//assertEquals("Addition is not correct", Integer.MAX_VALUE, r );
		//r = Calculator.add(Integer.MIN_VALUE, Integer.MIN_VALUE);
		//assertEquals("Addition is not correct", Integer.MIN_VALUE, r );

	}

	@Test
	@Ignore
	public void subTest1() {
		int r = Calculator.sub(10, 50);
		assertEquals("Sub not correct ", -40, r);
	}
	
	@Test(timeout=5000)
	public void timeTest1() {
		int r = Calculator.sub(10, 50);
		assertEquals("Sub not correct ", -40, r);
		//for(;;);
	}
	
	@Test(expected=NullPointerException.class)
	public void exceptTest() {
		String s=null;
		System.out.println(s.length());
	}
	
	
}
