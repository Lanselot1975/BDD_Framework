package pages.action;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.locators.PhptravelsVisaPageLocator;
import utils.SeleniumDriver;

public class PhptravelsVisaPageAction {
    private PhptravelsVisaPageLocator phptravelsVisaPageLocator;
    private SoftAssert softAssertion = new SoftAssert();
    public PhptravelsVisaPageAction(){
        this.phptravelsVisaPageLocator = new PhptravelsVisaPageLocator();
        PageFactory.initElements(SeleniumDriver.getDriver(), phptravelsVisaPageLocator);
    }

    public void selectVisa(){
        phptravelsVisaPageLocator.visa_page.click();
    }

    public void selectCountryFrom(String country_from){
        phptravelsVisaPageLocator.select_country_from.click();
        phptravelsVisaPageLocator.insert_country_from.sendKeys(country_from);
        phptravelsVisaPageLocator.insert_country_from.sendKeys(Keys.ENTER);
    }

    public void selectCountryTo(String country_to){
        phptravelsVisaPageLocator.select_country_to.click();
        phptravelsVisaPageLocator.insert_country_to.sendKeys(country_to);
        phptravelsVisaPageLocator.insert_country_to.sendKeys(Keys.ENTER);
    }

    public void selectDate(String date){
        phptravelsVisaPageLocator.date.sendKeys(date);
    }

    public void submit_visa(){
        phptravelsVisaPageLocator.submit.click();
    }

    public void verify_visa_page(){
        softAssertion.assertEquals(phptravelsVisaPageLocator.verify_visa_page.getText(), "Visa Booking");
    }

    public void enter_fname(String fname){
        phptravelsVisaPageLocator.fname.sendKeys(fname);
    }

    public void enter_lname(String lname){
        phptravelsVisaPageLocator.lname.sendKeys(lname);
    }

    public void enter_email(String email){
        phptravelsVisaPageLocator.email.sendKeys(email);
    }
    public void enter_conf_email(String email){
        phptravelsVisaPageLocator.confirm_email.sendKeys(email);
    }

    public void ente_mobile(String mobile){
        phptravelsVisaPageLocator.mobile_number.sendKeys(mobile);
    }

    public void verify_date(String date){
        softAssertion.assertEquals(phptravelsVisaPageLocator.verify_date.getAttribute("value"), date);
    }

    public void booking_visa(){
        phptravelsVisaPageLocator.btn_booking.click();
    }

    public void verify_visa_submited(){
        softAssertion.assertEquals(phptravelsVisaPageLocator.visa_submited.getText(), "Visa Submitted");
    }
}
