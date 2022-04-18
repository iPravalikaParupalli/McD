package StepDefinition;

import browser.browser;
import browser.log;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	
	@Given("Open the browser {string}")
	public void open_the_browser(String string) throws Exception {
	    browser.setDriver();
	    browser.getUrl(string);
	}

	@And("user is on Login page")
	public void user_is_on_Login_page() throws Exception {
	    log.Log();
	    log.userlogin();

	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) throws Exception {
	   log.mobilenumber();
	   log.password();
	}

	@And("user click on login button")
	public void user_click_on_login_button() throws Exception {
	    log.clickcontinue();
	}

	@Then("user is navigating to the home page")
	public void user_is_navigating_to_the_home_page() {
	}
}
