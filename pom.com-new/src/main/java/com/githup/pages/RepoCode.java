package com.githup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.github.base.SeleniumBase;

public class RepoCode extends SeleniumBase {
	
    public RepoCode(RemoteWebDriver driver) {
    	this.driver=driver;
    	
    }
    public boolean isRpoCreated(String repoName) {
		return driver.findElement(By.linkText(repoName)).isDisplayed();
	}

    public void clickSettings() {
		WebElement setting= driver.findElement(By.id(properties.getProperty("RepoCode.settings.id")));
		click(setting);
	}
}
