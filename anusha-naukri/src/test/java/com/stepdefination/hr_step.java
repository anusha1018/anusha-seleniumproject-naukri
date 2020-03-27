package com.stepdefination;


import java.io.IOException;

import com.pages.hr_main;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class hr_step {
hr_main h=new hr_main();
@Given("^user launchs the chrome browser to follow hr$")
public void user_launchs_the_chrome_browser_to_follow_hr() {
h.launchChrome("chrome");
}

@When("^user opens the naukri homepage for hr$")
public void user_opens_the_naukri_homepage_for_hr()  {
h.url();
}


@When("^user logins to naukri page$")
public void user_logins_to_naukri_page() throws IOException, InterruptedException  {
h.login_search();
}



@Then("^user applys filter$")
public void user_applys_filter() throws InterruptedException  {
h.follow();
}


}

