package stepdefinitions.maps.google;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleMaps {

    private WebDriver driver;

    @Before
    public void beforeScenario() {
        driver = new FirefoxDriver();
    }

    @After
    public void afterScenario() {
        driver.close();
    }

    @Given("^I am on www\\.maps\\.google\\.com$")
    public void i_am_on_www_maps_google_com() throws Throwable {
        driver.get("http://www.maps.google.com");
    }

    @When("^I search for Berlin Germany$")
    public void i_search_for_Berlin_Germany() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should see Berlin on the map$")
    public void i_should_see_Berlin_on_the_map() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
