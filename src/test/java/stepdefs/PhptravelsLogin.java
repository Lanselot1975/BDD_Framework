package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pages.action.PhptravelsLoginPageAction;
import utils.SeleniumDriver;

public class PhptravelsLogin {
    private PhptravelsLoginPageAction phptravelsLoginPageAction = new PhptravelsLoginPageAction();

    @Given("^I am open \"([^\"]*)\" website in a web Browser$")
    public void i_am_open_website_in_a_web_Browser(String url) {
        SeleniumDriver.openPage(url);
     }

    @When("^I Navigate to 'My Account' and choose login$")
    public void i_Navigate_to_My_Account_and_choose_login() {
        phptravelsLoginPageAction.login_page();
        phptravelsLoginPageAction.a_login_page();
        Assert.assertTrue(phptravelsLoginPageAction.is_login_page());
    }

    @When("^I insert username \"([^\"]*)\"$")
    public void i_insert_username(String email) {
        phptravelsLoginPageAction.enter_email(email);

    }

    @When("^I insert password \"([^\"]*)\"$")
    public void i_insert_pasword(String passwd) {
        phptravelsLoginPageAction.enter_passwd(passwd);

    }

    @When("^I press login button$")
    public void i_press_login_button() {
        phptravelsLoginPageAction.push_btn();
    }


    @Given("^I verify I am on account page$")
    public void  i_verify_I_am_on_account_page()  {
        Assert.assertEquals(phptravelsLoginPageAction.username_greeting(), "Hi, Demo User");
    }

    @When("^I navigate to my profile$")
    public void i_navigate_to_my_profile()  {
        phptravelsLoginPageAction.my_profile_link();
        Assert.assertTrue(phptravelsLoginPageAction.my_profile_verification());
    }

    @Then("^I verify account data \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
    public void i_verify_account_data(String fname, String lname, String phone, String email, String address) {
        Assert.assertEquals(phptravelsLoginPageAction.get_fname(), fname);
        Assert.assertEquals(phptravelsLoginPageAction.get_lname(), lname);
        Assert.assertEquals(phptravelsLoginPageAction.get_phone(), phone);
        Assert.assertEquals(phptravelsLoginPageAction.get_email(), email);
        Assert.assertEquals(phptravelsLoginPageAction.get_address(), address);
    }

    @And("^I press Submit and logout$")
    public void i_press_Submit_and_logout(){
        phptravelsLoginPageAction.login_page();
        phptravelsLoginPageAction.a_logout();
    }

}
