//package BBC1Tests;
//
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import java.util.Arrays;
//import java.util.List;
//
//public class NewsPageTests extends BasePageTests {
//
//    @Test
//    public void checkThatTitleContainsSpecifiedValue() { // Done
//        String SEARCH_KEYWORD = "Australia";
//
//        getHomePage().clickOnNewsMenu();
//        getNewsPage().waitVisibilityOfElement(getNewsPage().getTitleOfHeadlineArticle());
//
//        Assert.assertTrue(getNewsPage().getTextFromTitleOfHeadlineArticle().contains(SEARCH_KEYWORD));
//    }
//
//    @Test
//    public void checkThatSubtitlesAreRight() {
//        int FIRST = 0;
//        List<String> requiredSubtitles = Arrays.asList(
//                "UK PM's staff accused of more lockdown parties", "Widespread cyber-attack hits Ukrainian government",
//                "Prince Andrew loses military titles and use of HRH", "Why Prince Andrew's titles meant so much to him",
//                "Former child prodigy to release new album, aged 97", "Supreme Court blocks Joe Biden's vaccine mandate",
//                "Dutch king retires golden coach amid slavery row", "China denies 'agent' infiltrated UK parliament",
//                "N Korea hackers stole $400m crypto in 2021 - report", "Discrimination and harassment haunt Sri Lanka's Muslims",
//                "Militia head charged with sedition for Capitol riot", "Google backs office work with £730m investment"
//        );
//
//        getHomePage().clickOnNewsMenu();
//        getNewsPage().waitVisibilityOfElement(getNewsPage().getCloseButtonForAdd());
//        getNewsPage().closeAdd();
//        getNewsPage().waitVisibilityOfElement(getNewsPage().getSubTitleByIndex(FIRST));
//
//        Assert.assertEquals(getNewsPage().getListOfSubtitleAsStringValues(), requiredSubtitles);
//    }
//}
