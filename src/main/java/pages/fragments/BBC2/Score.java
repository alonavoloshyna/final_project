package pages.fragments.BBC2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.fragments.BaseFragment;

import java.util.Arrays;
import java.util.List;

public class Score extends BaseFragment {

    private static final int FIRST_TEAM_NAME = 0;
    private static final int FIRST_TEAM_SCORE = 1;
    private static final int SECOND_TEAM_NAME = 2;
    private static final int SECOND_TEAM_SCORE = 3;

    @FindBy(xpath = ".//div[@class='sp-c-fixture__wrapper']")
    private WebElement scoreContainer;

    public Score(WebElement container) {
        super(container);
    }

    public WebElement getScoreContainer() {
        return scoreContainer;
    }

    private List<String> getScoreContainerTexts() {
        return Arrays.asList(scoreContainer.getText().split("\n"));
    }

    public String getFirstTeamName() {
        return getScoreContainerTexts().get(FIRST_TEAM_NAME);
    }

    public String getFirstTeamScore() {
        return getScoreContainerTexts().get(FIRST_TEAM_SCORE);
    }

    public String getSecondTeamName() {
        return getScoreContainerTexts().get(SECOND_TEAM_NAME);
    }

    public String getSecondTeamScore() {
        return getScoreContainerTexts().get(SECOND_TEAM_SCORE);
    }
}
