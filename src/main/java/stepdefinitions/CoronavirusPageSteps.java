package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BBC1.CoronavirusPage;
import utils.TestContext;

import static org.junit.Assert.assertTrue;

public class CoronavirusPageSteps {

    CoronavirusPage coronavirusPage;

    public CoronavirusPageSteps(TestContext testContext) {
        this.coronavirusPage = testContext.getPageFactoryManager().getCoronavirusPage();
    }

    @And("User closes advertising message on page")
    public void userClosesAdvertisingMessageOnPage() {
        coronavirusPage.waitVisibilityOfElement(coronavirusPage.getCloseButtonForAdd());
        coronavirusPage.closeAdd();
    }

    @And("User clicks on send question menu")
    public void userClicksOnSendQuestionMenu() {
        coronavirusPage.clickOnSendQuestionMenu();
    }

    @When("User fills name input field with name value {string}")
    public void userFillsNameInputFieldWithNameValueNameValue(final String name) {
        coronavirusPage.waitVisibilityOfElement(coronavirusPage.getQuestionForm());
        coronavirusPage.fillInputFieldForName(name);
    }

    @And("User fills email input field with email value {string}")
    public void userFillsEmailInputFieldWithEmailValueEmailValue(final String email) {
        coronavirusPage.fillInputFieldForEmail(email);
    }

    @And("User accepts the terms of Service by clicking on checkbox")
    public void userAcceptsTheTermsOfServiceByClickingOnCheckbox() {
        coronavirusPage.putTickInTheCheckbox();
    }

    @And("User clicks on submit button")
    public void userClicksOnSubmitButton() {
        coronavirusPage.clickSubmitButton();
    }

    @Then("User checks that error message is displayed when question field is empty")
    public void userChecksThatErrorMessageIsDisplayedWhenQuestionFieldIsEmpty() {
        coronavirusPage.waitVisibilityOfElement(coronavirusPage.getErrorMessageForQuestionField());
        assertTrue(coronavirusPage.isErrorMessageForQuestionFieldDisplayed());
    }

    @And("User fills email input field with question text {string}")
    public void userFillsEmailInputFieldWithQuestionTextQuestionText(final String question) {
        coronavirusPage.fillTextareaWithQuestion(question);
    }

    @Then("User checks that error message is displayed when email field is empty")
    public void userChecksThatErrorMessageIsDisplayedWhenEmailFieldIsEmpty() {
        coronavirusPage.waitVisibilityOfElement(coronavirusPage.getErrorMessageForEmailField());
        assertTrue(coronavirusPage.isErrorMessageForEmailFieldDisplayed());
    }

    @Then("User checks that error message is displayed when name field is empty")
    public void userChecksThatErrorMessageIsDisplayedWhenNameFieldIsEmpty() {
        coronavirusPage.waitVisibilityOfElement(coronavirusPage.getErrorMessageForNameField());
        assertTrue(coronavirusPage.isErrorMessageForNameFieldDisplayed());
    }

    @Then("User checks that error message is displayed when term of service is not accepted")
    public void userChecksThatErrorMessageIsDisplayedWhenTermOfServiceIsNotAccepted() {
        coronavirusPage.waitVisibilityOfElement(coronavirusPage.getErrorMessageForCheckbox());
        assertTrue(coronavirusPage.isErrorMessageForCheckboxDisplayed());
    }

    @And("User clicks on coronavirus stories menu")
    public void userClicksOnCoronavirusStoriesMenu() {
        coronavirusPage.waitVisibilityOfElement(coronavirusPage.getCoronavirusStoriesMenu());
        coronavirusPage.clickOnCoronavirusStoriesMenu();
    }
}
