package stepdefinitions.BBC2;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BBC2.FootballPage;
import pages.fragments.BBC2.Score;
import pages.fragments.BBC2.ScoreBoard;
import utils.TestContext;

import java.util.Map;

public class FootballPageSteps {

    FootballPage footballPage;

    public FootballPageSteps(TestContext testContext) {
        footballPage = testContext.getPageFactoryManager().getFootballPage();
    }

    @And("User clicks on Scores and Fixture menu")
    public void userClicksOnScoresAndFixtureMenu() {
        footballPage.waitVisibilityOfElement(footballPage.getScoresAndFixturesMenu());
        footballPage.clickOnScoresAndFixturesMenu();
    }

    @When("User fills search input field with keyword {string}")
    public void userFillsSearchInputFieldWithKeywordNameOfChampionship(final String nameOfChampionship) {
        footballPage.waitVisibilityOfElement(footballPage.getSearchFieldForTeamsAndChampionships());
        footballPage.enterKeyWordInSearchField(nameOfChampionship);
    }

    @And("User choose specified period '{int}'")
    public void userChooseSpecifiedPeriodYearAndMonthIndex(final int index) {
        footballPage.waitVisibilityOfElementsList(footballPage.getListOfYearAndMonthValues());
        footballPage.clickOnYearAndMonthPeriodByIndex(index);
    }

//    @Then("User checks that names and scores is displayed correctly for specified team pair '{int}', {string}, {string}, {string}, {string}")
//    public void userChecksThatNamesAndScoresIsDisplayedCorrectlyNameOfFirstTeamScoreOfFirstTeamNameOfSecondTeamScoreOfSecondTeam(
//            final int pair, final String firstTeamName, final String firstTeamScore, final String secondTeamName, final String secondTeamScore) {
//        footballPage.waitVisibilityOfElementsList(footballPage.getScoreBoard().getListOfTeamsPair());
//        assertTrue(
//                footballPage.verifyThatTeamsAndScoresIsDisplayCorrectly(
//                        footballPage.getTeamsPairAsListOfString(footballPage.getScoreBoard().getTeamsPairByIndex(pair)
//                        ), firstTeamName, firstTeamScore, secondTeamName, secondTeamScore)
//        );
//    }

    @Then("User checks that names and scores is displayed correctly for specified team pair")
    public void userChecksThatNamesAndScoresIsDisplayedCorrectlyNameOfFirstTeamScoreOfFirstTeamNameOfSecondTeamScoreOfSecondTeam(DataTable dataTable) {
        Map<String, String> data = dataTable.asMap();
        String expectedNameOfFirstTeam = data.get("nameOfFirstTeam");
        String expectedScoreOfFirstTeam = data.get("scoreOfFirstTeam");
        String expectedNameOfSecondTeam = data.get("nameOfSecondTeam");
        String expectedScoreOfSecondTeam = data.get("scoreOfSecondTeam");

        ScoreBoard scoreBoard = footballPage.getScoreBoard();

        footballPage.waitVisibilityOfElementsList(scoreBoard.getListOfTeamsPair());
        Score score = scoreBoard.getScore(expectedNameOfFirstTeam, expectedNameOfSecondTeam);

        if (score == null) {
            Assert.assertTrue("There is no Score for: '" + expectedNameOfFirstTeam + "' and '" + expectedNameOfSecondTeam + "' teams", false);
        } else {
            String actualNameOfFirstTeam = score.getFirstTeamName();
            String actualScoreOfFirstTeam = score.getFirstTeamScore();
            String actualNameOfSecondTeam = score.getSecondTeamName();
            String actualScoreOfSecondTeam = score.getSecondTeamScore();

            Assert.assertTrue(
                    actualNameOfFirstTeam.equals(expectedNameOfFirstTeam) &&
                            actualScoreOfFirstTeam.equals(expectedScoreOfFirstTeam) &&
                            actualNameOfSecondTeam.equals(expectedNameOfSecondTeam) &&
                            actualScoreOfSecondTeam.equals(expectedScoreOfSecondTeam)
            );
        }
    }

    @And("User clicks on on one of the team names '{int}'")
    public void userClicksOnOnOneOfTheTeamNames(final int indexOfPair) {
        footballPage.getScoreBoard().clickOnOneOfTeamPair(indexOfPair);
    }

//    @Then("User checks that names and scores is displayed correctly on team pair subpage {string}, {string}, {string}, {string}")
//    public void userChecksThatNamesAndScoresIsDisplayedCorrectlyOnTeamPairSubpageNameOfFirstTeamScoreOfFirstTeamNameOfSecondTeamScoreOfSecondTeam(
//            final String firstTeamName, final String firstTeamScore, final String secondTeamName, final String secondTeamScore) {
//        footballPage.waitVisibilityOfElement(footballPage.getScoreOfSpecificPairOfTeamsOnTheirPage());
//        assertTrue(footballPage.verifyThatTeamsAndScoresIsDisplayCorrectly(
//                footballPage.getTeamsPairAsListOfString(footballPage.getScoreOfSpecificPairOfTeamsOnTheirPage()),
//                firstTeamName, firstTeamScore, secondTeamName, secondTeamScore));
//    }

    @Then("User checks that names and scores is displayed correctly on team pair subpage")
    public void userChecksThatNamesAndScoresIsDisplayedCorrectlyOnTeamPairSubpageNameOfFirstTeamScoreOfFirstTeamNameOfSecondTeamScoreOfSecondTeam(DataTable dataTable) {
        Map<String, String> data = dataTable.asMap();
        String expectedNameOfFirstTeam = data.get("nameOfFirstTeam");
        String expectedScoreOfFirstTeam = data.get("scoreOfFirstTeam");
        String expectedNameOfSecondTeam = data.get("nameOfSecondTeam");
        String expectedScoreOfSecondTeam = data.get("scoreOfSecondTeam");

        footballPage.waitVisibilityOfElement(footballPage.getScoreOfSpecificPairOfTeamsOnTheirPage());
        Score score = footballPage.getScore();

        footballPage.waitVisibilityOfElement(score.getScoreContainer());

        String actualNameOfFirstTeam = score.getFirstTeamName();
        String actualScoreOfFirstTeam = score.getFirstTeamScore();
        String actualNameOfSecondTeam = score.getSecondTeamName();
        String actualScoreOfSecondTeam = score.getSecondTeamScore();

        Assert.assertTrue(
                actualNameOfFirstTeam.equals(expectedNameOfFirstTeam) &&
                        actualScoreOfFirstTeam.equals(expectedScoreOfFirstTeam) &&
                        actualNameOfSecondTeam.equals(expectedNameOfSecondTeam) &&
                        actualScoreOfSecondTeam.equals(expectedScoreOfSecondTeam)
        );
    }
}
