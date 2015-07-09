package com.jd.test;

import java.util.Arrays;
import java.util.Collection;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.jd.Calculator;

import static org.junit.Assert.*;

@RunWith(value=Parameterized.class)
public class ParamCalculatorTest {
	int a=0, b=0, e=0;
	
	public static void main(String []args) {
		Result res = JUnitCore.runClasses(ParamCalculatorTest.class);
		System.out.println("Run count:"+res.getRunCount());
		System.out.println("Fail count:"+res.getFailureCount());
		System.out.println("Ignore count:"+res.getIgnoreCount());
		System.out.println("*** Failures ***");
		for (Failure f: res.getFailures()) {
		System.out.println(f);
		}
		System.out.println("Is Test case successful?"+res.wasSuccessful());		
	}
	
	public ParamCalculatorTest(int a, int b, int e) {
		this.a = a;
		this.b = b;
		this.e = e;
	}
	
	@BeforeClass
	public static void setup() {
		
	}
	
	@AfterClass
	public static void unsetup() {
		
	}

	@Test
	public void addTest1() {
		int r = Calculator.add(a, b);
		assertEquals("Addition is not correct", e, r );
		String os = "hello"; //rev(is);
		String es = "hello";
		assertEquals("Strings are not equal",es, os);
	}
	
	/*
	
	@Test
	public void subTest1() {
		//int r = Calculator.sub(10, 50);
		//assertEquals("Sub not correct ", -40, r);
	}

	
	@Test(timeout=5000)
	@Ignore
	public void timeTest1() {
		int r = Calculator.sub(10, 50);
		assertEquals("Sub not correct ", -40, r);
		//for(;;);
	}
	
	@Test(expected=NullPointerException.class)
	@Ignore
	public void exceptTest() {
		String s=null;
		System.out.println(s.length());
	}
*/
	@Parameters
	public static Collection<Object[]> testData() {
		Object [][] d = {
				{10,50,60},
				{0,0,0},
				{-1,1,0},
				{2500000,35,2500035},
				{-25,-35,-60},
				{-25,35,-10}
		};
		return Arrays.asList(d);
		
	}
	
	
}
