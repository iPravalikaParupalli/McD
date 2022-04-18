package StepDefinition;

import org.testng.Assert;

import browser.browser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class url extends browser{
	@Given("open the browser")
	public void open_the_browser() {
	    browser.setDriver();
	}

	@When("enter the {string}")
	public void enter_the(String string) throws InterruptedException {
	    browser.getUrl(string);
	}

	
	@Then("Page is displayed")
	public void page_is_displayed() {
		try {
			Assert.assertEquals(driver.getTitle(), "McDonald's - Order McDonald's Burger & Wraps online|McDelivery");
			System.out.println("Title found");
		}
		catch(Exception e){
			System.out.println("Title not found");
		}
		browser.closeBrowser();
	}
	
	
}
