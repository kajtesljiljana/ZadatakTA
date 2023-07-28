package rs.ljiljana;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class MySteps {
    @Given("Navigate to URL {string}")
    public void navigateToURL(String urlPath) throws InterruptedException {
        File file = new File("src/main/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        ChromeOptions options = new ChromeOptions();
        Base.driver = new ChromeDriver(options);
        Base.driver.manage().window().maximize();
        Base.driver.navigate().to(urlPath);
        Thread.sleep(10000);
    }

    @Then("Wait")
    public void wait1() throws InterruptedException {
        Thread.sleep(5000);

    }

    @Then("Dismiss sign in information")
    public void dismissSignInInformation() throws InterruptedException {
        WebElement element = Base.driver.findElement(By.xpath("//*[@aria-label='Dismiss sign in information.']"));
        element.click();

    }

    @Then("Click on element right")
    public void clickOnElementRight() {
        WebElement element = Base.driver.findElement(By.xpath("(//*[@aria-label='Next'])[2]"));
        element.click();
    }

    @Then("Enter {string} into search field by placeholder {string}")
    public void EnterIntoSearchField(String value, String placeholder) {
        WebElement element = Base.driver.findElement(By.xpath("//*[@placeholder='" + placeholder + "']"));
        element.sendKeys(value);

    }

    @Then("Browser quit")
    public void browserQuit() {
        Base.driver.quit();
    }


    @Then("Click on Duration of the stay by class {string}")
    public void clickOnDurationOfStayByClass(String className) {
        WebElement element = Base.driver.findElement(By.xpath("(//*[@class='" + className + "'])[1]"));
        element.click();
    }

    @Then("Choose check in date")
    public void chooseCheckInDate() {
        WebElement element = Base.driver.findElement(By.xpath("//*[@aria-label='12 August 2023']"));
        element.click();
    }

    @Then("Choose check out date")
    public void chooseCheckOutDate() {
        WebElement element = Base.driver.findElement(By.xpath("//*[@aria-label='18 August 2023']"));
        element.click();
    }
    @Then("Choose day of departure")
    public void chooseDayOfDeparture() {
        WebElement element = Base.driver.findElement(By.xpath("//*[@aria-label='12 September 2023']"));
        element.click();
    }
    @Then("Choose day of return")
    public void chooseDayOfReturn() {
        WebElement element = Base.driver.findElement(By.xpath("//*[@aria-label='19 September 2023']"));
        element.click();
    }
    @Then("Click on start date")
    public void clickOnStartDate() {
        WebElement element = Base.driver.findElement(By.xpath("//*[@aria-label='25 August 2023']"));
        element.click();
    }

    @Then("Click on end date")
    public void clickOnEndDate() {
        WebElement element = Base.driver.findElement(By.xpath("//*[@aria-label='30 August 2023']"));
        element.click();
    }


    @Then("Click on Search button for Stays")
    public void clickOnSearchButtonForStays() {
        WebElement element = Base.driver.findElement(By.xpath("(//*[@class=\"f9cf783bde\"])[4]"));
        element.click();
    }

    @Then("Verify that search results are displayed")
    public void verifyThatSearchResultsAreDisplayed() {
        WebElement element = Base.driver.findElement(By.cssSelector("[class='fcab3ed991 d5f78961c3']"));
        Assert.assertTrue(element.isDisplayed());
    }

    @Then("Verify that flights are displayed")
    public void verifyThatFlightsAreDisplayed() {
        WebElement element = Base.driver.findElement(By.cssSelector("[class='css-1f10jkc']"));
        Assert.assertTrue(element.isDisplayed());
    }
    @Then("Verify that attractions are displayed")
    public void verifyThatAttractionsAreDisplayed() {
        WebElement element = Base.driver.findElement(By.cssSelector("[class='css-1b0axdm']"));
        Assert.assertTrue(element.isDisplayed());
    }

    @Then("Click on button Done")
    public void clickOnButtonDone() {
        WebElement element = Base.driver.findElement(By.xpath("(//*[@type=\"button\"])[18]"));
        element.click();
    }

    @Then("Click on Flights")
    public void clickOnFlights() {
        WebElement element = Base.driver.findElement(By.xpath(("(//*[@class=\"fc63351294 fa030f4cc2 d4e373d880\"])[1]")));
        element.click();

    }

    @Then("Click on Number of guests and rooms")
    public void clickOnNumberOfGuestsAndRooms() {
        WebElement element = Base.driver.findElement(By.xpath(("(//*[@class=\"d47738b911 b7d08821c3\"])[1]")));
        element.click();

    }
    @Then("Choose number of guests")
    public void chooseNumberOfGuests() {
        WebElement element = Base.driver.findElement(By.xpath(("(//*[@class=\"fc63351294 a822bdf511 e3c025e003 fa565176a8 f7db01295e c334e6f658 e1b7cfea84 d64a4ea64d\"])[1]")));
        element.click();
    }
    @Then("Choose number of rooms")
    public void chooseNumberOfRooms() {
        WebElement element = Base.driver.findElement(By.xpath(("(//*[@class=\"fc63351294 a822bdf511 e3c025e003 fa565176a8 f7db01295e c334e6f658 e1b7cfea84 d64a4ea64d\"])[3]")));
        element.click();
    }
    @Then("Click on Done button")
    public void clickOnDoneButton() {
        WebElement element = Base.driver.findElement(By.xpath(("(//*[@class=\"fc63351294 a822bdf511 e2b4ffd73d f7db01295e c938084447 a9a04704ee d285d0ebe9\"])[1]")));
        element.click();
    }

    @Then("Click on date field")
    public void clickOnInputField() {
        WebElement element = Base.driver.findElement(By.xpath(("(//*[@class=\"css-1ovag24\"])[3]")));
        element.click();
    }

    @Then("Click on field Flight destination")
    public void clickOnFieldFlightDestination() {
        WebElement element = Base.driver.findElement(By.xpath(("(//*[@class=\"css-1ovag24\"])[2]")));
        element.click();
    }

    @Then("Click on One Way")
    public void clickOnOneWay() {
        WebElement element = Base.driver.findElement(By.xpath(("(//*[@class=\"InputRadio-module__field___4Jbyo\"])[2]")));
        element.click();
    }


    @Then("Enter flight destionation {string}")
    public void enterFlightDestionation(String value) {
        WebElement element = Base.driver.findElement(By.cssSelector("[class='css-1ejj2j9']"));
        element.sendKeys(value);
        element.click();

    }

    @Then("Choose Airport")
    public void chooseAirport() {
        WebElement element = Base.driver.findElement(By.xpath(("(//*[@class=\"css-3cj1dx\"])")));
        element.click();
    }
    @Then("Choose destination from displayed options")
    public void chooseDestinationFromDisplayedOptions() {
        WebElement element = Base.driver.findElement(By.xpath(("(//*[@class=\"css-1h7anqn\"])")));
        element.click();
    }

    @Then("Click on Search button for Flights")
    public void clickOnSearchButtonForFlights() {
        WebElement element = Base.driver.findElement(By.xpath("//*[@data-ui-name=\"button_search_submit\"]"));
        element.click();
    }


    @Then("Click on Attractions")
    public void clickOnAttractions() {
        WebElement element = Base.driver.findElement(By.xpath(("(//*[@class=\"fc63351294 fa030f4cc2 d4e373d880\"])[4]")));
        element.click();
    }

    @Then("Click on field to choose dates")
    public void clickOnFieldToChooseDates() {
        WebElement element = Base.driver.findElement(By.xpath(("(//*[@class=\"css-ck8kih\"])")));
        element.click();
    }

    @Then("Click on Search button for Attractions")
    public void clickOnSearchForAttractions() {
        WebElement element = Base.driver.findElement(By.xpath("(//*[@class=\"e57ffa4eb5\"])[5]"));
        element.click();
    }
}