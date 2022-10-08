package com.zero.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pro_Xpath {
	public  static void main(String[] args) throws InterruptedException {
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\pcs\\New\\Selenium_Project\\drive\\chromedriver.exe");
  WebDriver hop = new ChromeDriver();
  hop.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=SignUp");
  Thread.sleep(3000);
  WebElement english = hop.findElement(By.xpath("//input[@name='firstName']"));
  english.click();
  english.sendKeys("monika@yahoo.com");
		

		
}

}
