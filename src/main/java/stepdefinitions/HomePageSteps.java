package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BBC1.HomePage;
import utils.TestContext;

public class HomePageSteps {

    private final static String HOME_PAGE_URL = "https://www.bbc.com/";

    HomePage homePage;

    public HomePageSteps(TestContext testContext) {
        homePage = testContext.getPageFactoryManager().getHomePage();
    }

    @And("User opens home page")
    public void openPage() {
        homePage.openHomePage(HOME_PAGE_URL);
    }

    @When("User clicks on News section")
    public void userClicksOnNewsSection() {
        homePage.waitVisibilityOfElement(homePage.getNewsMenu());
        homePage.clickOnNewsMenu();
    }


    @And("User clicks on Sport section")
    public void userClicksOnSportSection() {
        homePage.waitVisibilityOfElement(homePage.getSportMenu());
        homePage.clickOnSportMenu();
    }


}
