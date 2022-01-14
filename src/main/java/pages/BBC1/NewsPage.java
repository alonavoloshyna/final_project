package pages.BBC1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class NewsPage extends BasePage {

    @FindBy(xpath = "//div[contains(@class,'display-none ')]//a[contains(@class,'paragon-bold')]")
    private WebElement titleOfHeadlineArticle;

    @FindBy(xpath = "//div[@class='gel-wrap gs-u-pt+']//h3[contains(@class,'heading__title gel-pica-bold')]")
    private List<WebElement> listOfSubtitle;

    @FindBy(xpath = "//button[@class='tp-close tp-active']")
    private WebElement closeButtonForAdd;

    @FindBy(xpath = "//div[contains(@class,'display-inline-block@m')]//a[contains(@class,'gs-c-section-link')]")
    private WebElement nameOfNewsCategory;

    @FindBy(xpath = "//input[@id='orb-search-q']")
    private WebElement searchField;

    @FindBy(xpath = "//button[@id='orb-search-button']")
    private WebElement searchButton;

    @FindBy(xpath = "//nav[@class='nw-c-nav__wide']//a[@href='/news/coronavirus']")
    private WebElement coronavirusMenu;

    public NewsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getTitleOfHeadlineArticle() {
        return titleOfHeadlineArticle;
    }

    public List<WebElement> getListOfSubtitle() {
        return listOfSubtitle;
    }

    public WebElement getCloseButtonForAdd() {
        return closeButtonForAdd;
    }

    public WebElement getNameOfNewsCategory() {
        return nameOfNewsCategory;
    }

    public WebElement getSearchField() {
        return searchField;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getCoronavirusMenu() {
        return coronavirusMenu;
    }

    public void closeAdd() {
        closeButtonForAdd.click();
    }

    public List<String> getListOfSubtitleAsStringValues() {
        return listOfSubtitle
                .stream()
                .filter(WebElement::isDisplayed)
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }

    public void enterKeyWordInSearchField(String searchKeyword) {
        getSearchField().sendKeys(searchKeyword);
    }

    public void clickOnSearchButton() {
        searchButton.click();
    }

    public void clickOnCoronavirusMenu() {
        coronavirusMenu.click();
    }

    public String getTextFromTitleOfHeadlineArticle() {
        return titleOfHeadlineArticle.getText();
    }

    public WebElement getSubTitleByIndex(int index) {
        return listOfSubtitle.get(index);
    }

    public String getNameOfNewsCategoryText() {
        return nameOfNewsCategory.getText();
    }
}
