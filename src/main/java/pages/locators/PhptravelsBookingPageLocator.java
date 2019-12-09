package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.w3c.dom.html.HTMLInputElement;

public class PhptravelsBookingPageLocator {
    @FindBy(how= How.XPATH, using="//a[@class='text-center hotels active']")
    public WebElement select_hotels;

    @FindBy(how= How.XPATH, using="//span[contains(text(),'Search by Hotel or City Name')]")
    public WebElement select_destination;

    @FindBy(how= How.CSS, using=".select2-focused")
    public WebElement add_destination;

    @FindBy(how= How.XPATH, using="//*[contains(text(),'Toronto')]")
    public WebElement select_destination1;

    @FindBy(how= How.XPATH, using="//input[@id='checkin']")
    public WebElement check_in_d;

    @FindBy(how= How.XPATH, using="//input[@id='checkout']")
    public WebElement check_out_d;

    @FindBy(how= How.XPATH, using="//div[contains(@class,'col o2')]//button[contains(@class,'btn btn-white bootstrap-touchspin-up')][contains(text(),'+')]")
    public WebElement adult_increase;

    @FindBy(how= How.XPATH, using="//div[contains(@class,'col o2')]//button[contains(@class,'btn btn-white bootstrap-touchspin-down')][contains(text(),'-')]")
    public WebElement adult_decrease;

    @FindBy(how= How.XPATH, using="//div[contains(@class,'col 01')]//button[contains(@class,'btn btn-white bootstrap-touchspin-up')][contains(text(),'+')]")
    public WebElement child_increase;

    @FindBy(how= How.XPATH, using="//div[contains(@class,'col 01')]//button[contains(@class,'btn btn-white bootstrap-touchspin-down')][contains(text(),'-')]")
    public WebElement child_decrease;

    @FindBy(how= How.XPATH, using="//div[@class='col-md-2 col-xs-12 o1']//button[@class='btn btn-primary btn-block'][contains(text(),'Search')]")
    public WebElement btn_search;

    @FindBy(how= How.XPATH, using="//li[1]//div[1]//div[1]//div[2]//div[1]//div[3]//div[1]//div[2]//form[1]//button[1]")
    public WebElement btn_select_hotel;

    @FindBy(how= How.XPATH, using="//span[@class='text-primary']")
    public WebElement lbl_verify_hotel;

    @FindBy(how= How.XPATH, using="//div[@class='room-item-wrapper']//div[2]//div[1]//div[2]//div[1]//div[2]//form[1]//button[1]")
    public WebElement btn_book_room;

    @FindBy(how= How.XPATH, using="//div[@class='o2 rtl-ml-auto']//h2[@id='detail-content-sticky-nav-00']")
    public WebElement verify_selected_hotel_active;
    @FindBy(how= How.XPATH, using="//button[@class='cc-btn cc-dismiss']")
    public WebElement disable_popup;

    @FindBy(how= How.ID, using="usertrack-consent__button")
    public WebElement disable_accept;


}
