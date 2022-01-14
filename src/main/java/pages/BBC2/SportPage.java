package pages.BBC2;

import pages.BBC1.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SportPage extends BasePage {

    @FindBy(xpath = "//div[contains(@class,'sport-navigation')]//a[@href='/sport/football']")
    private WebElement footballMenu;

    public SportPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getFootballMenu() {
        return footballMenu;
    }

    public void clickOnFootballMenu(){
        footballMenu.click();
    }
}
