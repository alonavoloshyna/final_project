package stepdefinitions.BBC2;

import io.cucumber.java.en.And;
import pages.BBC2.SportPage;
import utils.TestContext;

public class SportPageSteps {

    SportPage sportPage;

    public SportPageSteps(TestContext testContext) {
        sportPage = testContext.getPageFactoryManager().getSportPage();
    }

    @And("User clicks on Football menu")
    public void userClicksOnFootballMenu() {
        sportPage.waitVisibilityOfElement(sportPage.getFootballMenu());
        sportPage.clickOnFootballMenu();
    }
}
