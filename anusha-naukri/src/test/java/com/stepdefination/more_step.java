package com.stepdefination;


import com.pages.more_main;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class more_step {
	more_main mo = new more_main();
	@Given("^user can launched the chrome browser$")
	public void user_can_launched_the_chrome_browser() throws Throwable {
	   mo.launchChrome("chrome");
	}

	@When("^user opens the naukri homepage$")
	public void user_opens_the_naukri_homepage() throws Throwable {
	    mo.url();
	}

	@Then("^user clicks login button$")
	public void user_clicks_login_button() throws Throwable {
	    mo.loginn();
	}
	@And("^user can click more and move to any field$")
	public void user_can_click_more_and_move_to_any_field() throws Throwable {
	   mo.more();
	}
}
