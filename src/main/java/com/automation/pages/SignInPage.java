package com.automation.pages;


import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;



public class SignInPage extends Utility {

    private static final Logger log = LogManager.getLogger(SignInPage.class.getName());
    public SignInPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")     //input[@id='email']
    WebElement emailField;
    @FindBy(id = "passwd")    //input[@id='passwd']
    WebElement passwordField;
    @FindBy(id = "SubmitLogin")    //button[@id='SubmitLogin']
    WebElement submitLogin;
    @FindBy(id = "email_create")   //input[@id='email_create']
    WebElement emailCreate;
    @FindBy(id="SubmitCreate")      //button[@id='SubmitCreate']
    WebElement submitCreate;
    @FindBy(xpath = "//h1[contains(text(),'Authentication')]")      //h1[contains(text(),'Authentication')]
    WebElement authText;
    @FindBy(className = "page-heading")     //h1[@class='page-heading']
    WebElement authClassText;
    @FindBy(xpath = "//h3[contains(text(),'Create an account')]")   //h3[contains(text(),'Create an account')]
    WebElement createText;
    @FindBy(xpath = "//div[@class='alert alert-danger']//li")      //div[@class='alert alert-danger']//li
    WebElement authFailed;
    @FindBy(xpath = "//a[@title='Log me out']")     //a[@title='Log me out']
    WebElement signOut;



    public void enterEmailField(String email){
        sendTextToElement(emailField,email);
        Reporter.log("Entering email :" +email+ " in the emailField :" +emailField.toString() + "<br>");
//        CustomListeners.test.log(Status.PASS,"Enter EmailID "+email);
        log.info( "Entering email :" +emailField .toString());
    }
    public void enterPasswordField(String password){
        sendTextToElement(passwordField,password);
        Reporter.log("Entering password :" +password+ " in the passwordField :" +passwordField.toString() + "<br>");
//      //    CustomListeners.test.log(Status.PASS,"Enter Password "+password);
        log.info( "Entering password :" +passwordField .toString());
    }

    public void clickOnLoginButton(){
        clickOnElement(submitLogin);
        Reporter.log("click on Sign in button" +submitLogin.toString());
//        CustomListeners.test.log(Status.PASS,"Click on SignIn Button");
        log.info("click on Sign in button"  + submitLogin.toString());
    }
    public void enterEmailCreate(String crEmail){
       sendTextToElement(emailCreate,crEmail);
        //randomEmail(emailCreate);
        Reporter.log("Entering Email in the emailCreate :" +emailCreate.toString() + "<br>");
//        CustomListeners.test.log(Status.PASS,"Enter Email "+crEmail);
        log.info( "Entering Email in the emailCreate :" +emailCreate .toString());
    }
    public void clickCreateButton(){
        clickOnElement(submitCreate);
        Reporter.log("click on Create An Account Button" +submitCreate.toString()+ "<br>");
//        CustomListeners.test.log(Status.PASS,"Click on Create An Account Button");
        log.info( "click on Create An Account Button" + submitCreate.toString());
    }
    public String getAuthText(){
        String authTextMsg = getTextFromElement(authText);
        Reporter.log("Get text Authentication" +authText.toString() +"<br>");
//        CustomListeners.test.log(Status.PASS,"Get text Authentication");
        log.info( "Get text Authentication" +authText .toString());
        return authTextMsg;
    }
    public String getAuthTexCls(){
        Reporter.log("verify text" +authClassText.toString()+"<br>");
        String authTexClMsg= getTextFromElement(authClassText);
//        CustomListeners.test.log(Status.PASS,"Get text(Class) Authentication");
        log.info( "verify text" +authClassText .toString());
        return authTexClMsg;
    }
    public String getCreateText(){
        String createTextMsg = getTextFromElement(createText);
        Reporter.log("verify text Create an account" +createText.toString()+"<br>");
//        CustomListeners.test.log(Status.PASS,"Get text Create an account");
        return createTextMsg;
    }
    public String getAuthFailed(){
        String authFailedMsg= getTextFromElement(authFailed);
        Reporter.log("verify text Authentication Error" +authFailed.toString()+"<br>");
//        CustomListeners.test.log(Status.PASS,"Get text Authentication Error");
        log.info( "verify text Authentication Error" +authFailed .toString());
        return authFailedMsg;
    }
    public String getSignOut(){
        String signOutTxt = getTextFromElement(signOut);
        Reporter.log("verify text Sign Out Link" +signOut.toString()+"<br>");
//        CustomListeners.test.log(Status.PASS,"show Sign Out Link");
        log.info("verify text Sign Out Link"  + signOut.toString());
        return signOutTxt;
    }
    public void setSignOut(){
        clickOnElement(signOut);
        Reporter.log("Click Sign Out" +signOut.toString()+"<br>");
        log.info( "Click Sign Out" + signOut.toString());
//        CustomListeners.test.log(Status.PASS,"Get Sign Out");
    }


}
