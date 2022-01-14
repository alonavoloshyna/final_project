package utils;

import manager.PageFactoryManager;
import org.openqa.selenium.WebDriver;

public class TestContext {
    private PageFactoryManager pageFactoryManager;
    private WebDriver driver;

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public void setPageFactoryManager(PageFactoryManager pageFactoryManager) {
        this.pageFactoryManager = pageFactoryManager;
    }

    public PageFactoryManager getPageFactoryManager() {
        return pageFactoryManager;
    }

    public WebDriver getDriver() {
        return driver;
    }
}
