package com.githup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.github.base.SeleniumBase;

public class WelcomePage extends SeleniumBase {

	public WelcomePage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	public void clickNewRepository() {
		WebElement newRepo= driver.findElement(By.linkText(properties.getProperty("WelcomePage.newRepo.text")));
	   click(newRepo);
	
	}
}
