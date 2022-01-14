//package BBC1Tests;
//
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class SearchResultsPageTests extends BasePageTests {
//
//    @Test
//    public void checkSearchResultsByNameOfNewsCategory() { //Done???
//        String EXPECTED_TITLE = "Australia: Earth's Magical Kingdom";
//        int NUMBER_OF_TITLE = 0;
//
//        getHomePage().clickOnNewsMenu();
//        getNewsPage().enterKeyWordInSearchField(getNewsPage().getNameOfNewsCategoryText());
//        getNewsPage().clickOnSearchButton();
//
//        Assert.assertEquals(getSearchResultsPage().getArticleTitleOfResultInSearchByIndex(NUMBER_OF_TITLE), EXPECTED_TITLE);
//    }
//}
