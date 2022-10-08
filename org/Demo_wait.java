package com.zero.org;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo_wait {
	public static  WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pcs\\New\\Selenium_Project\\drive\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(4));
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("heheho");
		//driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
	//	WebDriverWait wait = new WebDriverWait(driver, 30);
	//	wait.until(ExpectedConditions.invisibilityOfAllElements());
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
