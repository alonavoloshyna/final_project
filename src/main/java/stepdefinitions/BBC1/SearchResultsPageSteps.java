package stepdefinitions.BBC1;

import io.cucumber.java.en.Then;
import pages.BBC1.SearchResultsPage;
import utils.TestContext;

import static org.junit.Assert.assertEquals;

public class SearchResultsPageSteps {

    SearchResultsPage searchResultsPage;

    public SearchResultsPageSteps(TestContext testContext) {
        searchResultsPage = testContext.getPageFactoryManager().getSearchResultsPage();
    }

    @Then("User checks that article '{int}' contains value {string}")
    public void userChecksThatSpecifiedFoundArticleNumberOfArticleContainsSpecifiedValueExpectedValue(int numberOfArticle, String expectedValue) {
        assertEquals(expectedValue, searchResultsPage.getArticleTitleOfResultInSearchByIndex(numberOfArticle));
    }
}
