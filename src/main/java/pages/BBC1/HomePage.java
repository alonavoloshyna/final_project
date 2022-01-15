package pages.BBC1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class HomePage extends BasePage {

    @FindBy(xpath = "//div[@id='orb-nav-links']//a[contains(@href,'news')]")
    private WebElement newsMenu;

    @FindBy(xpath = "//div[@id='orb-nav-links']//a[contains(@href,'sport')]")
    private WebElement sportMenu;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getNewsMenu() {
        return newsMenu;
    }

    public WebElement getSportMenu() {
        return sportMenu;
    }

    public void openHomePage(String url) {
        driver.get(url);
    }

    public void clickOnNewsMenu() {
        newsMenu.click();
    }

    public void clickOnSportMenu(){
        sportMenu.click();
    }
}
