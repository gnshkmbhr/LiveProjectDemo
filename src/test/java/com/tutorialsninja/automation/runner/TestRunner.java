package com.tutorialsninja.automation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"classpath:FeatureFiles/Register.feature",
				"classpath:FeatureFiles/Login.feature",
				"classpath:FeatureFiles/Search.feature",
				"classpath:FeatureFiles/Orders.feature"},

		glue={"classpath:com.tutorialsninja.automation.stepdef"},
		
		plugin={"html:target/html_report/htmlreport.html"}	//will create html report
		
		//tags={"@Register","@Four"}
		
		)
 public class TestRunner {

}
