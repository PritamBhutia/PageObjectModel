package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	WebDriver dpdriver= null;
	public DashboardPage(WebDriver driver) {
		this.dpdriver= driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//h3")
	List<WebElement>courses;
	
	public ArrayList<String>Verifycourses(){
		ArrayList<String>ActualCourses = new ArrayList<String>();
		for(WebElement course:courses) {
			String text= course.getText();
			ActualCourses.add(text);
		}
		return ActualCourses;
		
	}
	public  boolean VerifyCources1() {
		ArrayList<String>ActualCourses= new ArrayList<String>();
		for(WebElement course:courses) {
			String text= course.getText();
			ActualCourses.add(text);
	}
		ArrayList<String>ExpectedCources= new ArrayList<String>();
		ExpectedCources.add("Selenium");
		ExpectedCources.add("Java / J2EE");
		ExpectedCources.add("Python");
		ExpectedCources.add("Php");
		
		if(ActualCourses.equals(ExpectedCources))
			return true;
		else
		return false;

}
}
