package com.TutorialsNinjaBDD.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public static WebDriver driver;
	
	@FindBy(id = "input-email")
	private WebElement emailText;
	@FindBy(id = "input-password")
	private WebElement passwordText;
	@FindBy(css="input.btn.btn-primary")
	private WebElement loginBtn;
	
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmailAndPassword(String email, String password) {
		emailText.sendKeys(email);
		passwordText.sendKeys(password);
		
	}
	public MyAccountPage hitLoginButton() {
		loginBtn.click();
		return new MyAccountPage(driver);
	}
	
}
