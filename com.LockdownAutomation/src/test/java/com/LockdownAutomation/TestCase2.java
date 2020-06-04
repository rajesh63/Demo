package com.LockdownAutomation;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase2 {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");
		
	driver = new ChromeDriver();
		
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("https://www.homecontrols.com/");
}
	


	@Test
	public void run(){
		
		driver.findElement(By.xpath("//a[@id=\"231\"]")).click();
	String str=	driver.findElement(By.xpath("//h1[text()='Home Automation']")).getText();
		System.out.println(str);
	Assert.assertEquals("Home Automation", str);
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
	



}
