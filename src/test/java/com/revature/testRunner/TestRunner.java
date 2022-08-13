package com.revature.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

@CucumberOptions(glue = "com.revature.steps", features = "/Users/bipulchaudhary/Revature/IntelliJ/intro-to-bdd-test-automation-framework/features/login.feature")
public class TestRunner extends AbstractTestNGCucumberTests {
    public static WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.get("http://ec2-18-116-115-64.us-east-2.compute.amazonaws.com/index.html");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
