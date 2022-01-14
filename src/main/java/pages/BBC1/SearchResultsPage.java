package pages.BBC1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends BasePage {

    @FindBy(xpath = "//ul[@role='list']//a[contains(@class,'PromoLink')]")
    private List<WebElement> listOfSearchResults;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public String getArticleTitleOfResultInSearchByIndex(int index) {
        return listOfSearchResults.get(index).getText();
    }
}
