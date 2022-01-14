//package BBC1Tests;
//
//import org.openqa.selenium.JavascriptExecutor;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class CoronavirusPageTests extends BasePageTests { //Done
//    private static final String NAME = "Alona Voloshyna";
//    private static final String EMAIL_ADDRESS = "a.v.testmail@ukr.net";
//    public static final String QUESTION = "What are the recommendations for someone who has symptoms of COVID-19?";
//
//    @Test
//    public void checkQuestionFormForCorrectErrorMessageWhenQuestionFieldIsEmpty() {
//        getHomePage().clickOnNewsMenu();
//        getNewsPage().clickOnCoronavirusMenu();
//        getCoronavirusPage().clickOnCoronavirusStoriesMenu();
//        getCoronavirusPage().waitVisibilityOfElement(getCoronavirusPage().getCloseButtonForAdd());
//        getCoronavirusPage().closeAdd();
//        getCoronavirusPage().clickOnSendQuestionMenu();
//        getCoronavirusPage().waitVisibilityOfElement(getCoronavirusPage().getQuestionForm());
//        getCoronavirusPage().fillInputFieldForName(NAME);
//        getCoronavirusPage().fillInputFieldForEmail(EMAIL_ADDRESS);
//        getCoronavirusPage().putTickInTheCheckbox();
//        getCoronavirusPage().clickSubmitButton();
//        getCoronavirusPage().waitVisibilityOfElement(getCoronavirusPage().getErrorMessageForQuestionField());
//
//        Assert.assertTrue(getCoronavirusPage().isErrorMessageForQuestionFieldDisplayed());
//    }
//
//    @Test
//    public void checkQuestionFormForCorrectErrorMessageWhenEmailFieldIsEmpty() {
//        getHomePage().clickOnNewsMenu();
//        getNewsPage().clickOnCoronavirusMenu();
//        getCoronavirusPage().clickOnCoronavirusStoriesMenu();
//        getCoronavirusPage().waitVisibilityOfElement(getCoronavirusPage().getCloseButtonForAdd());
//        getCoronavirusPage().closeAdd();
//        getCoronavirusPage().clickOnSendQuestionMenu();
//        getCoronavirusPage().waitVisibilityOfElement(getCoronavirusPage().getQuestionForm());
//        getCoronavirusPage().fillInputFieldForName(NAME);
//        getCoronavirusPage().fillTextareaWithQuestion(QUESTION);
//        getCoronavirusPage().putTickInTheCheckbox();
//        getCoronavirusPage().clickSubmitButton();
//        getCoronavirusPage().waitVisibilityOfElement(getCoronavirusPage().getErrorMessageForEmailField());
//
//        Assert.assertTrue(getCoronavirusPage().isErrorMessageForEmailFieldDisplayed());
//    }
//
//    @Test
//    public void checkQuestionFormForCorrectErrorMessageWhenNameFieldIsEmpty() {
//        getHomePage().clickOnNewsMenu();
//        getNewsPage().clickOnCoronavirusMenu();
//        getCoronavirusPage().clickOnCoronavirusStoriesMenu();
//        getCoronavirusPage().waitVisibilityOfElement(getCoronavirusPage().getCloseButtonForAdd());
//        getCoronavirusPage().closeAdd();
//        getCoronavirusPage().clickOnSendQuestionMenu();
//        getCoronavirusPage().waitVisibilityOfElement(getCoronavirusPage().getQuestionForm());
//        getCoronavirusPage().fillInputFieldForEmail(EMAIL_ADDRESS);
//        getCoronavirusPage().fillTextareaWithQuestion(QUESTION);
//        getCoronavirusPage().putTickInTheCheckbox();
//        getCoronavirusPage().clickSubmitButton();
//        getCoronavirusPage().waitVisibilityOfElement(getCoronavirusPage().getErrorMessageForNameField());
//
//        Assert.assertTrue(getCoronavirusPage().isErrorMessageForNameFieldDisplayed());
//    }
//
//    @Test
//    public void checkQuestionFormForCorrectErrorMessageWhenTermOfServiceNotAccepted() {
//        getHomePage().clickOnNewsMenu();
//        getNewsPage().clickOnCoronavirusMenu();
//        getCoronavirusPage().clickOnCoronavirusStoriesMenu();
//        getCoronavirusPage().clickOnSendQuestionMenu();
//        getCoronavirusPage().waitVisibilityOfElement(getCoronavirusPage().getCloseButtonForAdd());
//        getCoronavirusPage().closeAdd();
//        getCoronavirusPage().waitVisibilityOfElement(getCoronavirusPage().getQuestionForm());
//        getCoronavirusPage().fillInputFieldForEmail(EMAIL_ADDRESS);
//        getCoronavirusPage().fillTextareaWithQuestion(QUESTION);
//        getCoronavirusPage().fillInputFieldForName(NAME);
//        getCoronavirusPage().clickSubmitButton();
//        getCoronavirusPage().waitVisibilityOfElement(getCoronavirusPage().getErrorMessageForCheckbox());
//
//        Assert.assertTrue(getCoronavirusPage().isErrorMessageForCheckboxDisplayed());
//    }
//}
