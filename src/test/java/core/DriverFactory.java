package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
    public WebDriver driver;
    public WebDriver initDriver(){
        System.out.println("DriverFactory");
        driver = new ChromeDriver();
        return driver;
    }

}
