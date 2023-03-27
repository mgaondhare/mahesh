package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test3 {
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
		Thread.sleep(3000);
		WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
		pass.sendKeys("78789813837");
		Thread.sleep(2000);
		WebElement button=driver.findElement(By.xpath("//button[@name='login']"));
		button.click();
		Thread.sleep(2000);
		SoftAssert soft = new SoftAssert(); // object create
		String expected = "Facebook";
		String actual   = driver.getTitle();
		soft.assertEquals(expected, actual);
		System.out.println("successfuly open");//2 test
		soft.assertAll();
	}
	@AfterMethod
	public void AF()
{
		driver.close();
}}