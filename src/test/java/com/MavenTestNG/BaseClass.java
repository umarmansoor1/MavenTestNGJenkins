package com.MavenTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BaseClass {
	
	WebDriver driver;
	
	@Test
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void failThis() {
		Assert.assertEquals(14, 14);
	}

}
