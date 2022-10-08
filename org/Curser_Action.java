package com.zero.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Curser_Action {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pcs\\New\\Selenium_Project\\drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Actions hoho = new Actions(driver);
		WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
		hoho.moveToElement(women).build().perform();
		
		WebElement women1 = driver.findElement(By.xpath("(//a[text()='Casual Dresses'])[1]"));
		hoho.moveToElement(women1).build().perform();
		hoho.click().perform();
		hoho.contextClick().perform();
		
		
		
		
		
	}

}
