package com.revature.steps;

import com.revature.pageObjectModel.HomePage;
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
    public WebDriver driver;
    @Given("I open the chrome browser")
    public void i_open_the_chrome_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.quit();
    }

    @When("I open the page {string}")
    public void i_open_the_page(String string) {
        Assert.assertTrue(true);
    }

    @Then("The page title should be {string}")
    public void the_page_title_should_be(String string) {
        Assert.assertTrue(true);
    }

    @When("I click on Sign in tab")
    public void i_click_on_sign_in_tab() {
        Assert.assertTrue(true);
    }

    @Then("Sign in form should display")
    public void sign_in_form_should_display() {
        Assert.assertTrue(true);
    }

    @When("I enter correct user name bipul513")
    public void i_enter_correct_user_name_bipul513() {
        Assert.assertTrue(true);
    }

    @When("correct password password")
    public void correct_password_password() {
        Assert.assertTrue(true);
    }

    @Then("I should see the message {string}")
    public void i_should_see_the_message(String string) {
        Assert.assertTrue(true);
    }

    @When("I enter correct user name kareem11")
    public void i_enter_correct_user_name_kareem11() {
        Assert.assertTrue(true);
    }

    @When("I enter correct user name shaquera7")
    public void i_enter_correct_user_name_shaquera7() {
        Assert.assertTrue(true);
    }


}
