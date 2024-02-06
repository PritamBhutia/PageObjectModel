package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver lpdriver = null;
	public Loginpage(WebDriver driver) {
		this.lpdriver= driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(id="email")
	WebElement username;
	@FindBy(id="password")
	WebElement password;
	@FindBy(xpath = "//button")
	WebElement loginbtn;
	
	public DashboardPage Validlogin() {
		username.sendKeys("kiran@gmail.com");
		password.sendKeys("123456");
		loginbtn.click();
		return new DashboardPage(lpdriver);
	}
	
}
