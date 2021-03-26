package stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PartnerDefinition {

    private WebDriver driver;

    @Before
    public void beforeScenario() {
        System.setProperty("webdriver.chrome.driver", "/Users/annasarnowska/IdeaProjects/Pluto/src/test/resources/webdriver/chromedrivermac");
        driver = new ChromeDriver();
    }

    @After
    public void afterScenario() {
        driver.close();
    }

    @Given("I am on the Pluto start page")
    public void iVisitPluto() {
        driver.get("https://pluto-customer-web-app-staging.herokuapp.com/tailored-annual-or-single");
    }

    @When("Close popup")
    public void clickExit() {
        driver.findElement(By.cssSelector(".jss267 > path")).click();
    }

    @And("I click on Annual cover")
    public void clickAnnual() {
        driver.findElement(By.cssSelector(".jss283:nth-child(2) .jss247")).click();
    }

    @Then("Click on Our definition of a partner")
    public void clickPartner() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".jss629")));
        driver.findElement(By.cssSelector(".jss629")).click();
        WebElement element = driver.findElement((By.cssSelector(".jss266")));
        Assert.assertTrue(element.isDisplayed());

    }
}