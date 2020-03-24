package com.stepdefination;


import java.io.IOException;

import com.pages.recruiter_main;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class recruiter_step extends recruiter_main {
	@Given("^user launched the chrome browser for search_recruiters scenario$")
	public void user_launched_the_chrome_browser_for_search_recruiters_scenario()  {
		launchChrome();
	}

	@When("^user launches naukri homepage$")
	public void user_launches_naukri_homepage()  {
		url();
	}
	
	
	@When("^user login the naukri page$")
    public void user_login_the_naukri_page() throws IOException  {
		login();
   }

	@Then("^the user can go to recruiters$")
	public void the_user_can_go_to_recruiters()  {
		mouse_actions();
	}

}
