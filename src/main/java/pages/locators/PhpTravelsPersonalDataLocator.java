package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PhpTravelsPersonalDataLocator {
    @FindBy(how= How.ID, using="title")
    public WebElement per_title;

    @FindBy(how= How.ID, using="first_name")
    public WebElement per_fname;

    @FindBy(how= How.ID, using="last_name")
    public WebElement per_lname;

    @FindBy(how= How.ID, using="email")
    public WebElement per_email;

    @FindBy(how= How.XPATH, using="//input[@class='chosen-search-input']")
    public WebElement per_country;

    @FindBy(how= How.XPATH, using="//span[contains(text(),'Select Country')]")
    public WebElement sel_country;

    @FindBy(how= How.ID, using="phone_number")
    public WebElement per_phone;

    @FindBy(how= How.ID, using="cardHolderName")
    public WebElement per_name_oncard;

    @FindBy(how= How.ID, using="cardNumber")
    public WebElement per_car_number;

    @FindBy(how= How.ID, using="month")
    public WebElement per_exp_month;

    @FindBy(how= How.NAME, using="year")
    public WebElement per_exp_year;

    @FindBy(how= How.ID, using="cardCVC")
    public WebElement per_security_code;

    @FindBy(how= How.ID, using="completeBooking")
    public WebElement per_complete_booking;
}
