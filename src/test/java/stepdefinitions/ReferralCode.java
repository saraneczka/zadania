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
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h4")));
        driver.findElement(By.xpath("//h4[contains(text(),\"Have a friend's referral code?\")]")).click();

    }

    @And("Enter discount code")
    public void enterCode() {
        driver.findElement(By.id("discount")).click();
        driver.findElement(By.id("discount")).sendKeys("qwer");
    }

    @Then("Click on Annual Cover")
    public void clickAnnual() {
        driver.findElement(By.cssSelector(".jss283:nth-child(3) .jss333")).click();
        WebElement element = driver.findElement((By.xpath("//h3[contains(text(),'Some details about your trip')]")));
        Assert.assertTrue(element.isDisplayed());

    }
}