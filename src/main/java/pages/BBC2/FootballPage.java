package pages.BBC2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.Arrays;
import java.util.List;

public class FootballPage extends BasePage {

    @FindBy(xpath = "//ul[@id='sp-nav-secondary']//a[contains(@href,'scores-fixtures')]")
    private WebElement scoresAndFixturesMenu;

    @FindBy(xpath = "//input[@id='downshift-0-input']")
    private WebElement searchFieldForTeamsAndChampionships;

    @FindBy(xpath = "//div[contains(@class,'qa-match-block')]//li[contains(@class,'list-ui__item')]")
    private List<WebElement> listOfTeamsPair;

    @FindBy(xpath = "//div[contains(@class,'header')]//div[@class='sp-c-fixture__wrapper']")
    private WebElement scoreOfSpecificPairOfTeamsOnTheirPage;

    @FindBy(xpath = "//div[contains(@class,'timeline__lists')]//a[contains(@href,'/scores-fixtures/')]")
    private List<WebElement> listOfYearAndMonthValues;

    public FootballPage(WebDriver driver) {
        super(driver);
    }

//    public WebElement getElementByMonthYear(String year, String month) {
//        return driver.findElement(By.xpath("//div[contains(@class,'timeline__lists')]//a[contains(@href,'/scores-fixtures/" + year + "-" + month + "')]"));
//    }

    public WebElement getScoreOfSpecificPairOfTeamsOnTheirPage() {
        return scoreOfSpecificPairOfTeamsOnTheirPage;
    }

    public List<WebElement> getListOfTeamsPair() {
        return listOfTeamsPair;
    }

    public WebElement getTeamsPairByIndex(int index) {
        return listOfTeamsPair.get(index);
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

//    public void chooseFixtureByMonth(String year, String month) {
//        getElementByMonthYear(year, month).click();
//    }

    public void clickOnYearAndMonthPeriodByIndex(int index){
        getYearAndMonthByIndex(index).click();
    }

    public List<String> getTeamsPairAsListOfString(WebElement teamsPair) {
        return Arrays.asList(teamsPair.getText().split("\n"));
    }

    public boolean verifyThatTeamsAndScoresIsDisplayCorrectly(List<String> teamPairs, String teamFirst, String scoreOfFirstTeam, String teamSecond, String scoreOfSecondTeam) {
        boolean result = false;
        if (teamPairs.get(0).equals(teamFirst) && teamPairs.get(1).equals(scoreOfFirstTeam) && teamPairs.get(2).equals(teamSecond) && teamPairs.get(3).equals(scoreOfSecondTeam)) {
            result = true;
        }
        return result;
    }

    public void clickOnOneOfTeamPair(int index) {
        listOfTeamsPair.get(index).click();
    }

    public WebElement getYearAndMonthByIndex(int index){
        return listOfYearAndMonthValues.get(index);
    }
}
