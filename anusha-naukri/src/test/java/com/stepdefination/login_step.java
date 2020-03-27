package com.stepdefination;

import com.pages.login_main;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login_step extends login_main {
	
	

@Given("^user launched the chrome browser$")
public void user_launched_the_chrome_browser() throws Throwable 
{
    launchChrome("chrome");
}

	@When("^user opens naukri homepage$")
	public void user_opens_naukri_homepage() throws Throwable {
	  url();
	}

	@Then("^user clicks login$")
	public void user_clicks_login() throws Throwable {
	    loginn();
	}

}
