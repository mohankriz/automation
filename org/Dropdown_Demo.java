package com.zero.org;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Demo {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pcs\\New\\Selenium_Project\\drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement button = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		button.click();
		Thread.sleep(3000);
		
		WebElement date = driver.findElement(By.id("day"));
		Thread.sleep(3000);
		Select m1=new Select(date);
		m1.selectByValue("6");
		
		WebElement date1 = driver.findElement(By.id("month"));
		Thread.sleep(3000);
		Select m2=new Select(date1);
		m2.selectByIndex(4);
		

		WebElement date2 = driver.findElement(By.xpath("//select[@title='Year']"));
		Thread.sleep(3000);
		Select m3=new Select(date2);
		m3.selectByVisibleText("2011");
		
		TakesScreenshot foto = (TakesScreenshot) driver;
		File jvm = foto.getScreenshotAs(OutputType.FILE);
		File source= new File("C:\\Users\\pcs\\New\\Selenium_Project\\snaps\\coco.png");
		FileUtils.copyFile(jvm, source);
				
		
		
		
	
		
		
		
		
		
		
	}

}
