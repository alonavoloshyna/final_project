//package BBC2Tests;
//
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import BBC1Tests.BasePageTests;
//
//public class FootballPageTests extends BasePageTests {
//
//    @Test
//    public void checkThatTeamsNamesAndScoresDisplayCorrectlyTest1(){
//        getHomePage().clickOnSportMenu();
//        getSportPage().clickOnFootballMenu();
//        getFootballPage().clickOnScoresAndFixturesMenu();
//        getFootballPage().enterKeyWordInSearchField("Scottish Championship");
//        getFootballPage().waitVisibilityOfElement(getFootballPage().getYearAndMonthByIndex(3));
//        getFootballPage().clickOnYearAndMonthPeriodByIndex(3);
//        getFootballPage().waitVisibilityOfElementsList(getFootballPage().getListOfTeamsPair());
//
//        Assert.assertTrue(getFootballPage().verifyThatTeamsAndScoresIsDisplayCorrectly(
//                getFootballPage().getTeamsPairAsListOfString(getFootballPage().getTeamsPairByIndex(14)),
//                        "Dunfermline", "3", "Queen of the South", "1"
//        ));
//
//        getFootballPage().clickOnOneOfTeamPair(14);
//
//        Assert.assertTrue(getFootballPage().verifyThatTeamsAndScoresIsDisplayCorrectly(
//                getFootballPage().getTeamsPairAsListOfString(getFootballPage().getScoreOfSpecificPairOfTeamsOnTheirPage()),
//                "Dunfermline", "3", "Queen of the South", "1"
//        ));
//    }
//
//    @Test
//    public void checkThatTeamsNamesAndScoresDisplayCorrectlyTest2(){
//        getHomePage().clickOnSportMenu();
//        getSportPage().clickOnFootballMenu();
//        getFootballPage().clickOnScoresAndFixturesMenu();
//        getFootballPage().enterKeyWordInSearchField("Premier League");
//        getFootballPage().waitVisibilityOfElement(getFootballPage().getYearAndMonthByIndex(10));
//        getFootballPage().clickOnYearAndMonthPeriodByIndex(10);
//        getFootballPage().waitVisibilityOfElementsList(getFootballPage().getListOfTeamsPair());
//
//        Assert.assertTrue(getFootballPage().verifyThatTeamsAndScoresIsDisplayCorrectly
//                (getFootballPage().getTeamsPairAsListOfString(getFootballPage().
//                                getTeamsPairByIndex(4)),
//                        "Leicester City", "4", "Watford", "2"));
//
//        getFootballPage().clickOnOneOfTeamPair(4);
//
//        Assert.assertTrue(getFootballPage().verifyThatTeamsAndScoresIsDisplayCorrectly
//                (getFootballPage().getTeamsPairAsListOfString(getFootballPage().getScoreOfSpecificPairOfTeamsOnTheirPage()),
//                        "Leicester City", "4", "Watford", "2"));
//    }
//
//    @Test
//    public void checkThatTeamsNamesAndScoresDisplayCorrectlyTest3(){
//        getHomePage().clickOnSportMenu();
//        getSportPage().clickOnFootballMenu();
//        getFootballPage().clickOnScoresAndFixturesMenu();
//        getFootballPage().enterKeyWordInSearchField("Scottish League One");
//        getFootballPage().waitVisibilityOfElement(getFootballPage().getYearAndMonthByIndex(2));
//        getFootballPage().clickOnYearAndMonthPeriodByIndex(2);
//        getFootballPage().waitVisibilityOfElementsList(getFootballPage().getListOfTeamsPair());
//
//        Assert.assertTrue(getFootballPage().verifyThatTeamsAndScoresIsDisplayCorrectly
//                (getFootballPage().getTeamsPairAsListOfString(getFootballPage().
//                                getTeamsPairByIndex(7)),
//                        "East Fife", "0", "Cove Rangers", "0"));
//
//        getFootballPage().clickOnOneOfTeamPair(7);
//        //getFootballPage().clickOnOneOfTeamPair(7);
//
//        Assert.assertTrue(getFootballPage().verifyThatTeamsAndScoresIsDisplayCorrectly
//                (getFootballPage().getTeamsPairAsListOfString(getFootballPage().getScoreOfSpecificPairOfTeamsOnTheirPage()),
//                        "East Fife", "0", "Cove Rangers", "0"));
//    }
//
//    @Test
//    public void checkThatTeamsNamesAndScoresDisplayCorrectlyTest4(){
//        getHomePage().clickOnSportMenu();
//        getSportPage().clickOnFootballMenu();
//        getFootballPage().clickOnScoresAndFixturesMenu();
//        getFootballPage().enterKeyWordInSearchField("Women's Champions League");
//        getFootballPage().waitVisibilityOfElement(getFootballPage().getYearAndMonthByIndex(7));
//        getFootballPage().clickOnYearAndMonthPeriodByIndex(7);
//        getFootballPage().waitVisibilityOfElementsList(getFootballPage().getListOfTeamsPair());
//
//        Assert.assertTrue(getFootballPage().verifyThatTeamsAndScoresIsDisplayCorrectly
//                (getFootballPage().getTeamsPairAsListOfString(getFootballPage().
//                                getTeamsPairByIndex(3)),
//                        "Arsenal Women", "3", "Slavia Prague Women", "0"));
//
//        getFootballPage().clickOnOneOfTeamPair( 3);
//
//        Assert.assertTrue(getFootballPage().verifyThatTeamsAndScoresIsDisplayCorrectly
//                (getFootballPage().getTeamsPairAsListOfString(getFootballPage().getScoreOfSpecificPairOfTeamsOnTheirPage()),
//                        "Arsenal Women", "3", "Slavia Prague Women", "0"));
//    }
//
//    @Test
//    public void checkThatTeamsNamesAndScoresDisplayCorrectlyTest5(){
//        getHomePage().clickOnSportMenu();
//        getSportPage().clickOnFootballMenu();
//        getFootballPage().clickOnScoresAndFixturesMenu();
//        getFootballPage().enterKeyWordInSearchField("Europa League");
//        getFootballPage().waitVisibilityOfElement(getFootballPage().getYearAndMonthByIndex(1));
//        getFootballPage().clickOnYearAndMonthPeriodByIndex(1);
//        getFootballPage().waitVisibilityOfElementsList(getFootballPage().getListOfTeamsPair());
//
//        Assert.assertTrue(getFootballPage().verifyThatTeamsAndScoresIsDisplayCorrectly
//                (getFootballPage().getTeamsPairAsListOfString(getFootballPage().
//                                getTeamsPairByIndex(16)),
//                        "Dynamo Kyiv", "1", "Club Bruges", "1"));
//
//        getFootballPage().clickOnOneOfTeamPair( 16);
//
//        Assert.assertTrue(getFootballPage().verifyThatTeamsAndScoresIsDisplayCorrectly
//                (getFootballPage().getTeamsPairAsListOfString(getFootballPage().getScoreOfSpecificPairOfTeamsOnTheirPage()),
//                        "Dynamo Kyiv", "1", "Club Bruges", "1"));
//    }
//}
