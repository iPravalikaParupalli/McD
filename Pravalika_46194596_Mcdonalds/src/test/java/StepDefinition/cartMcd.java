package StepDefinition;

import browser.Cart;
import browser.browser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cartMcd extends Cart{

	@Given("user selects item")
	public void user_selects_item() throws Exception {
	    Cart.addMcd();
	}

	@When("user clicks on add to cart button")
	public void user_clicks_on_add_to_cart_button() throws Exception {
	    Cart.addtocartMcd();
	}

	@Given("user clicks on view cart")
	public void user_clicks_on_view_cart() throws Exception {
	    Cart.viewcartMcd();
	}

	@Then("User should see the burger in cart")
	public void user_should_see_the_burger_in_cart() throws Exception {
		//Cart.cartitemsMcd();
	}

	@Then("user click on recommendations")
	public void user_click_on_recommendations() throws Exception {
	    Cart.moreMcd();
	}

	@Then("click on promocode")
	public void click_on_promocode() throws Exception {
	    Cart.promoMcd();
	}

	@Then("click on ApplyButton")
	public void click_on_ApplyButton() throws Exception {
	    Cart.applypromoMcd();
	}

	@Then("click on OkButton")
	public void click_on_OkButton() throws Exception {
	    Cart.okButtonMcd();
	}

	@Then("user can set delivery instructions")
	public void user_can_set_delivery_instructions() throws Exception {
	    Cart.instructionsMcd();
	}

	@Then("click on pay")
	public void click_on_pay() throws Exception {
	    Cart.payMcd();
	}

}