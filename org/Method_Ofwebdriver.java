package com.zero.org;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method_Ofwebdriver {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\pcs\\New\\Selenium_Project\\drive\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
	System.out.println(driver.equals(driver));	
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle());

		System.out.println(driver.getWindowHandle());
	System.out.println(driver.manage().logs());	
		driver.manage().window().minimize();
		driver.manage().window().maximize();

		//System.out.println(driver.manage().window().notify());
		Dimension  d = new Dimension(600,700);
		driver.manage().window().setSize(d);
		
		System.out.println(driver.manage().window().getSize());//;

		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("https://www.makemytrip.com/");
		driver.navigate().refresh();
		driver.switchTo().window("instagram");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
