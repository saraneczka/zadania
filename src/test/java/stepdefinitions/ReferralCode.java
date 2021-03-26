package stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReferralCode {

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

    @And("Click Have a friend's referral code")
    public void clickDiscount() {
        driver.findElement(By.id("discount")).click();

    }
    @And ("Enter discount code")
    public void enterCode(){
        driver.findElement(By.id("discount")).sendKeys("qwer");
    }
    @Then("Click on Annual Cover")
    public void clickAnnual(){
        driver.findElement(By.cssSelector(".jss283:nth-child(3) .jss333")).click();
    }

}