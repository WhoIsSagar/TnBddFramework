package com.TutorialsNinjaBDD.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public static WebDriver driver;
	@FindBy(linkText = "My Account")
	private WebElement myAccountBtn;
	@FindBy(linkText ="Login")
	private WebElement loginBtn;
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnMyAccountBtn() {
		myAccountBtn.click();
	}
	public LoginPage clickOnMyLoginBtn() {
		
		loginBtn.click();
		return new LoginPage(driver);
	}
	
}
