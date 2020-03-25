package com.pages;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class recruiter_main {
	
	public static WebDriver driver;
	//To Launch chrome browser
	public void launchChrome()
	{
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\anusha\\src\\test\\resources\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();//To maximize the  window
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//To provide waiting time
	}
	//To Open url in Chrome browser
	public void url()
	{
		driver.get("https://www.naukri.com/");
		String windowTitle= getCurrentWindowTitle();
		String mainWindow = getMainWindowHandle(driver);
		Assert.assertTrue(closeAllOtherWindows(mainWindow));
		Assert.assertTrue(windowTitle.contains("Jobs - Recruitment"));
	}
		
	public String getMainWindowHandle(WebDriver driver)
	{
		return driver.getWindowHandle();
	}

	public String getCurrentWindowTitle()
	{
		String windowTitle = driver.getTitle();
		return windowTitle;
	}
	
	//To close all the other windows except the main window.
	public static boolean closeAllOtherWindows(String openWindowHandle) 
	{
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String currentWindowHandle : allWindowHandles) 
		{
			if (!currentWindowHandle.equals(openWindowHandle)) 
			{
				driver.switchTo().window(currentWindowHandle);
				driver.close();
			}
		}
		
		driver.switchTo().window(openWindowHandle);
		if (driver.getWindowHandles().size() == 1)
			return true;
		else
			return false;
	}
	//To login into the application
	public void login() throws IOException
	{   
        driver.findElement(By.xpath("//*[@id=\"login_Layer\"]/div")).click();
		driver.findElement(By.id("eLoginNew")).sendKeys("janardhana.selenium3@gmail.com");
		driver.findElement(By.id("pLogin")).sendKeys("ammuanu@$");
		driver.findElement(By.xpath("//*[@id=\"lgnFrmNew\"]/div[9]/button")).click();
	}
		//To access recruiter field
		public void mouse_actions()
		{
			WebElement a1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/ul[1]/li[2]/a/div"));
			WebElement a2 = driver.findElement(By.xpath("/html/body/div[1]/div/div/ul[1]/li[2]/div/ul/li[1]/a"));
			Actions act = new Actions(driver);
			act.moveToElement(a1);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.moveToElement(a2).click().build().perform();
			
		}		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
