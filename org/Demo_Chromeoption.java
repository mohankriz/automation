package com.zero.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo_Chromeoption {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pcs\\New\\Selenium_Project\\drive\\chromedriver.exe");
		ChromeOptions pop = new ChromeOptions();
		pop.addArguments("headless");
		Thread.sleep(2000);
		//start-maximized-
		//incognito-
		//headless
		//disable-extension
		//disable-popup-blocking
		//make-default-browser
		//version
		//disable-infobars
		pop.addArguments("disable-notifications");
		
		WebDriver driver = new ChromeDriver(pop);
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
		
		
		
		/*Adblocker extension of the Chrome browser can be handled using ChromeDriver Options and Desired Capabilities class. Below are the steps to access AdBlocker extension on the Chrome browser using Desired Capabilities class.

		Step 1) AdBlocker extension must be installed on Chrome browser before using Chrome Options class

		Step 2) Extract the CRX File corresponding to AdBlocker extension through http://crxextractor.com/

		Step 3) Pass the downloaded CRX File path to Chrome Options class

		Step 4) Instantiate the web driver using the desired capabilities class and Chrome Options in Selenium object
		*/
		
	}

}
