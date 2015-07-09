package com.seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstSeleniumWDTest {
	
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
