package pages.action;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.locators.PhptravelsBookingPageLocator;
import pages.locators.PhptravelsLoginPageLocator;
import utils.SeleniumDriver;

public class PhptravelsBookingPageAction {
    private PhptravelsBookingPageLocator phptravelsBookingPageLocator;
    private SoftAssert softAssertion = new SoftAssert();
    public PhptravelsBookingPageAction(){
        this.phptravelsBookingPageLocator = new PhptravelsBookingPageLocator();
        PageFactory.initElements(SeleniumDriver.getDriver(), phptravelsBookingPageLocator);
    }

    public void select_hotels(){
        phptravelsBookingPageLocator.select_hotels.click();
    }
    public void add_destination(String dest){

        phptravelsBookingPageLocator.select_destination.click();
        phptravelsBookingPageLocator.add_destination.sendKeys(dest);
        phptravelsBookingPageLocator.select_destination1.click();
    }

    public void add_checkin(String check_in){
        phptravelsBookingPageLocator.check_in_d.sendKeys(check_in);
        phptravelsBookingPageLocator.check_in_d.sendKeys(Keys.ENTER);
    }

    public void add_checkout(String check_out){
        phptravelsBookingPageLocator.check_out_d.sendKeys(check_out);
//        phptravelsBookingPageLocator.check_out_d.sendKeys(Keys.ENTER);
    }

    public void add_adults(int adult){
        while(adult > 0){
            phptravelsBookingPageLocator.adult_increase.click();
            adult -- ;
        }
    }


    public void btn_search(){
        phptravelsBookingPageLocator.btn_search.click();
    }

    public void verify_hotel(String ver_hotel){
        softAssertion.assertEquals(phptravelsBookingPageLocator.lbl_verify_hotel.getText(), ver_hotel);
    }

    public void btn_select_hotel() throws InterruptedException {
        Thread.sleep(3000);
        phptravelsBookingPageLocator.btn_select_hotel.click();
    }

    public boolean verify_selected_hotel(String hotel_name){
        return phptravelsBookingPageLocator.verify_selected_hotel_active.getText().equals(hotel_name);
    }

    public void btn_dis_disable() {
        phptravelsBookingPageLocator.disable_accept.click();
    }
    public void btn_book_room() {
//        Thread.sleep(5000);
        phptravelsBookingPageLocator.btn_book_room.submit();
    }
    public void btn_dis_popup() {
        phptravelsBookingPageLocator.disable_popup.click();
    }
}
