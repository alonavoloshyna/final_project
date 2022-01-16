package pages.fragments.BBC1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.fragments.BaseFragment;

import java.util.Map;

public class Form extends BaseFragment {

    @FindBy(xpath = ".//input[@placeholder='Name']")
    private WebElement textInputFieldForName;

    @FindBy(xpath = ".//input[@placeholder='Email address']")
    private WebElement textInputFieldForEmail;

    @FindBy(xpath = ".//textarea[contains(@id,'hearken-embed-module')]")
    private WebElement textAreaForQuestion;

    @FindBy(xpath = ".//input[@type='checkbox']")
    private WebElement checkboxForAcceptingTermOfService;

    @FindBy(xpath = ".//button")
    private WebElement submitButton;

    public Form(WebElement container) {
        super(container);
    }

    public void fillForm(Map<String, String> data) {
        String question = data.get("question");
        String name = data.get("name");
        String email = data.get("email");
        String termsOfService = data.get("termsOfService");

        if (question != null) {
            textAreaForQuestion.sendKeys(question);
        }
        if (name != null) {
            textInputFieldForName.sendKeys(name);
        }
        if (email != null) {
            textInputFieldForEmail.sendKeys(email);
        }
        if (termsOfService != null && termsOfService.equals("checked")) {
            checkboxForAcceptingTermOfService.click();
        }

        submitButton.click();
    }
}
