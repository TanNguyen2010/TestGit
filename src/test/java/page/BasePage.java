package page;

import core.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends DriverFactory {
    public BasePage(WebDriver driver){
        System.out.println("BasePage initDriver");
        driver = initDriver();
        System.out.println("BasePage initElements");
        PageFactory.initElements(driver, this);
    }
}
