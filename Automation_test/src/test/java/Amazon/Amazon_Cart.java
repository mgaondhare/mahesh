package Amazon;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.utility.BaseClass;

import net.bytebuddy.utility.RandomString;

public class Amazon_Cart extends BaseClass {

	@Test
	public void VerifyAddToCartFunctionalityWithDelete() throws Exception {
	
	WebElement search =driver.findElement(By.xpath("//input[@type='text']"));
	search.sendKeys("mobile under 10000");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(1000);
	
	JavascriptExecutor js =(JavascriptExecutor) driver;
	
	WebElement asus=driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]"));
	js.executeScript("arguments[0].scrollIntoView()",asus);
	Thread.sleep(2000);
	asus.click();
	Thread.sleep(1000);
	
	driver.navigate().refresh();
	WebElement title=driver.findElement(By.xpath("//span[@class='a-size-large product-title-word-break']"));
	String gettitle=title.getText();
	System.out.println(gettitle);
	Thread.sleep(1000);
	
	WebElement price=driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-price'])[4]"));
	String getprice = price.getText();
	System.out.println(getprice);
	Thread.sleep(1000);
	
//	String rm = RandomString.make(5);
//	String path ="/home/mahesh/eclipse-workspace/Automation_test/ScreenShot//";
//
//	TakesScreenshot ts=(TakesScreenshot) driver;
//	File src=ts.getScreenshotAs(OutputType.FILE);
//	File dstn= new File("/home/mahesh/eclipse-workspace/Automation_test/screenShot","mobile.png");
//	FileUtils.copyFile(src, dstn);
//	driver.navigate().refresh();

	driver.findElement(By.xpath("//span[@class='a-button text']")).click();
	Thread.sleep(50000);
	}
}
