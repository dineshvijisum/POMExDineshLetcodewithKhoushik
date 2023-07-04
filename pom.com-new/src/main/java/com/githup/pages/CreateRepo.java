package com.githup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.github.base.SeleniumBase;

public class CreateRepo extends SeleniumBase{
	
	public CreateRepo(RemoteWebDriver driver) {
		this.driver=driver;
		
	}
	
 
	public void enterRepoDetails(String reponame,String description) {
		type(driver.findElement(By.id("repo.name.id")),reponame);
		type(driver.findElement(By.id("repo.description.id")),description);
	
	}
	
	public boolean getSelectedRepoType() {
		return driver.findElement(By.id("repo.publicInput.id=")).isSelected();
	}
	
	public void clickCreateRepository() {
		click(driver.findElement(By.xpath("repo.CreateRepository.xpath")));
	}
}
