package hellocucumber;

import static org.junit.Assert.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import cucumber.api.java.en.Then;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Stepdefs {

	private WebDriver browser;

	@Given("^The web browser is opened on google home page$")
	public void startBrowserWithGooglePage() throws Exception {
		// Get the browser
		WebDriverManager.chromedriver().setup();
		browser = new ChromeDriver();

		// Set the browser home page
		browser.get("http://www.google.com");

		// Verify home page
		String pageTitle = browser.getTitle();
		Boolean pageTitleIsOk = pageTitle.equals("Google");
		assertTrue(pageTitleIsOk);

	}

	@When("^The user inserts a text sentence in search input element$")
	public void searchTextInGoogle() throws Exception {
		// search a text sentence in google search input field
		WebElement searchField = browser.findElement(By.name("q"));
		searchField.sendKeys("Price of lord of the rings book");
		searchField.sendKeys(Keys.ENTER);
		TimeUnit.SECONDS.sleep(3);

	}

	@Then("^The google homepage shows searching results$")
	public void verifyGoogleSearchResults() throws Exception {
		// wait until the google page shows the result

		List<WebElement> findElements = browser.findElements(By.xpath("//*[@id='rso']//h3/a"));

		// this are all the links you like to visit
		for (WebElement webElement : findElements) {
			System.out.println(webElement.getAttribute("href"));
		}

		// Quit the browser
		TimeUnit.SECONDS.sleep(5);
		if (browser != null)
			browser.quit();
	}

}