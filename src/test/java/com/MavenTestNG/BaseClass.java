package com.MavenTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseClass {
	
	WebDriver driver;
	
	@Test
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
	}

}
