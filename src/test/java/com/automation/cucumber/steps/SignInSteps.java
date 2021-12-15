package com.automation.cucumber.steps;

import com.automation.pages.HomePage;
import com.automation.pages.SignInPage;
import com.automation.utility.Utility;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class SignInSteps {
    public static String email = Utility.getRandomString(5)+"@gmail.com";
    @Given("^I am at homepage$")
    public void iAmAtHomepage() {
        System.out.println("I am on home page");
    }

    @When("^I click on sign in link$")
    public void iClickOnSignInLink() {
        new HomePage().clickOnSignInLink();
    }

    @Then("^I should see the message AUTHENTICATION$")
    public void iShouldSeeTheMessageAUTHENTICATION() {
        String expectedMessage = "AUTHENTICATION";
        String actualMessage = new SignInPage().getAuthTexCls();
        Assert.assertEquals("Error message not displayed",expectedMessage,actualMessage);

    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email)  {
      new SignInPage().enterEmailField(email);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        new SignInPage().enterPasswordField(password);

    }

    @And("^I click on Sign In button$")
    public void iClickOnSignInButton() {
        new SignInPage().clickOnLoginButton();
    }

    @Then("^I should see the error message \"([^\"]*)\"$")
    public void iShouldSeeTheErrorMessage(String message)  {
        String expectedMessage = message;
        String actualMessage = new SignInPage().getAuthFailed();
        Assert.assertEquals("Invalid Credentials ", expectedMessage, actualMessage);

    }

    @When("^I enter valid email$")
    public void iEnterValidEmail() {
        new SignInPage().enterEmailField("roma.patel2@gmail.com");
    }

    @And("^I enter valid password$")
    public void iEnterValidPassword() {
        new SignInPage().enterPasswordField("Java@1234");
    }

    @Then("^I should see Sign out link$")
    public void iShouldSeeSignOutLink() {
        String signOut = new SignInPage().getSignOut();
        String expectedMessage ="Sign out";
        Assert.assertEquals("No Sign Out link shown ",expectedMessage,signOut);

    }

    @And("^I click on Sign out link$")
    public void iClickOnSignOutLink() {
        new SignInPage().setSignOut();
    }

    @Then("^I should see Sign In link$")
    public void iShouldSeeSignInLink() {
        String signIn = new SignInPage().getSignOut();
        String expectedMessage ="Sign in";
        Assert.assertEquals("No Sign In link shown ",expectedMessage,signIn);
    }
}
