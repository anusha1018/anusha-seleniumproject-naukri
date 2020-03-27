package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features ="/anusha-naukri/src/main/resources/features/anunaukri.feature",
plugin = {"pretty", "html:reports/cucumber-html-report","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
tags = {"@tc01_login,@tc02_more,@tc03_HR,@tc04_search_recruiters"},
glue = {"com.stepdefiniton"},
monochrome = true
)

public class runner {
	@AfterClass
	public static void writeExtentReport() {
	Reporter.loadXMLConfig("src/main/resources/extent-config.xml");
	}
	
}
