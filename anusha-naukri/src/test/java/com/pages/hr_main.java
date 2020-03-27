package com.pages;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.excel.excel_utility;

public class hr_main extends login_main{

//To send login Details
public void login_search() throws IOException, InterruptedException
{  
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id=\"login_Layer\"]/div")).click();
driver.findElement(By.id("eLoginNew")).sendKeys("janardhana.selenium3@gmail.com");
driver.findElement(By.id("pLogin")).sendKeys("ammuanu@$");
driver.findElement(By.xpath("//*[@id=\"lgnFrmNew\"]/div[9]/button")).click();
}
//To Follow hr
public void follow() throws InterruptedException {
	Thread.sleep(3000);
	WebElement a = driver.findElement(By.xpath("/html/body/div[1]/div/div/ul[1]/li[2]/a/div"));
	WebElement b = driver.findElement(By.xpath("/html/body/div[1]/div/div/ul[1]/li[2]/div/ul/li[1]/a"));
	Actions act = new Actions(driver);
	Thread.sleep(3000);
	act.moveToElement(a);
	act.moveToElement(b).click(b).build().perform();
	Thread.sleep(5000);

	Set<String> winHandles = driver.getWindowHandles();

	for (String winHandle : winHandles) {                                 //Switch to newly opened tab
	driver.switchTo().window(winHandle);

	}
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/ul/li[5]/a/span")).click();
	Set<String> winHandles2 = driver.getWindowHandles();

	for (String winHandle : winHandles2) {                                //Switch to newly opened tab
	driver.switchTo().window(winHandle);

	}

	//Enter details to search job
	driver.findElement(By.xpath("//*[@id=\"skill\"]/div[1]/div[2]/input")).sendKeys("Java developer");
	driver.findElement(By.xpath("//*[@id=\"skill\"]/div[1]/div[2]/input")).sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"hvAtvJb\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"qsbFormBtn\"]")).click();
	
}



}

