package stepdefinitions.google;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pluto {

    private WebDriver driver;

    @Before
    public void beforeScenario() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\a788326\\IdeaProjects\\cucumber-java-example\\src\\test\\resources\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void afterScenario() {
        driver.close();
    }

    @Given("Go to the pluto site")
    public void I_visit_google() {
        driver.get("https://pluto-customer-web-app-staging.herokuapp.com/tailored-annual-or-single");
    }

    @When("Zamknij popup")
    public void search_for() {
        WebElement element = driver.findElement(By.xpath("//body[1]/div[3]/div[2]/svg[1]/path[starts-with(@d, \"M11\")]"));
        element.click();
    }

//    @Then("the page title should start with \"(.*)\"")
//    public void checkTitle(String titleStartsWith) {
//        // Google's search is rendered dynamically with JavaScript
//        // Wait for the page to load timeout after ten seconds
//        new WebDriverWait(driver,10L).until(new ExpectedCondition<Boolean>() {
//            public Boolean apply(WebDriver d) {
//                return d.getTitle().toLowerCase().startsWith(titleStartsWith);
//            }
//        });
//    }
}
