package com.TutorialsNinjaBDD.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchedProductPage {

	public static WebDriver driver;
	@FindBy(xpath="//div[@class='product-layout product-grid col-lg-3 col-md-3 col-sm-6 col-xs-12']//div//div//div//h4//a")
	private WebElement productName;
	
	
	public SearchedProductPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String productName() {
		return productName.getText();
	}
	
}
