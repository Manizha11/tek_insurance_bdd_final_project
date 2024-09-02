package bdd.tek.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import bdd.tek.pages.CreateAccountPageObject;
import bdd.tek.utility.RandomGenerator;
import bdd.tek.utility.SeleniumUtility;

public class CreateAccountSteps extends SeleniumUtility {
    @When("click on Crate Primary Account link")
    public void clickOnCratePrimaryAccountLink() {
    clickOnElement(CreateAccountPageObject.CREATE_PRIMARY_ACCOUNT_LINK);
    }

    @Then("validate section title to be Create Primary Account Holder")
    public void validateSectionTitleToBeCreatePrimaryAccountHolder() {
        String createAccountHolderTitle = getElementText(CreateAccountPageObject.CREATE_PRIMARY_ACCOUNT_HOLDER_TILE);
        Assert.assertEquals("Create Primary Account Holder", createAccountHolderTitle);
    }

    @When("fill up create account form")
    public void fillUpCreateAccountForm() {
        String prefix = "Manizha";
        String randomEmail = RandomGenerator.randomEmail(prefix, prefix);
        sendText(CreateAccountPageObject.EMAIL_INPUT, randomEmail);
        selectFromDropDown(CreateAccountPageObject.PREFIX_SELECT, "Mrs.");
        sendText(CreateAccountPageObject.FIRST_NAME_INPUT, "Manizha");
        sendText(CreateAccountPageObject.LAST_NAME_INPUT, "Buribekova");
        selectFromDropDown(CreateAccountPageObject.GENDER_SELECT, "Femail");
        selectFromDropDown(CreateAccountPageObject.MARITAL_STATUS_SELECT, "Married");
        sendText(CreateAccountPageObject.EMPLOYMENT_STATUS, "Test Engineer");
        sendText(CreateAccountPageObject.DATE_OF_BIRTH, "07/07/2006");
    }

    @Then("click on Create Account button")
    public void clickOnCreateAccountButton() {
        clickOnElement(CreateAccountPageObject.CREATE_ACCOUNT_BUTTON);
    }

    @Then("validate Sign up your account title is exist")
    public void validateSignUpYourAccountTitleIsExist() {
        String actualSignUpTitle = getElementText(CreateAccountPageObject.SIGN_UP_YOUR_ACCOUNT_TITLE);
        Assert.assertEquals("Sign up your account", actualSignUpTitle);

    }
    @Then("validate user full name is displayed")
    public void validateUserFullNameIsDisplayed() {
        boolean userActualFullName = isElementIsDisplayed(CreateAccountPageObject.USER_FULL_NAME);
        Assert.assertTrue("User full name should be displayed", userActualFullName);

    }
    @Then("validate email address shows as expected")
    public void validateEmailAddressShowsAsExpected() {
        boolean userActualEmailAddress = isElementIsEnabled(CreateAccountPageObject.USER_EMAIL_ADDRESS_TITLE);
        Assert.assertTrue("Email address must be displayed as expected", userActualEmailAddress);

    }
    @When("when the user fill up sign up form")
    public void whenTheUserFillUpSignUpForm() {
        sendText(CreateAccountPageObject.USERNAME_INPUT, "Manizha");
        sendText(CreateAccountPageObject.PASSWORD_INPUT, "Manizha123$");
        sendText(CreateAccountPageObject.CONFIRM_PASSWORD_INPUT, "Manizha123$");
    }
    @Then("click on submit button")
    public void clickOnSubmitButton() {
        clickOnElement(CreateAccountPageObject.SUBMIT_BUTTON);
    }

    @When("fill up create account form page")
    public void fillUpCreateAccountFormPage() {

        sendText(CreateAccountPageObject.EMAIL_INPUT, "Mia@gmail.com");
        selectFromDropDown(CreateAccountPageObject.PREFIX_SELECT, "Mrs.");
        sendText(CreateAccountPageObject.FIRST_NAME_INPUT, "Manizha");
        sendText(CreateAccountPageObject.LAST_NAME_INPUT, "Buribekova");
        selectFromDropDown(CreateAccountPageObject.GENDER_SELECT, "Female");
        selectFromDropDown(CreateAccountPageObject.MARITAL_STATUS_SELECT, "Married");
        sendText(CreateAccountPageObject.EMPLOYMENT_STATUS, "Test Engineer");
        sendText(CreateAccountPageObject.DATE_OF_BIRTH, "07/07/2006");
    }

    @Then("validate account error message")
    public void validateAccountErrorMessage() {
        String errorMessage = getElementText(CreateAccountPageObject.ERROR_MESSAGE);
        Assert.assertEquals("ERROR", errorMessage);
        System.out.println(errorMessage);


    }
}