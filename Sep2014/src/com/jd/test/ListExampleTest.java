/**
 * 
 */
package com.jd.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Jagadesh Babu Munta
 *
 */
public class ListExampleTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeClass...");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterClass...");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("@Before...");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("@After...");
	}

	@Test
	public void test3() {
		System.out.println("test3()");
		Assert.assertEquals("Sum is not equal", 25, (10+15));
	}
	
	@Test
	public void test1() {
		System.out.println("test1()");
		
	}

	@Test
	public void test2() {
		System.out.println("test2()");
		String s = "Hello";
		Assert.assertNotNull("s should not be null",s);
	}
	

}
