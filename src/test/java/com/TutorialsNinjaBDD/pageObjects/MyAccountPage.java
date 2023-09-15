package com.TutorialsNinjaBDD.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	public static WebDriver driver;
	@FindBy(linkText = "My Account")
	private WebElement myAccountBtn;
	@FindBy(linkText = "Logout")
	private WebElement logoutBtn;
	@FindBy(xpath="//input[@class='form-control input-lg']")
	private WebElement searchProductTextBox;
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	private WebElement searchBtn;
	
	
	public MyAccountPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLogoutBtn() {
		myAccountBtn.click();
		logoutBtn.click();
	}
	
	public void enterProducName(String product) {
		searchProductTextBox.sendKeys(product);
	}
	public SearchedProductPage searchProduct() {
		
		searchBtn.click();
		return new SearchedProductPage(driver);
	}
	
}
