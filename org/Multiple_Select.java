package com.zero.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Select {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pcs\\New\\Selenium_Project\\drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		//driver.manage().window().maximize();
		
	WebElement date = driver.findElement(By.xpath("//select[@id='month']"));
		Select s =new Select(date);
		s.isMultiple();
		System.out.println(s.isMultiple());
	
		
		List<WebElement> fact = s.getOptions();
	if (s.isMultiple()) {
			System.out.println("yes");
			
		}else {System.out.println("no");}
		
	for (WebElement  date1 : fact) {
			System.out.println(date1.getText());
			
		}
	
	
	WebElement fact1 = s.getFirstSelectedOption();
		System.out.println(fact1);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
