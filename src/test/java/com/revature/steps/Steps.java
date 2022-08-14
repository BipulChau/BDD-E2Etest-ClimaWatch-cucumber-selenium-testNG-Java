package com.revature.steps;

import com.revature.pageObjectModel.HomePage;
import com.revature.testRunner.TestRunner;
import io.cucumber.java.en.*;
import org.testng.Assert;


public class Steps {
    public HomePage homePage;

    @Given("I open the chrome browser")
    public void i_open_the_chrome_browser() {
        Assert.assertTrue(true);

    }

    @When("I open the home page")
    public void i_open_the_home_page() {
        //TestRunner.driver.get(string);
        Assert.assertTrue(true);
    }

    @Then("The page title should be {string}")
    public void the_page_title_should_be(String title) {
        String actual = TestRunner.driver.getTitle();
        Assert.assertEquals(actual, title);
    }

    @Given("I am at the home page")
    public void i_am_at_the_home_page() {
        Assert.assertTrue(true);

    }

    @When("I type city name {string}")
    public void i_type_city_name(String city) {
        homePage = new HomePage(TestRunner.driver);
        homePage.setEnterCityName(city);
    }

    @When("Click search button")
    public void click_search_button() {
        homePage.clickSearchBtn();
    }

    @Then("I should see the weather information of the city")
    public void i_should_see_the_weather_information_of_the_city() {
        boolean actual = homePage.getWeatherInfo();
        boolean expected = true;
        Assert.assertEquals(actual,expected);

    }

    @When("I click on Current Location")
    public void i_click_on_current_location() {
        homePage = new HomePage(TestRunner.driver);
        homePage.clickUse_current_location_btn();
    }

    @When("I click on Sign in link")
    public void i_click_on_sign_in_link() {
        homePage = new HomePage(TestRunner.driver);
        homePage.clickSignInTab();
        Assert.assertTrue(true);
    }

    @When("Type username {string}")
    public void type_username(String username) {
        homePage.typeUsernameInSignInForm(username);
    }

    @When("Type password {string}")
    public void type_password(String password) {
        homePage.typePasswordInSignInForm(password);
    }

    @When("Click sign in button")
    public void click_sign_in_button() {
        homePage.clickSignInBtn();
    }

    @Then("I should be logged into my profile and see my username {string} in the page")
    public void i_should_be_logged_into_my_profile_and_see_my_username_in_the_page(String string) throws InterruptedException {
        String actual = homePage.getUserInfoAfterLogin();
        Assert.assertEquals(actual, string);
    }

    @Then("I should be logged into my profile and see my username {string}in the page")
    public void i_should_be_logged_into_my_profile_and_see_my_username_in_the_page(String string, String string2) throws InterruptedException {
        String actual = homePage.getUserInfoAfterLogin();
        Assert.assertEquals(actual, string);
    }
}
