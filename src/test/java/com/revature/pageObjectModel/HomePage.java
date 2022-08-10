package com.revature.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    @FindBy(id="city")
    private WebElement enterCityName;

    @FindBy(id="search_button")
    private  WebElement searchBtn;

    @FindBy(id="my_location")
    private WebElement use_current_location_btn;

    @FindBy(xpath = "//a[@id='join_now']")
    private WebElement joinNowTab;

    @FindBy(xpath = "//a[@id='sign_in']")
    private WebElement signInTab;

    @FindBy(id = "user_name")
    private WebElement usernameSignInForm;

    @FindBy(id="user_password")
    private WebElement passwordSignInForm;

    @FindBy(id="signin_btn")
    private WebElement SignInBtn;

   @FindBy(id="username")
   private WebElement usernameJoinNowForm;

   @FindBy(id="name")
    private WebElement nameJoinForm;

   @FindBy(id="email")
    private WebElement emailJoinForm;

   @FindBy(id="password")
    private WebElement passwordJoinForm;

   @FindBy(id="registration_btn")
    private WebElement joinNowBtn;

   @FindBy(id="user_info")
    private WebElement userInfoAfterLogin;

   @FindBy(id="sign_out")
    private WebElement signOutBtn;

   @FindBy(id="table")
    private WebElement table;

   @FindBy(id="weather_info")
    private WebElement displayWeatherInfo;

    @FindBy(xpath = "//*[@id='add_to_fav_btn']")
    private WebElement addToFavBtn;

public HomePage(WebDriver driver){
    this.driver = driver;
    PageFactory.initElements(driver, this);
}
}
