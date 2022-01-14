package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import pages.BBC2.FootballPage;
import utils.TestContext;

import static org.junit.Assert.assertTrue;

public class FootballPageSteps {

    FootballPage footballPage;

    public FootballPageSteps(TestContext testContext){
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

    @Then("User checks that names and scores is displayed correctly for specified team pair '{int}', {string}, {string}, {string}, {string}")
    public void userChecksThatNamesAndScoresIsDisplayedCorrectlyNameOfFirstTeamScoreOfFirstTeamNameOfSecondTeamScoreOfSecondTeam(
            final int pair, final String firstTeamName, final String firstTeamScore, final String secondTeamName, final String secondTeamScore) {
        footballPage.waitVisibilityOfElementsList(footballPage.getListOfTeamsPair());
        assertTrue(footballPage.verifyThatTeamsAndScoresIsDisplayCorrectly(
                footballPage.getTeamsPairAsListOfString(footballPage.getTeamsPairByIndex(pair)),
                firstTeamName, firstTeamScore, secondTeamName, secondTeamScore));
    }

    @And("User clicks on on one of the team names '{int}'")
    public void userClicksOnOnOneOfTheTeamNames(final int indexOfPair) {
        footballPage.clickOnOneOfTeamPair(indexOfPair);
    }

    @Then("User checks that names and scores is displayed correctly on team pair subpage {string}, {string}, {string}, {string}")
    public void userChecksThatNamesAndScoresIsDisplayedCorrectlyOnTeamPairSubpageNameOfFirstTeamScoreOfFirstTeamNameOfSecondTeamScoreOfSecondTeam(
            final String firstTeamName, final String firstTeamScore, final String secondTeamName, final String secondTeamScore) {
        footballPage.waitVisibilityOfElement(footballPage.getScoreOfSpecificPairOfTeamsOnTheirPage());
        assertTrue(footballPage.verifyThatTeamsAndScoresIsDisplayCorrectly(
                footballPage.getTeamsPairAsListOfString(footballPage.getScoreOfSpecificPairOfTeamsOnTheirPage()),
                        firstTeamName, firstTeamScore, secondTeamName, secondTeamScore));
    }
}
