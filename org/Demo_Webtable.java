package com.zero.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo_Webtable {
	public static void main(String[] args) throws Throwable   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pcs\\New\\Selenium_Project\\drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		
		List<WebElement> table = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
		for (WebElement data : table) {
			System.out.println(data.getText());
		}
		Thread.sleep(2000);
		System.out.println("--------------entier row excep one data-----------------");
		
		
		List<WebElement> table1 = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[4]/td"));
		for (WebElement data : table1) {
			if (data.getText().equals("Roland Mendel")) {
				continue;
				
			}
			System.out.println(data.getText());

		}
		
		Thread.sleep(2000);
		System.out.println("-------------colume------------------");
		List<WebElement> table2 = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]"));
		for (WebElement data : table2) {
			if (data.getText().equals("Roland Mendel")) {
				continue;
				
			}
			System.out.println(data.getText());

		
				
		}
		System.out.println("-------------row------------------");

		List<WebElement> table3 = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[4]/td"));
		for (WebElement data : table3) {
			System.out.println(data.getText());
		}
		Thread.sleep(2000);}}
	
		
		
	
	
	
	


