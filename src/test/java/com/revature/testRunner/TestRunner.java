package com.revature.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(glue = "com.revature.steps", features = "/Users/bipulchaudhary/Revature/IntelliJ/intro-to-bdd-test-automation-framework/features/login.feature")
public class TestRunner extends AbstractTestNGCucumberTests {

}
