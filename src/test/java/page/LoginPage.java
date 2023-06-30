package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class LoginPage extends BasePage{
    @FindBy(id = "Email")
    private WebElement usernameElem;
    @FindBy(id = "Password")
    private WebElement passwordElem;
    @FindBy(xpath = "//*[@class='button-1 login-button']")
    private WebElement clickBtnElem;
    @FindBy(xpath = "//*[@class='header-links']/descendant::*[@class='account']")
    private WebElement accountEmailElem;
    public LoginPage(WebDriver driver) {
        super(driver);
        System.out.println("LoginPage: constructor");
    }
    public void i_open_web_page() {
        System.out.println("LoginPage: i_open_web_page");
        driver.get("https://demowebshop.tricentis.com/login");
    }
    public void i_input_username_page(String email){
        System.out.println("LoginPage: i_input_username_page");
        usernameElem.sendKeys(email);
    }
    public void i_input_password_page(String password){
        System.out.println("LoginPage: i_input_password_page");
        passwordElem.sendKeys(password);
    }
    public void i_click_login_btn_page(){
        System.out.println("LoginPage: i_click_login_btn_page");
        clickBtnElem.click();
    }
    public void i_login_success_page(String email){
        System.out.println("LoginPage: i_login_success_page");
        Assert.assertEquals(email,accountEmailElem.getText());
    }
}
