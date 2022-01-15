package pages.fragments.BBC2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.fragments.BaseFragment;

import java.util.List;

public class ScoreBoard extends BaseFragment {

    @FindBy(xpath = ".//div[contains(@class,'qa-match-block')]//li[contains(@class,'list-ui__item')]")
    private List<WebElement> listOfTeamsPair;

    public ScoreBoard(WebElement container) {
        super(container);
    }

    public List<WebElement> getListOfTeamsPair() {
        return listOfTeamsPair;
    }

    public void clickOnOneOfTeamPair(int index) {
        listOfTeamsPair.get(index).click();
    }

    public Score getScore(String team1, String team2) {
        WebElement scoreContainer = listOfTeamsPair.stream().filter(teamPair -> {
            String text = teamPair.getText().toLowerCase();
            return text.contains(team1.toLowerCase()) && text.contains(team2.toLowerCase());
        }).findFirst().orElse(null);

        if (scoreContainer == null) {
            return null;
        }

        return new Score(scoreContainer);
    }
}
