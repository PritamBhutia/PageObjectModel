package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.pages.DashboardPage;
import com.pages.Loginpage;

public class Testclass {
	WebDriver driver=null;
	Loginpage lp = null;
	DashboardPage dp = null;
	
	@BeforeSuite
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver", "H:/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/PRITAM/Desktop/automation%20tols/Offline%20Website/index.html");
		lp= new Loginpage(driver);
	}
	     @Test
	public void Test01() {
		dp=lp.Validlogin();
	}
       @Test
	public void Test02() {
		Assert.assertTrue(dp.VerifyCources1()); 
	}
}
