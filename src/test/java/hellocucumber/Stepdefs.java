package hellocucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

public class Stepdefs {
	@Given("^The web browser is opened on google hompage$")
	public void startBrowserWithGooglePage() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		assertTrue(true);
	}

	@When("^The user inserts a text sentence in search input element$")
	public void setGoogleSearchText() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		assertTrue(true);
	}

	@Then("^The google homepage shows searching results$")
	public void verifyGoogleSearchResults() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		assertTrue(true);
	}
}