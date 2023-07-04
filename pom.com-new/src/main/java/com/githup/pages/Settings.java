package com.githup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.github.base.SeleniumBase;

public class Settings extends SeleniumBase{
	
	public Settings(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	public void deleteThisRepository(String repoName,String username) {
		
		click(driver.findElement(By.id("Settings.deletethisRepo.id")));
		click(driver.findElement(By.id("repo-delete-proceed-button")));
		click(driver.findElement(By.id("repo-delete-proceed-button")));
		
		type(driver.findElement(By.id("verification_field")), username.concat("/"+repoName));
	     click(driver.findElement(By.id("repo-delete-proceed-button")));
	}
	

}
