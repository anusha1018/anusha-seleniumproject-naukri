package com.pages;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class more_main extends login_main{
	
	//To login into the Application
	public void loginn() throws IOException
	{
		driver.findElement(By.xpath("//*[@id=\"login_Layer\"]/div")).click();
		
		
		driver.findElement(By.id("eLoginNew")).sendKeys("janardhana.selenium3@gmail.com");
		driver.findElement(By.id("pLogin")).sendKeys("ammuanu@$");
		driver.findElement(By.xpath("//*[@id=\"lgnFrmNew\"]/div[9]/button")).click();
	}
	//To Access more Field 
	public void more() throws InterruptedException
	{ 
		Thread.sleep(5000);
		WebElement a =driver.findElement(By.xpath("/html/body/div[1]/div/div/ul[1]/li[6]/a/div"));
		WebElement b =driver.findElement(By.xpath("//a[contains(text(),'MBA')]"));
		Actions act = new Actions(driver);
		act.moveToElement(a);
		act.moveToElement(b).click(b).build().perform();
		Thread.sleep(8000);
		driver.close();
	}
}

