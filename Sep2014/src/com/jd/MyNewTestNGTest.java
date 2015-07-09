package com.jd;

import static org.testng.Assert.*;

import org.testng.TestNG;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class MyNewTestNGTest {
  @Test(groups={"smoke","srg","lrg"}, dependsOnMethods={"f4"}, dataProvider = "dp" )
  public void f1(Integer n1, Integer n2, String s) {
	  assertEquals(n1.intValue()*2,n2.intValue(),s);
  }

  @Test(groups={"smoke","lrg"}, dataProvider = "dp")
  public void f2(Integer n1, Integer n2, String s) {
	  assertEquals(n1.intValue()*2,n2.intValue(),s);
  }

  @Test(groups={"srg","lrg"},dependsOnMethods={"f2"}, dataProvider = "dp")
  public void f3(Integer n1, Integer n2, String s) {
	  assertEquals(n1.intValue()*2,n2.intValue(),s);
  }

  @Test(groups={"srg","lrg"}, dependsOnMethods={"f3"}, dataProvider = "dp")
  public void f4(Integer n1, Integer n2, String s) {
	  assertEquals(n1.intValue()*2,n2.intValue(),s);
  }
  
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, 2, "a" },
      new Object[] { 2, 4, "b" },
      new Object[] { 3, 6, "c" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  //fail("Error");
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

  public static void main(String [] args) {
	  TestNG testng = new TestNG();
	  testng.setTestClasses(new Class[] { MyNewTestNGTest.class});
	  testng.run();
	  }  
  
  
}
