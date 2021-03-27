package stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MedicalCondition {


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

    @And("I enter name")
    public void clickNameField() {
        driver.findElement(By.cssSelector("#username")).click();
        driver.findElement(By.id("username")).sendKeys("abc abc");
    }

    @And("I enter age")
    public void clickAgeField() {
        driver.findElement(By.id("age")).click();
        driver.findElement(By.id("age")).sendKeys("31");

    }

    @And(I choose I do have a pre-existing medical condition)
    public void clickIdoHave() {
        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/fieldset[1]/div[1]/label[2]/span[1]/span[1]/input[1]")).click();


    }
}
