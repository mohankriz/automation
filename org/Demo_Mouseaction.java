package com.zero.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo_Mouseaction {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pcs\\New\\Selenium_Project\\drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
		Actions act = new Actions(driver);
		driver.manage().window().maximize();
	
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		Thread.sleep(2000);
	
		WebElement destination = driver.findElement(By.xpath("//div[@id='droppable']"));
		act.dragAndDrop(source, destination).build().perform();
		
		WebElement dunk = driver.findElement(By.xpath("//div[@class='header-wrapper']"));
		dunk.click();
		Thread.sleep(2000);
		Select m1 = new Select(dunk);
		m1.selectByVisibleText("Buttons");
		//driver.findElement(By.id("item-4")).click();
		
		
		
		
		
	}

}
