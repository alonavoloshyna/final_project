package pages.BBC2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.fragments.BBC2.Score;

public class MatchPage extends BasePage {

    @FindBy(xpath = "//div[contains(@class,'football-oppm-header')]")
    private WebElement scoreOfSpecificPairOfTeamsOnTheirPage;

    public MatchPage(WebDriver driver) {
        super(driver);
    }

    public Score getScore() {
        return new Score(scoreOfSpecificPairOfTeamsOnTheirPage);
    }

    public WebElement getScoreOfSpecificPairOfTeamsOnTheirPage() {
        return scoreOfSpecificPairOfTeamsOnTheirPage;
    }
}
