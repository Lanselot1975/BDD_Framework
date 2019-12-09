package pages.action;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.locators.PhptravelsLoginPageLocator;
import utils.SeleniumDriver;

public class PhptravelsLoginPageAction {

    private PhptravelsLoginPageLocator phptravelsLoginPageLocator;

    public PhptravelsLoginPageAction(){
        this.phptravelsLoginPageLocator = new PhptravelsLoginPageLocator();
        PageFactory.initElements(SeleniumDriver.getDriver(), phptravelsLoginPageLocator);
    }

    public void login_page(){
        phptravelsLoginPageLocator.myAccount_ddList.click();
    }
    public void a_login_page(){
        phptravelsLoginPageLocator.a_login_link.click();
    }
    public void a_logout(){
        phptravelsLoginPageLocator.a_logout_link.click();
    }

    public boolean is_login_page(){
        return phptravelsLoginPageLocator.a_login_tab.isDisplayed();
    }
    public void enter_email(String email){
        phptravelsLoginPageLocator.txt_email.sendKeys(email);
    }

    public void enter_passwd(String passwd){
        phptravelsLoginPageLocator.txt_passwd.sendKeys(passwd);
    }

    public void push_btn(){
        phptravelsLoginPageLocator.btn_login.click();
    }

    public void my_profile_link(){
        phptravelsLoginPageLocator.a_myProfile.click();
    }

    public String username_greeting(){
        return phptravelsLoginPageLocator.txt_username_greeting.getText();
    }

    public boolean my_profile_verification(){
        return phptravelsLoginPageLocator.lbl_my_profile.isDisplayed();
    }

    public String get_fname(){
        return phptravelsLoginPageLocator.txt_fname.getAttribute("value");
    }

    public String get_lname(){
        return phptravelsLoginPageLocator.txt_lname.getAttribute("value");
    }

    public String get_phone(){
        return phptravelsLoginPageLocator.txt_phone.getAttribute("value");
    }

    public String get_email(){
        return phptravelsLoginPageLocator.txt_email_user.getAttribute("value");
    }

    public String get_address(){
        return phptravelsLoginPageLocator.txt_address.getAttribute("value");
    }
}
