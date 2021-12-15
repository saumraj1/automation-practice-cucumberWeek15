package com.automation.cucumber.steps;

import com.automation.pages.CreateAccountPage;
import com.automation.pages.SignInPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;


public class CreateAccountSteps {

    @And("^I enter a new email$")
    public void iEnterANewEmail() {
      new SignInPage().enterEmailCreate(SignInSteps.email);
    }

    @And("^I click Create an Account$")
    public void iClickCreateAnAccount() {
        new SignInPage().clickCreateButton();
    }

    @And("^I select gender$")
    public void iSelectGender() {
        new CreateAccountPage().getGender("Female");
    }

    @And("^I enter customer first name$")
    public void iEnterCustomerFirstName() {
        new CreateAccountPage().getCustomerFNM("roma");
    }

    @And("^I enter customer last name$")
    public void iEnterCustomerLastName() {
        new CreateAccountPage().getCustomerLNM("Patel");
    }

    @And("^I enter password$")
    public void iEnterPassword() {
        new CreateAccountPage().getPassword("java@1234");
    }

    @And("^I select day of Birth$")
    public void iSelectDayOfBirth() {
        new CreateAccountPage().getDays("2");
    }

    @And("^I select month of Birth$")
    public void iSelectMonthOfBirth() {
        new CreateAccountPage().getMonths("4");
    }

    @And("^I select year of Birth$")
    public void iSelectYearOfBirth() {
        new CreateAccountPage().getYears("1986");
    }

    @And("^I enter first name$")
    public void iEnterFirstName() {
        new CreateAccountPage().getFName("roma");
    }

    @And("^I enter last name$")
    public void iEnterLastName() {
        new CreateAccountPage().getLName("Patel");
    }

    @And("^I enter Company$")
    public void iEnterCompany() {
        new CreateAccountPage().getCompany("ABCD123");
    }
    @And("^I enter Address One$")
    public void iEnterAddressOne() {
        new CreateAccountPage().getAddress1("12 London St");
    }

    @And("^I enter Address Two$")
    public void iEnterAddressTwo() {
        new CreateAccountPage().getAddress1("Harrow");
    }

    @And("^I enter City$")
    public void iEnterCity() {
        new CreateAccountPage().getCity("London");
    }

    @And("^I enter State$")
    public void iEnterState() {
        new CreateAccountPage().getState("New york");
    }

    @And("^I enter Post Code$")
    public void iEnterPostCode() {
        new CreateAccountPage().getPostcode("12455");
    }

    @And("^I enter Country$")
    public void iEnterCountry() {
        new CreateAccountPage().getCountry("United States");
    }

    @And("^I enter other details$")
    public void iEnterOtherDetails() {
        new CreateAccountPage().getOther("My details and information");
    }

    @And("^I enter phone no$")
    public void iEnterPhoneNo() {
        new CreateAccountPage().getPhone("+121542222");
    }

    @And("^I enter mobile no$")
    public void iEnterMobileNo() {
        new CreateAccountPage().getMobileNo("+12444555444");
    }

    @And("^I enter alia$")
    public void iEnterAlia() {
        new CreateAccountPage().getAlias("My 1st Address");
    }

    @And("^I click on register button$")
    public void iClickOnRegisterButton() {
        new CreateAccountPage().clickRegister();
    }

    @Then("^I should see My Account$")
    public void iShouldSeeMyAccount() {
        String sinIn = new CreateAccountPage().textMyAc();
        String expectedMessage ="My account";
        Assert.assertEquals("Show My account ",expectedMessage,sinIn);
    }
}
