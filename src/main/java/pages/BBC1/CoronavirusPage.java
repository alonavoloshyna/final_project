package pages.BBC1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.fragments.BBC1.Form;

public class CoronavirusPage extends BasePage {

    @FindBy(xpath = "//nav[@class='nw-c-nav__wide-secondary']//a[@class='nw-o-link']")
    private WebElement coronavirusStoriesMenu;

    @FindBy(xpath = "//div[contains(@aria-labelledby,'Getintouch')]//h3[contains(text(),'Your questions')]/ancestor::a")
    private WebElement sendQuestionsMenu;

    @FindBy(xpath = "//div[contains(@class,'long-text-input')]//div[@class='input-error-message']")
    private WebElement errorMessageForQuestionField;

    @FindBy(xpath = "//div[contains(@class,'input-error') and contains(text(),'Email')]")
    private WebElement errorMessageForEmailField;

    @FindBy(xpath = "//div[contains(@class,'input-error') and contains(text(),'Name')]")
    private WebElement errorMessageForNameField;

    @FindBy(xpath = "//div[@class='checkbox']//div[@class='input-error-message']")
    private WebElement errorMessageForCheckBox;

    @FindBy(xpath = "//div[@class='embed-content-container']")
    private WebElement questionForm;

    @FindBy(xpath = "//button[@class='tp-close tp-active']")
    private WebElement closeButtonForAdd;

    public CoronavirusPage(WebDriver driver) {
        super(driver);
    }

    public Form getQuestionFormFragment() {
        return new Form(questionForm);
    }

    public WebElement getErrorMessageForCheckbox() {
        return errorMessageForCheckBox;
    }

    public WebElement getErrorMessageForNameField() {
        return errorMessageForNameField;
    }

    public WebElement getErrorMessageForEmailField() {
        return errorMessageForEmailField;
    }

    public WebElement getErrorMessageForQuestionField() {
        return errorMessageForQuestionField;
    }

    public WebElement getCoronavirusStoriesMenu() {
        return coronavirusStoriesMenu;
    }

    public WebElement getCloseButtonForAdd() {
        return closeButtonForAdd;
    }

    public void clickOnCoronavirusStoriesMenu() {
        coronavirusStoriesMenu.click();
    }

    public void clickOnSendQuestionMenu() {
        sendQuestionsMenu.click();
    }

    public void closeAdd() {
        closeButtonForAdd.click();
    }

    public boolean isErrorMessageForQuestionFieldDisplayed() {
        return errorMessageForQuestionField.isDisplayed();
    }

    public boolean isErrorMessageForNameFieldDisplayed() {
        return errorMessageForNameField.isDisplayed();
    }

    public boolean isErrorMessageForEmailFieldDisplayed() {
        return errorMessageForEmailField.isDisplayed();
    }

    public boolean isErrorMessageForCheckboxDisplayed() {
        return errorMessageForCheckBox.isDisplayed();
    }
}
