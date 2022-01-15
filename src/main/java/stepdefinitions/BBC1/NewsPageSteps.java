package stepdefinitions.BBC1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.BBC1.NewsPage;
import utils.TestContext;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class NewsPageSteps {

    NewsPage newsPage;

    public NewsPageSteps(TestContext testContext) {
        newsPage = testContext.getPageFactoryManager().getNewsPage();
    }

    @Then("User checks that top news title contains specified value {string}")
    public void userChecksThatTopNewsTitleContainsSpecifiedValueValue(final String expectedValue) {
        assertTrue(newsPage.getTextFromTitleOfHeadlineArticle().contains(expectedValue));
    }

    @And("User enters news category of headline article in search input field")
    public void userEntersNewsCategoryOfHeadlineArticleInSearchInputField() {
        newsPage.waitVisibilityOfElement(newsPage.getSearchField());
        newsPage.enterKeyWordInSearchField(newsPage.getNameOfNewsCategoryText());
    }

    @And("User clicks on search button")
    public void userClicksOnSearchButton() {
        newsPage.waitVisibilityOfElement(newsPage.getSearchButton());
        newsPage.clickOnSearchButton();
    }


    @Then("User checks that secondary news title contains specified values '<expectedValues>'")
    public void userChecksThatSecondaryNewsTitleContainsSpecifiedValuesExpectedValues(List<String> expectedTitles) {
        newsPage.waitVisibilityOfElement(newsPage.getListOfSubtitle().get(0));
        assertEquals(newsPage.getListOfSubtitleAsStringValues(), expectedTitles);
    }

    @And("User clicks on coronavirus menu")
    public void userClicksOnCoronavirusMenu() {
        newsPage.waitVisibilityOfElement(newsPage.getCoronavirusMenu());
        newsPage.clickOnCoronavirusMenu();
    }
}
