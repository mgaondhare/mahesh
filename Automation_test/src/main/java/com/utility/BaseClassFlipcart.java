package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassFlipcart {

	public WebDriver driver;
	@BeforeMethod
	public void browserOpen() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
//	@Test
//	public void test4() {
//		System.out.println("mahesh");
//	}
	@AfterMethod
	public void browserClose() {
		driver.quit();
	}
	
}
