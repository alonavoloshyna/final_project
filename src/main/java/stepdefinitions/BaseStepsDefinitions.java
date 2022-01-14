package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import manager.PageFactoryManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BBC1.HomePage;
import utils.TestContext;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseStepsDefinitions {

    TestContext testContext;
    WebDriver driver;

    public BaseStepsDefinitions(TestContext testContext) {
        this.testContext = testContext;
    }

    @Before
    public void testsSetUp() {
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        testContext.setDriver(driver);
        testContext.setPageFactoryManager(new PageFactoryManager(driver));
    }

    @After
    public void tearDown() {
        driver.close();
    }
}
