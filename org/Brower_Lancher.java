package com.zero.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brower_Lancher {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pcs\\New\\Selenium_Project\\drive\\chromedriver.exe" );
		WebDriver d = new ChromeDriver();
		d.get("https://www.instagram.com/");
		d.manage().window().maximize();
		//d.manage().window().minimize();
		System.out.println("ho~la");
		WebElement search = d.findElement(By.xpath("//input[@class='_2hvTZ pexuQ zyHYP']"));
		search.sendKeys("mohankrizz45@gmail.com");
		//WebElement password = d.findElement(By.name("pass"));
		//password.sendKeys("pouyty");
		//WebElement enter = d.findElement(By.id("loginbutton"));
		//enter.click();
		//d.navigate().back();
		//d.navigate().refresh();
		//d.navigate().forward();
		//d.switchTo().window("https://www.youtube.com/");
	}

}
