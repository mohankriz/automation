package com.zero.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Axpath_Demo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pcs\\New\\Selenium_Project\\drive\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		// by using attribute value with index
		WebElement username = driver.findElement(By.xpath("(//input[@aria-required='true'])[1]"));
		username.sendKeys("mohankrizz");
		Thread.sleep(3000);
		
		// by using attribute value
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("sggghhjkj");
		
		//by using some of the ~attribute value~  by using index
		WebElement button = driver.findElement(By.xpath("(//div[contains(@class,'DhRcB')])[1]"));
		button.click();
		Thread.sleep(5000);
		
		//by text
		WebElement sing = driver.findElement(By.xpath("//span[text( )='Sign up']"));
          sing.click();
	}

}
