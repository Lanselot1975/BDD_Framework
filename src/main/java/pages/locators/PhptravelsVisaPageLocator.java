package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PhptravelsVisaPageLocator {
    @FindBy(how= How.XPATH, using="//a[contains(@class,'text-center visa')]")
    public WebElement visa_page;

    @FindBy(how= How.XPATH, using="//span[contains(text(),'India')]")
    public WebElement select_country_from;

    @FindBy(how= How.CSS, using=".chosen-with-drop .chosen-search-input")
    public WebElement insert_country_from;

    @FindBy(how= How.XPATH, using=" //span[contains(text(),'Australia')]")
    public WebElement select_country_to;

    @FindBy(how= How.CSS, using=".chosen-with-drop .chosen-search-input")
    public WebElement insert_country_to;

    @FindBy(how= How.XPATH, using="//input[@placeholder='Date']")
    public WebElement date;

    @FindBy(how= How.XPATH, using="//button[contains(text(),'Submit')]")
    public WebElement submit;

    @FindBy(how= How.LINK_TEXT, using="Visa Booking")
    public WebElement verify_visa_page;

    @FindBy(how= How.XPATH, using="//input[@placeholder='First Name']")
    public WebElement fname;

    @FindBy(how= How.XPATH, using="//input[@placeholder='Last Name']")
    public WebElement lname;

    @FindBy(how= How.XPATH, using="//input[@placeholder='Email']")
    public WebElement email;

    @FindBy(how= How.XPATH, using="//input[@placeholder='Confirm Email']")
    public WebElement confirm_email;

    @FindBy(how= How.XPATH, using="//input[@placeholder='Contact Number']")
    public WebElement mobile_number;

    @FindBy(how= How.XPATH, using="//input[@placeholder='Date']")
    public WebElement verify_date;

    @FindBy(how= How.ID, using="sub")
    public WebElement btn_booking;

    @FindBy(how= How.XPATH, using="//strong[contains(text(),'Visa Submitted')]")
    public WebElement visa_submited;

}
