package rs.ljiljana;

import io.cucumber.java.Scenario;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;


public class Hooks {
    public static WebDriver driver=null;

    WebDriverWait webDriverWait;
    int maxRetries = 3;

    @BeforeClass
    public void beforeFunction(Scenario scenario) {
        File file = new File("src/main/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        ChromeOptions options = new ChromeOptions();
//
        Base.driver = new ChromeDriver(options);
    }

    @AfterClass
    public void afterFunction() {

    }

}