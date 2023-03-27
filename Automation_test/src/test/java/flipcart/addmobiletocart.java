package flipcart;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.utility.BaseClassFlipcart;

import net.bytebuddy.utility.RandomString;

public class addmobiletocart extends BaseClassFlipcart {

	@Test
	public void verifyaddtocartfunctionalitywithdelete() throws Exception {
		
//		1.Open browser and provide URL
//		2.cancel login page
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		
//		3.Enter value to search bar
		WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys("asus a555l laptop battery");
		
//		4.click on Search
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);

//		5 click on product
		driver.findElement(By.xpath("//a[@title='SellZone Replacement Laptop Battery Compatible For ASUS A555L 6 Cell Laptop Battery']")).click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);

//		6.navigate to child window
		Set<String> allid=driver.getWindowHandles();
		List<String> id=new ArrayList(allid);
		String pid=id.get(0);
		String cid=id.get(1);
		driver.switchTo().window(cid);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		
//		7.Capture screenshot of product
		TakesScreenshot ts=(TakesScreenshot) driver;
		String path="/home/mahesh/eclipse-workspace/Automation_test/flipcartScreenshot//";
		String rm =RandomString.make(4);
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dstn = new File(path+rm+".png");
		FileUtils.copyFile(src, dstn);
		
//		8.click on remove button
		driver.findElement(By.xpath("//div[text()='Remove']")).click();
		Thread.sleep(3000);
		
//		9.click on alert page
		driver.findElement(By.xpath("(//div[text()='Remove'])[1]")).click();
		driver.navigate().refresh();
		Thread.sleep(5000);
		
//		10.take screenshot of child window
		String path1="/home/mahesh/eclipse-workspace/Automation_test/flipcartScreenshot//";
		String rm1 =RandomString.make(9);
		File src1 = ts.getScreenshotAs(OutputType.FILE);
		File dstn1 = new File(path+rm1+".png");
		FileUtils.copyFile(src1, dstn1);
		Thread.sleep(5000);
		
//		11.verify actual and expected result
		String Expected="Shopping Cart | Flipkart.com";
		String Actual=driver.getTitle();
//		System.out.println(Actual);
		Assert.assertEquals(Actual, Expected);
	}
}
