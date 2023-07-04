package tests;


import java.util.Properties;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.base.Common;
import com.githup.pages.CreateRepo;
import com.githup.pages.HomePage;
import com.githup.pages.LoginPage;
import com.githup.pages.RepoCode;
import com.githup.pages.Settings;
import com.githup.pages.WelcomePage;

public class GithubFlow extends Common {
	
	
	Properties prop;
	
	HomePage home;
	LoginPage login;
	WelcomePage welcome;
	RepoCode repo;
	CreateRepo creatRepo;
	Settings settings;
	
	@BeforeClass
	void setObject() {
		home = new HomePage(driver);
		login = new LoginPage(driver);
		welcome=new WelcomePage(driver);
		repo = new RepoCode(driver);
		creatRepo=new CreateRepo(driver);
		settings=new Settings(driver);
		
	}

	@Test
	void login() {
	   home.clickSignIn();
		login.login(prop.getProperty("username"), prop.getProperty("password"));
		
		
	}
	@Test
	void createRepo() {
		
	}
	@Test
	void deleteRepo() {
		
	}
}
