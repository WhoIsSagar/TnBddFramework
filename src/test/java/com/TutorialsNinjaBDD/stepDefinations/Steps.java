package com.TutorialsNinjaBDD.stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.TutorialsNinjaBDD.pageObjects.HomePage;
import com.TutorialsNinjaBDD.pageObjects.LoginPage;
import com.TutorialsNinjaBDD.pageObjects.MyAccountPage;
import com.TutorialsNinjaBDD.pageObjects.SearchedProductPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends TestBase{
	
	public static LoginPage loginpage;
	public static MyAccountPage myaccountpage;
	public static SearchedProductPage searchedproductpage;
	
	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() {
	 
	   
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
	  driver.get(url);
	}

	@When("User Click on My Account Button")
	public void user_click_on_my_account_button() {
		homepage.clickOnMyAccountBtn();
	}

	@When("User click Login Button")
	public void user_click_login_button() {
	   loginpage = homepage.clickOnMyLoginBtn();
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) {
	    loginpage.enterEmailAndPassword(email, password);
	}

	
	@When("Click On Login")
	public void click_on_login() {
		myaccountpage = loginpage.hitLoginButton();
	}

	@Then("Login Page Title Should be {string}")
	public void login_page_title_should_be(String loginPageTitle) {
	   String actualTitle = driver.getTitle();
	   Assert.assertTrue(loginPageTitle.equals(actualTitle));
	}

	@When("User click on Logout")
	public void user_click_on_logout() {
		myaccountpage.clickOnLogoutBtn();
	}

	@Then("Logout Page Title should be {string}")
	public void logout_page_title_should_be(String logoutPageTitle) {
		 String actualTitle = driver.getTitle();
		   Assert.assertTrue(logoutPageTitle.equals(actualTitle));
	}

	@Then("close Browser")
	public void close_browser() {
	   driver.quit();
	}
	@When("Enter HP product Nam")
	public void enter_hp_product_nam() {
		myaccountpage.enterProducName("HP");
	}

	@When("Click on Search Button")
	public void click_on_search_button() {
		searchedproductpage = myaccountpage.searchProduct();
	}

	@Then("Prodcut {string} should appear")
	public void prodcut_should_appear(String expectedProductName) {
		String actualProductName = searchedproductpage.productName();
		Assert.assertEquals(expectedProductName, actualProductName);
	}

}
