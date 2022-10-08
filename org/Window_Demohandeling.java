package com.zero.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Demohandeling {
	public static WebDriver driver ;

	
	public static void single_window() throws AWTException {
		WebElement cuser = driver.findElement(By.xpath("//div[@id='nav-xshop']//child::a[text()='Best Sellers']"));
		Actions act = new Actions(driver);
        act.contextClick(cuser).build().perform();
        Robot r =new Robot();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
      //  driver.switchTo().window("https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers");
       // driver.close();
       
        String par_id = driver.getWindowHandle();
       Set<String> all_id = driver.getWindowHandles();
       for (String id : all_id) {
    	   if (id.equals(par_id)) {
			continue;
		}
		
	else {
		driver.switchTo().window(id);
		System.out.println("url:"+driver.getCurrentUrl());
		System.out.println("title"+driver.getTitle());
		
		
		
	}}
	}
	public static void multiple_window() throws AWTException {
		WebElement cuser = driver.findElement(By.xpath("//div[@id='nav-xshop']//child::a[text()='Best Sellers']"));
		Actions act = new Actions(driver);
        act.contextClick(cuser).build().perform();
        Robot r =new Robot();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
       // driver.switchTo().window("https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers");
       // driver.close();
        WebElement cuser1 = driver.findElement(By.xpath("//div[@id='nav-xshop']//child::a[text()='Mobiles']"));
        act.contextClick(cuser1).build().perform();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
      //  driver.switchTo().window("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");
      //  driver.close();
        WebElement cuser2 = driver.findElement(By.xpath("//div[@id='nav-xshop']//child::a[text()='Customer Service']"));
        act.contextClick(cuser2).build().perform();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
      //  driver.switchTo().window("https://www.amazon.in/gp/help/customer/display.html?nodeId=200507590&ref_=nav_cs_help");
       // driver.close();
        Set<String> all_id = driver.getWindowHandles();
        String expected_tittle="help";
        for (String id : all_id) {
        	if (driver.switchTo().window(id).getTitle().equals(expected_tittle)) {
        		System.out.println(driver.getCurrentUrl());
				break;
			}
			
		}
        
        
        
        
	}
	
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pcs\\New\\Selenium_Project\\drive\\chromedriver.exe" );
		 driver = new ChromeDriver();
		driver.get("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");
		driver.manage().window().maximize();
		single_window();
		multiple_window();
		
		}}
		
	
       
       
       
       
       
       
       
	


