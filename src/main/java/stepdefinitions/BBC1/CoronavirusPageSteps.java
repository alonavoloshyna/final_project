package stepdefinitions.BBC1;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
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

    @And("User clicks on Send question menu")
    public void userClicksOnSendQuestionMenu() {
        coronavirusPage.clickOnSendQuestionMenu();
    }

    @Then("User checks that error message is displayed when {string} field is empty")
    public void userChecksThatErrorMessageIsDisplayedWhenSomeFieldIsEmpty(final String field) {
        switch (field) {
            case "question" -> {
                coronavirusPage.waitVisibilityOfElement(coronavirusPage.getErrorMessageForQuestionField());
                assertTrue(coronavirusPage.isErrorMessageForQuestionFieldDisplayed());
            }
            case "name" -> {
                coronavirusPage.waitVisibilityOfElement(coronavirusPage.getErrorMessageForNameField());
                assertTrue(coronavirusPage.isErrorMessageForNameFieldDisplayed());
            }
            case "email" -> {
                coronavirusPage.waitVisibilityOfElement(coronavirusPage.getErrorMessageForEmailField());
                assertTrue(coronavirusPage.isErrorMessageForEmailFieldDisplayed());
            }
            case "terms of service" -> {
                coronavirusPage.waitVisibilityOfElement(coronavirusPage.getErrorMessageForCheckbox());
                assertTrue(coronavirusPage.isErrorMessageForCheckboxDisplayed());
            }
            default -> throw new IllegalArgumentException("There is no handler for '" + field + "' field");
        }
    }

    @And("User clicks on Coronavirus stories menu")
    public void userClicksOnCoronavirusStoriesMenu() {
        coronavirusPage.waitVisibilityOfElement(coronavirusPage.getCoronavirusStoriesMenu());
        coronavirusPage.clickOnCoronavirusStoriesMenu();
    }

    @And("User fills Question form on Coronavirus page")
    public void fillInQuestionFormOnCoronavirusPage(DataTable dataTable) {
        coronavirusPage.getQuestionFormFragment().fillForm(dataTable.asMap());
    }
}
