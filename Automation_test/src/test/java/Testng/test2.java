package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test2 {
WebDriver driver;			// hard Assert
	@BeforeMethod
	public void test1() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
	}
	@Test
	public void test3() throws Exception {
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("maheshgaondhare@gmail.com");
	//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	//	wait.until(ExpectedConditions.visibilityOf(email)).click();
		Thread.sleep(5000);
		WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
		pass.sendKeys("78789813837");
		Thread.sleep(5000);
		WebElement button=driver.findElement(By.xpath("//button[@name='login']"));
		button.click();
		Thread.sleep(5000);
		String expected = "Faceook";
		String actual   = driver.getTitle();
		System.out.println(actual);
		Assert.assertEquals(actual, expected);//fail
		System.out.println("Log in to Facebook");
	}
	@AfterMethod
	public void AF()
{
		driver.close();
}
}
