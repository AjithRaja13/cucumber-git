package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.reporting.Reporting;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict=true,dryRun=true,plugin= {"pretty","json:target\\output.json"},
monochrome=true,features= {"src\\test\\resources\\Feature\\Loginpage Adaction.feature"},glue= {"com\\stepdefintion"})

public class TestRunnerClass {

	@AfterClass
	public static void afterClass() {

		Reporting.generateJVMReport("C:\\Users\\Ajith\\eclipse-workspace\\Cucumber\\target\\output.json");
	}


}














