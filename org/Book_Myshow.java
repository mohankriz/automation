package com.zero.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Book_Myshow {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pcs\\New\\Selenium_Project\\drive\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		
		
		
		WebElement button = driver.findElement(By.xpath("(//span[text()='Trains'])[1]"));
		button.click();
		Thread.sleep(3000);
		
		
		
		
		
	}

}
