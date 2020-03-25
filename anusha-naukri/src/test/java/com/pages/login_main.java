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

	import com.excel.excel_utility;

	public class login_main{
		static WebDriver driver;
		excel_utility eu = new excel_utility();
		//To Launch ChromeBrowser
		public void launchChrome()
		{
			System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\anusha\\src\\test\\resources\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();//To maximize the window
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//To provide waiting time
		}
		//To Open Naukri Website
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
		public static boolean closeAllOtherWindows(String openWindowHandle) {
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

		
		//To Get Login Details From ExcelUtility
		public void loginn() throws IOException, InterruptedException
		{
			for(int i=1;i<=1;i++)
			{
				
			driver.findElement(By.xpath("//*[@id=\"login_Layer\"]/div")).click();
			driver.findElement(By.id("eLoginNew")).sendKeys(eu.excel_email(i));
			driver.findElement(By.id("pLogin")).sendKeys(eu.excel_password(i));
		    driver.findElement(By.xpath("//*[@id=\"lgnFrmNew\"]/div[9]/button")).click();  
		    Thread.sleep(4000);
			
				
			}
			
			driver.close();//To close the browser
		}
	}



