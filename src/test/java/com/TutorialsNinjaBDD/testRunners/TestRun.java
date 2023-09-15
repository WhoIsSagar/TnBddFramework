package com.TutorialsNinjaBDD.testRunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,
		features = {"./Features/SearchProduct.feature","./Features/Login.feature"},
		glue ="com.TutorialsNinjaBDD.stepDefinations",
		dryRun=false,
		plugin= {"pretty","html:target/site/cucumber-html"}
		
		)

public class TestRun {

}
