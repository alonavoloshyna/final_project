package stepdefinitions.BBC2;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BBC2.MatchPage;
import pages.fragments.BBC2.Score;
import utils.TestContext;

import java.util.Map;

public class MatchPageSteps {

    MatchPage matchPage;

    public MatchPageSteps(TestContext testContext){
        matchPage = testContext.getPageFactoryManager().getMatchPage();
    }

    @Then("User checks that names and scores are displayed correctly on team pair subpage")
    public void userChecksThatNamesAndScoresIsDisplayedCorrectlyOnTeamPairSubpageNameOfFirstTeamScoreOfFirstTeamNameOfSecondTeamScoreOfSecondTeam(DataTable dataTable) {
        Map<String, String> data = dataTable.asMap();
        String expectedNameOfFirstTeam = data.get("nameOfFirstTeam");
        String expectedScoreOfFirstTeam = data.get("scoreOfFirstTeam");
        String expectedNameOfSecondTeam = data.get("nameOfSecondTeam");
        String expectedScoreOfSecondTeam = data.get("scoreOfSecondTeam");

        matchPage.waitVisibilityOfElement(matchPage.getScoreOfSpecificPairOfTeamsOnTheirPage());
        Score score = matchPage.getScore();

        matchPage.waitVisibilityOfElement(score.getScoreContainer());

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
