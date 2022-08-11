package com.revature.pageObjectModel;

import org.bouncycastle.crypto.agreement.srp.SRP6Client;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wdw;

    @FindBy(id = "city")
    private WebElement enterCityName;

    @FindBy(id = "search_button")
    private WebElement searchBtn;

    @FindBy(id = "my_location")
    private WebElement use_current_location_btn;

    @FindBy(xpath = "//a[@id='join_now']")
    private WebElement joinNowTab;

    @FindBy(xpath = "//a[@id='sign_in']")
    private WebElement signInTab;

    @FindBy(id = "user_name")
    private WebElement usernameSignInForm;

    @FindBy(id = "user_password")
    private WebElement passwordSignInForm;

    @FindBy(id = "signin_btn")
    private WebElement signInBtn;

    @FindBy(id = "username")
    private WebElement usernameJoinNowForm;

    @FindBy(id = "name")
    private WebElement nameJoinForm;

    @FindBy(id = "email")
    private WebElement emailJoinForm;

    @FindBy(id = "password")
    private WebElement passwordJoinForm;

    @FindBy(id = "registration_btn")
    private WebElement joinNowBtn;

    @FindBy(id = "message_after_registration")
    private WebElement messageAfterRegistration;

    @FindBy(id = "user_info")
    private WebElement userInfoAfterLogin;

    @FindBy(id = "sign_out")
    private WebElement signOutBtn;

    @FindBy(id = "table")
    private WebElement table;

    @FindBy(id = "weather_info")
    private WebElement displayWeatherInfo;

    @FindBy(xpath = "//*[@id='add_to_fav_btn']")
    private WebElement addToFavBtn;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public void setEnterCityName(String city){
        enterCityName.sendKeys(city);
    }

    public void setSearchBtn(){
        searchBtn.click();
    }

    public void setUse_current_location_btn(){
        use_current_location_btn.click();
    }

    public void clickJoinNowTab(){
        joinNowTab.click();
    }

    public boolean clickSignInTab(){
        signInTab.click();
        wdw.until(ExpectedConditions.presenceOfElementLocated(By.id("signin_form")));
        return driver.findElement(By.id("signin_form")).isDisplayed();
//        return  true;
    }

    public void typeUsernameInSignInForm(String username){
        wdw.until(ExpectedConditions.presenceOfElementLocated(By.id("signin_form")));
        usernameSignInForm.sendKeys(username);
    }

    public void typePasswordInSignInForm(String password){
        wdw.until(ExpectedConditions.presenceOfElementLocated(By.id("signin_form")));
        passwordSignInForm.sendKeys(password);
    }

    public void clickSignInBtn(){
        wdw.until(ExpectedConditions.presenceOfElementLocated(By.id("signin_form")));
        signInBtn.click();
    }

    public void typeUsernameJoinNowForm(String username){
        usernameJoinNowForm.sendKeys(username);
    }

    public void setNameJoinForm(String name){
        nameJoinForm.sendKeys(name);
    }

    public void typePasswordJoinForm(String password){
        passwordJoinForm.sendKeys(password);
    }

    public void typeEmailJoinForm(String email){
        emailJoinForm.sendKeys((email));
    }

    public void clickJoinNowBtn(){
        joinNowBtn.click();
    }

    public String displayMessageAfterRegistration(){
        wdw.until(ExpectedConditions.presenceOfElementLocated(By.id("message_after_registration")));
        return messageAfterRegistration.getText();
    }

    public void clickAddToFavBtn(){
        addToFavBtn.click();
    }

    public void clickSignOutBtn(){
        signOutBtn.click();
    }

    public WebElement getEnterCityName() {
        return enterCityName;
    }

    public WebElement getSearchBtn() {
        return searchBtn;
    }

    public WebElement getUse_current_location_btn() {
        return use_current_location_btn;
    }

public WebElement getJoinNowTab(){
        return  joinNowTab;
}

public WebElement getSignInTab(){
        return signInTab;
}

public WebElement getUsernameSignInForm(){
        return usernameSignInForm;
}

public WebElement getPasswordSignInForm(){
        return passwordSignInForm;
}

public WebElement getSignInBtn(){
        return signInBtn;
}

public WebElement getUsernameJoinNowForm(){
        return usernameJoinNowForm;
}

public WebElement getNameJoinForm(){
        return nameJoinForm;
}

public WebElement getEmailJoinForm(){
        return emailJoinForm;
}

public  WebElement getPasswordJoinForm(){
        return passwordJoinForm;
}

public WebElement getJoinNowBtn(){
        return joinNowBtn;
}

public WebElement getUserInfoAfterLogin(){
        return userInfoAfterLogin;
}

public  WebElement getSignOutBtn(){
        return signOutBtn;
}

public  WebElement getTable(){
        return table;
}

public  WebElement getDisplayWeatherInfo(){
        return displayWeatherInfo;
}

public WebElement getAddToFavBtn(){
        return addToFavBtn;
}
}
