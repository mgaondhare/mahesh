import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_3 
{
	public class TestNG_day1 {
		WebDriver driver;	
	@BeforeTest
	public void m1() {
		System.out.println("Starting of the implementation of the test cases");	
	}	
	@Test (priority=1)
	public void test() throws Exception{
		WebDriverManager.chromedriver().setup();
		   driver=new ChromeDriver();		
		driver.get("https://www.naukri.com/");	
		driver.close();
	}	
	@Test (priority=2,dependsOnMethods=("test3"))
	public void test2() throws Exception {		
		WebDriverManager.chromedriver().setup();
		   driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/V4/index.php");	
		driver.close();			
	}
	@Test (priority=3,invocationCount=2)
	public void test3() throws Exception {		
		WebDriverManager.chromedriver().setup();
		   driver=new ChromeDriver();		
		driver.get("https://www.facebook.com/");		
		driver.close();			
	}
	@AfterTest
	public void m2(){	
		driver.quit();	
	}	
}}