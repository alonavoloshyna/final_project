package pages.fragments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class BaseFragment {
    public BaseFragment(WebElement container) {
        PageFactory.initElements(new DefaultElementLocatorFactory(container), this);
    }
}
