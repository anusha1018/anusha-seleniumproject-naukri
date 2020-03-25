package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src\\main\\resources\\features\\testcase.feature",
plugin = {"pretty", "html:reports/cucumber-html-report"},
tags = {"@tc01_login,@tc02_more,tc03_HR,@tc04_search_recruiters"},
glue = {"com.stepdefiniton"},
monochrome = true
)
public class runner {

}
