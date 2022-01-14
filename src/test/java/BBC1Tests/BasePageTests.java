//package BBC1Tests;
//
//import pages.BBC1.CoronavirusPage;
//import pages.BBC1.HomePage;
//import pages.BBC1.NewsPage;
//import pages.BBC1.SearchResultsPage;
//import pages.BBC2.FootballPage;
//import pages.BBC2.SportPage;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
//
//import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;
//
//public class BasePageTests {
//    private static final String BBC_URL = "https://www.bbc.com/";
//    private WebDriver driver;
//
//    @BeforeTest
//    public void profileSetUp() {
//        chromedriver().setup();
//    }
//
//    @BeforeMethod
//    public void testsSetUp() {
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get(BBC_URL);
//    }
//
//    @AfterMethod
//    public void tearDown() {
//        driver.close();
//    }
//
//    public WebDriver getDriver() {
//        return driver;
//    }
//
//    public HomePage getHomePage(){
//        return new HomePage(getDriver());
//    }
//
//    public NewsPage getNewsPage(){
//        return new NewsPage(getDriver());
//    }
//
//    public SearchResultsPage getSearchResultsPage(){
//        return new SearchResultsPage(getDriver());
//    }
//
//    public CoronavirusPage getCoronavirusPage(){
//        return new CoronavirusPage(getDriver());
//    }
//
//    public FootballPage getFootballPage(){
//        return new FootballPage(getDriver());
//    }
//
//    public SportPage getSportPage(){
//        return new SportPage(getDriver());
//    }
//}
