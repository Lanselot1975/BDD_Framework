package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PhptravelsLoginPageLocator {
    @FindBy(how= How.XPATH, using="//div[@class='dropdown dropdown-login dropdown-tab']//a[@id='dropdownCurrency']")
    public WebElement myAccount_ddList;

    @FindBy(how= How.LINK_TEXT, using="Login")
    public WebElement a_login_link;

    @FindBy(how= How.LINK_TEXT, using="Logout")
    public WebElement a_logout_link;

    @FindBy(how= How.XPATH, using="//a[@class='collapse-link']")
    public WebElement a_login_tab;

    @FindBy(how= How.XPATH, using="//input[@placeholder='Email']")
    public WebElement txt_email;

    @FindBy(how= How.XPATH, using="//input[@placeholder='Password']")
    public WebElement txt_passwd;

    @FindBy(how= How.XPATH, using="//button[@class='btn btn-primary btn-lg btn-block loginbtn']")
    public WebElement btn_login;

    @FindBy(how= How.XPATH, using="//h3[@class='text-align-left']")
    public WebElement txt_username_greeting;

    @FindBy(how= How.XPATH, using="//a[contains(text(),'My Profile')]")
    public WebElement a_myProfile;

    @FindBy(how= How.XPATH, using="//h3[contains(text(),'My Profile')]")
    public WebElement lbl_my_profile;

    @FindBy(how= How.XPATH, using="//input[@placeholder='First Name']")
    public WebElement txt_fname;

    @FindBy(how= How.XPATH, using="//input[@placeholder='Last Name']")
    public WebElement txt_lname;

    @FindBy(how= How.XPATH, using="//input[@placeholder='Phone']")
    public WebElement txt_phone;

    @FindBy(how= How.XPATH, using="//input[@placeholder='Email']")
    public WebElement txt_email_user;

    @FindBy(how= How.XPATH, using="//input[@placeholder='Address']")
    public WebElement txt_address;



}
