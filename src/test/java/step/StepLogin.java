package step;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepLogin extends BaseStep{

    @Given("I am on the website")
    public void i_am_on_the_website(){
    System.out.println("StepLogin: i_am_on_the_website");
    loginPage.i_open_web_page();
    }

    @When("I input {string} to username")
    public void i_input_username(String email){
    System.out.println("StepLogin: i_input_username");
    loginPage.i_input_username_page(email);
    }

    @And("I input {string} to password")
    public void i_input_password(String password){
    System.out.println("StepLogin: i_input_password");
    loginPage.i_input_password_page(password);
    }

    @And("I click login button$")
    public void i_click_login_btn(){
        System.out.println("StepLogin: i_click_login_btn");
        loginPage.i_click_login_btn_page();
    }

    @Then("I should see {string} if login success")
    public void i_login_success(String email){
        System.out.println("StepLogin: i_login_success");
    loginPage.i_login_success_page(email);
    }

}
