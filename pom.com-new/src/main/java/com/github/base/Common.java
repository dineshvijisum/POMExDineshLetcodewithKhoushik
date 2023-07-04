package com.github.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Common extends SeleniumBase{
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","/home/mac/Downloads/chromedriver_linux64 (2)/chromedriver" );
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://github.com/");
		wait=new WebDriverWait(driver, 20);
		
	}
	
	@AfterTest
	public void quit() {
		driver.quit();
		
	}

}
