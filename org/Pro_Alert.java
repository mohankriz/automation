package com.zero.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pro_Alert {
public static void main(String[] args) throws Throwable {


	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pcs\\New\\Selenium_Project\\drive\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Alerts.html");
	
	driver.manage().window().maximize();
	driver.findElement(By.xpath("(//a[@class='analystic'])[1]")).click();
	driver.findElement(By.xpath("(//button[@class='btn btn-danger'])[1]")).click();
	driver.switchTo().alert().accept();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	driver.switchTo().alert().dismiss();
	Thread.sleep(3000);
	
	
	driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
	driver.switchTo().alert().sendKeys("hola");
	driver.switchTo().alert().accept();
	
	
	
	
	
	
	
	
	
}
}
