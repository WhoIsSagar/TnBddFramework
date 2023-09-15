package com.TutorialsNinjaBDD.stepDefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.TutorialsNinjaBDD.pageObjects.HomePage;

public class TestBase {

	public static WebDriver driver;
	public static HomePage homepage;
	
	public TestBase() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		homepage = new HomePage(driver);
	
	}
}
