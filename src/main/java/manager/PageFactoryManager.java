package manager;

import org.openqa.selenium.WebDriver;
import pages.BBC1.CoronavirusPage;
import pages.BBC1.HomePage;
import pages.BBC1.NewsPage;
import pages.BBC1.SearchResultsPage;
import pages.BBC2.FootballPage;
import pages.BBC2.MatchPage;
import pages.BBC2.SportPage;

public class PageFactoryManager {

    private final WebDriver driver;

    public PageFactoryManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {
        return new HomePage(driver);
    }

    public CoronavirusPage getCoronavirusPage() {
        return new CoronavirusPage(driver);
    }

    public NewsPage getNewsPage() {
        return new NewsPage(driver);
    }

    public SearchResultsPage getSearchResultsPage() {
        return new SearchResultsPage(driver);
    }

    public FootballPage getFootballPage() {
        return new FootballPage(driver);
    }

    public SportPage getSportPage() {
        return new SportPage(driver);
    }

    public MatchPage getMatchPage() { return new MatchPage(driver); }
}
