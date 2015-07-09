package com.seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.opera.core.systems.OperaDriver;

import static org.testng.Assert.*;

public class MyFirstSeleniumMoreBrowsersWDTest {
	
	WebDriver driver = null;
	String url1 = "http://www.facebook.com";
	String browser = System.getProperty("browser","ie"); 
			
	@BeforeClass
	public void setup() {
		//open browser
		if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\seleniumdrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver","C:\\seleniumdrivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else if (browser.equals("safari")) {
			driver = new SafariDriver();
		} else if (browser.equals("opera")) {
			driver = new OperaDriver();
		} else {
			driver = new FirefoxDriver();
		}
		//open url
		driver.get(url1);
	}
	
	@AfterClass
	public void unsetup() {
		driver.quit();
	}
	
	@Test
	public void fbLoginTest() {
		//3. Locate the webelement
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("xxx@gmail.com");
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("xxx");
		
		pass.submit();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		
		WebElement name = driver.findElement(By.xpath("//*[@id='blueBarNAXAnchor']/div[1]/div/div/div[1]/ul/li[1]/a/span"));
		String value = name.getText();
		System.out.println("Name="+value);
		assertEquals(value,"Jagadesh");
	}
	
	@Test(dependsOnMethods={"fbLoginTest"})
	public void test2() {
		assert(true);
	}

	@Test(dependsOnMethods={"test2"})
	public void fbLogoutTest() {
		//*[@id='userNavigationLabel']
		///*[@id='logout_form']/label/input
		WebElement menu = driver.findElement(By.id("userNavigationLabel"));
		menu.click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		
		WebElement logout = driver.findElement(By.xpath("//*[@id='logout_form']/label/input"));
		logout.click();
		
	}
	
	public static void main(String []args) {
		
		String url1 = "http://www.facebook.com";
		//FirefoxDriver driver = new FirefoxDriver();
		//1. Open the browser -- driver initialization
		
		WebDriver driver = new FirefoxDriver();
		
		//2. Go to the URL
		driver.get(url1);
		
		//3. Locate the webelement
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("xxxx");
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("xxxx");
		
		pass.submit();
		
		WebElement name = driver.findElement(By.xpath("//*[@id='blueBarNAXAnchor']/div[1]/div/div/div[1]/ul/li[1]/a/span"));
		String value = name.getText();
		System.out.println("Name="+value);
		
		
		
		//*[@id='userNavigationLabel']
		///*[@id='logout_form']/label/input
		WebElement menu = driver.findElement(By.id("userNavigationLabel"));
		menu.click();
		WebElement logout = driver.findElement(By.xpath("//*[@id='logout_form']/label/input"));
		logout.click();
		
		// close the browser
		driver.close();
		
		
	}

}
