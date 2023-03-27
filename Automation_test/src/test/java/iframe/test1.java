package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("file:///home/mahesh/iframe.html.html");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//		driver.findElement(By.xpath("//a[text()=' Click here for Login FaceBook ']")).click();
		
//		driver.switchTo().frame(1);
//	driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
//	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
//
//	WebElement downld=driver.findElement(By.xpath("//span[text()='Downloads']"));
//	wait.until(ExpectedConditions.visibilityOf(downld)).click();
	WebElement one1=driver.findElement(By.xpath("//iframe[@name='MVN']"));
	driver.switchTo().frame(one1);
	WebElement search=driver.findElement(By.xpath("//input[@type='text']"));
	search.sendKeys("maven");
	}
}