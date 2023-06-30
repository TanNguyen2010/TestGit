package step;

import core.DriverFactory;
import page.LoginPage;

public class BaseStep extends DriverFactory {
    LoginPage loginPage = new LoginPage(driver);
}
