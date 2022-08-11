package com.revature.steps;

import com.revature.pageObjectModel.HomePage;
import com.revature.testRunner.TestRunner;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Steps {
//    public WebDriver driver;
    public HomePage homePage;

    @Given("I open the chrome browser")
    public void i_open_the_chrome_browser() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
        Assert.assertTrue(true);

    }

    @When("I open the page {string}")
    public void i_open_the_page(String string) {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
        TestRunner.driver.get(string);
//        driver.quit();
    }

    @Then("The page title should be {string}")
    public void the_page_title_should_be(String title) {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.get("http://127.0.0.1:5501/index.html");
        String actual = TestRunner.driver.getTitle();
        Assert.assertEquals(actual, title);
//        driver.quit();
    }

//    @When("I click on Sign in tab")
//    public void i_click_on_sign_in_tab() {
////        WebDriverManager.chromedriver().setup();
////        driver = new ChromeDriver();
////        driver.get("http://127.0.0.1:5501/index.html");
//
//        homePage.clickSignInTab();
//        Assert.assertTrue(true);
////        driver.quit();
//
//    }
//
//    @Then("Sign in form should display")
//    public void sign_in_form_should_display() {
////        WebDriverManager.chromedriver().setup();
////        driver = new ChromeDriver();
////        driver.get("http://127.0.0.1:5501/index.html");
////        homePage = new HomePage(driver);
//        boolean actual = homePage.clickSignInTab();
//        Assert.assertTrue(actual);
////        driver.quit();
//
//    }
//
//    @When("I enter correct user name {string}")
//    public void i_enter_correct_user_name_bipul513(String username) {
////        WebDriverManager.chromedriver().setup();
////        driver = new ChromeDriver();
////        driver.get("http://127.0.0.1:5501/index.html");
////        homePage = new HomePage(driver);
//        homePage.clickSignInTab();
//        homePage.typeUsernameInSignInForm(username);
//        Assert.assertTrue(true);
////        driver.quit();
//    }
//
//    @When("correct password  {string}")
//    public void correct_password(String password) {
////        WebDriverManager.chromedriver().setup();
////        driver = new ChromeDriver();
////        driver.get("http://127.0.0.1:5501/index.html");
////        homePage = new HomePage(driver);
//        homePage.clickSignInTab();
//        homePage.typePasswordInSignInForm(password);
//        Assert.assertTrue(true);
////        driver.quit();
//    }
//
//    @Then("I should see the message {string}")
//    public void i_should_see_the_message(String string) {
////        WebDriverManager.chromedriver().setup();
////        driver = new ChromeDriver();
////        driver.get("http://127.0.0.1:5501/index.html");
////        homePage = new HomePage(driver);
//        homePage.clickSignInTab();
//        homePage.typeUsernameInSignInForm("bipul513");
//        homePage.typePasswordInSignInForm("password");
//        Assert.assertTrue(true);
////        driver.quit();
//    }


}
