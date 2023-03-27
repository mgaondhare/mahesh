package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.utility.BaseClass;

public class HomePagePom extends BaseClass {

	@Test
	public void addToCart() throws Exception {
	
	WebElement search_btn=driver.findElement(By.xpath("//input[@name='field-keywords']"));

	search_btn.sendKeys("asus a555l laptop");
	WebElement search_bar=driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']"));
	
	search_bar.click();
	Thread.sleep(3000);
	
	
	
//	js.executeScript("window.scrollBy(0,1000)", "");
//	Thread.sleep(2000);
	WebElement asus=driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
//	JavascriptExecutor js=(JavascriptExecutor) driver;
//	js.executeScript("arguments[0].scrollIntoView()",redmi10);
	
	asus.click();
	Thread.sleep(1000);
	driver.navigate().refresh();
	WebElement text=driver.findElement(By.xpath("//span[@class='a-size-large product-title-word-break']"));
	String title=text.getText();
	System.out.println(text.getText());
	Thread.sleep(3000);
	driver.navigate().refresh();
	WebElement getprice=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[5]"));
	String price=getprice.getText();
	System.out.println(getprice.getText());
	Thread.sleep(3000);
//	redmi10.getText();
//	
	
	
	}
}
