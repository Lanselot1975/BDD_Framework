package pages.action;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.locators.PhpTravelsPersonalDataLocator;
import pages.locators.PhptravelsLoginPageLocator;
import utils.SeleniumDriver;

public class PhpTravelsPersonalDataAction {
    private PhpTravelsPersonalDataLocator phpTravelsPersonalDataLocator;

    public PhpTravelsPersonalDataAction(){
        this.phpTravelsPersonalDataLocator = new PhpTravelsPersonalDataLocator();
        PageFactory.initElements(SeleniumDriver.getDriver(), phpTravelsPersonalDataLocator);
    }

    public void selectTitle(String title){
        Select titl = new Select(phpTravelsPersonalDataLocator.per_title);
        titl.selectByVisibleText(title);
    }

    public void enterFname(String fname){
        phpTravelsPersonalDataLocator.per_fname.sendKeys(fname);
    }

    public void enterLname(String lname){
        phpTravelsPersonalDataLocator.per_lname.sendKeys(lname);
    }

    public void enterEmail(String email){
        phpTravelsPersonalDataLocator.per_email.sendKeys(email);
    }

    public void selectCountry(String country){
        phpTravelsPersonalDataLocator.sel_country.click();
       phpTravelsPersonalDataLocator.per_country.sendKeys(country);
       phpTravelsPersonalDataLocator.per_country.sendKeys(Keys.ENTER);
    }

    public void enterPhone(String phone){
        phpTravelsPersonalDataLocator.per_phone.sendKeys(phone);
    }

    public void enterNameCard(String nameOnCard){
        phpTravelsPersonalDataLocator.per_name_oncard.sendKeys(nameOnCard);
    }


    public void enterCardNumber(String cardNum){
        phpTravelsPersonalDataLocator.per_car_number.sendKeys(cardNum);
    }

    public void selectExpirationMonth(String expMonth){
         phpTravelsPersonalDataLocator.per_exp_month.submit();
        Select month = new Select(phpTravelsPersonalDataLocator.per_exp_month);
        month.selectByVisibleText(expMonth);
    }

    public void selectExpirationYear(String expYear){
        Select year = new Select(phpTravelsPersonalDataLocator.per_exp_year);
        year.selectByVisibleText(expYear);
    }

    public void enterSecurity(String csv){
        phpTravelsPersonalDataLocator.per_security_code.sendKeys(csv);
    }

    public void btn_completeBooking() throws InterruptedException {
        if(!phpTravelsPersonalDataLocator.per_complete_booking.isDisplayed())
        {
            Thread.sleep(2000);
            phpTravelsPersonalDataLocator.per_complete_booking.click();
        }else
            phpTravelsPersonalDataLocator.per_complete_booking.click();

    }


}
