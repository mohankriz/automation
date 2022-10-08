package com.zero.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Demo {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pcs\\New\\Selenium_Project\\drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		//single frame
		driver.switchTo().frame(0);
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("hola");
		//driver.close();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		Thread.sleep(2000);
		
		WebElement f1 = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
		driver.switchTo().frame(f1);
		
		Thread.sleep(2000);

		WebElement f2 = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
		driver.switchTo().frame(f2);
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("hello");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
