package pages.BBC2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.fragments.BBC2.ScoreBoard;

import java.util.List;

public class FootballPage extends BasePage {

    @FindBy(xpath = "//span[@role='region']/div")
    private WebElement fixturesSection;

    @FindBy(xpath = "//ul[@id='sp-nav-secondary']//a[contains(@href,'scores-fixtures')]")
    private WebElement scoresAndFixturesMenu;

    @FindBy(xpath = "//input[@id='downshift-0-input']")
    private WebElement searchFieldForTeamsAndChampionships;

    @FindBy(xpath = "//div[contains(@class,'timeline__lists')]//a[contains(@href,'/scores-fixtures/')]")
    private List<WebElement> listOfYearAndMonthValues;

    public FootballPage(WebDriver driver) {
        super(driver);
    }

    public ScoreBoard getScoreBoard() {
        return new ScoreBoard(fixturesSection);
    }

    public WebElement getSearchFieldForTeamsAndChampionships() {
        return searchFieldForTeamsAndChampionships;
    }

    public List<WebElement> getListOfYearAndMonthValues() {
        return listOfYearAndMonthValues;
    }

    public WebElement getScoresAndFixturesMenu() {
        return scoresAndFixturesMenu;
    }

    public void clickOnScoresAndFixturesMenu() {
        scoresAndFixturesMenu.click();
    }

    public void enterKeyWordInSearchField(String searchKeyword) {
        searchFieldForTeamsAndChampionships.sendKeys(searchKeyword, Keys.ARROW_DOWN, Keys.ENTER);
    }

    public void clickOnYearAndMonthPeriodByIndex(int index) {
        listOfYearAndMonthValues.get(index).click();
    }
}
