package com.zero.org;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_Shot {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pcs\\New\\Selenium_Project\\drive\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.youtube.com/");
	
	TakesScreenshot shoot = (TakesScreenshot) driver;  //downcasting
	File source = shoot.getScreenshotAs(OutputType.FILE); //stores in jvm
	File desti= new File("C:\\Users\\pcs\\New\\Selenium_Project\\snaps\\madam.png"); //reroating to destined file
	FileUtils.copyFile(source, desti);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
