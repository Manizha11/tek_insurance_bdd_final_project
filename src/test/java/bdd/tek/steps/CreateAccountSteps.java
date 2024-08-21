package bdd.tek.steps;

import bdd.tek.utility.SeleniumUtility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CreateAccountSteps extends SeleniumUtility {

    @When("click on {string} links")
    public void clickOnLinks(String linkText) {
        clickOnElement(CreateAccountPageObject.CREATE_PRIMARY_ACCOUNT_LINK);

    }
    @Then("validate section title to be {string}")
    public void validateSectionTitleToBe(String expectedTitle) {
        String createAccountHolderTitle = getElementText(CreateAccountPageObject.CREATE_PRIMARY_ACCOUNT_HOLDER_TILE);
        Assert.assertEquals("Create Primary Account Holder", createAccountHolderTitle);

    }
    @Then("fill up create account form")
    public void fillUpCreateAccountForm() {
        sendText(CreateAccountPageObject.EMAIL_INPUT, "Mia@gmail.com");
        sendText(CreateAccountPageObject.FIRST_NAME_INPUT, "Manizha");
        sendText(CreateAccountPageObject.LAST_NAME_INPUT, "Buribekova");
        sendText(CreateAccountPageObject.SELECT_DROPDOWN, "Mr.");
    }
    @When("click on {string} button")
    public void clickOnButton(String button) {

    }
}

