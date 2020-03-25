package com.pages;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.excel_utility;

public class hr_main {

		// Used to instantiate the WebDriver object
		WebDriver driver;
		
		public void launchChrome()
		{
			System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\anusha\\src\\test\\resources\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		}
		public void url()
		{
			driver.get("https://www.naukri.com/");
			String windowTitle= getCurrentWindowTitle();
			String mainWindow = getMainWindowHandle(driver);
			Assert.assertTrue(closeAllOtherWindows(mainWindow));
			Assert.assertTrue(windowTitle.contains("Jobs - Recruitment"));
		}
			
		public String getMainWindowHandle(WebDriver driver) {
			return driver.getWindowHandle();
		}

		public String getCurrentWindowTitle() {
			String windowTitle = driver.getTitle();
			return windowTitle;
		}
		
		//To close all the other windows except the main window.
		public boolean closeAllOtherWindows(String openWindowHandle) {
			Set<String> allWindowHandles = driver.getWindowHandles();
			for (String currentWindowHandle : allWindowHandles) {
				if (!currentWindowHandle.equals(openWindowHandle)) {
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
		
		public void login_search() throws IOException
		{   
	        driver.findElement(By.xpath("//*[@id=\"login_Layer\"]/div")).click();
			driver.findElement(By.id("eLoginNew")).sendKeys("janardhana.selenium3@gmail.com");
			driver.findElement(By.id("pLogin")).sendKeys("ammuanu@$");
			driver.findElement(By.xpath("//*[@id=\"lgnFrmNew\"]/div[9]/button")).click();
		}
		
		public void follow() {
			driver.findElement(By.xpath("//*[@id=\"srp_3887716\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"emailTxt\"]")).sendKeys("com");
			driver.findElement(By.xpath("//*[@id=\"pwd1\"]")).sendKeys("tejaswini@24");
			driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"srp_971011\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"srp_3081024\"]")).click();
		}
			
			
						
		}

