package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.asserts.SoftAssert;
import pages.action.PhpTravelsPersonalDataAction;
import pages.action.PhptravelsBookingPageAction;

public class PhptravelsBookingHotel {
    private PhptravelsBookingPageAction phptravelsBookingPageAction = new PhptravelsBookingPageAction();
    private PhpTravelsPersonalDataAction phpTravelsPersonalDataAction = new PhpTravelsPersonalDataAction();
    SoftAssert softAssertion = new SoftAssert();
    @Given("^Navigate to book hotel page$")
    public void navigate_to_book_hotel_page() throws InterruptedException {
        Thread.sleep(2000);
        phptravelsBookingPageAction.select_hotels();
        phptravelsBookingPageAction.btn_dis_disable();
        phptravelsBookingPageAction.btn_dis_popup();
    }

    @When("^I select booking \"([^\"]*)\"$")
    public void i_select_booking_destination(String dest)  {
        phptravelsBookingPageAction.add_destination(dest);

    }

    @When("^I select \"([^\"]*)\" date$")
    public void i_select_date(String check_in)  {
        phptravelsBookingPageAction.add_checkin(check_in);
    }

    @When("^I select checkout \"([^\"]*)\" date$")
    public void i_select_date_checkout(String check_out)  {
        phptravelsBookingPageAction.add_checkout(check_out);
    }

    @When("^I select adults \"([^\"]*)\" amount$")
    public void i_select_amount(int adults) {
        phptravelsBookingPageAction.add_adults(adults);
    }

    @When("^I press search button$")
    public void i_press_search_button() {
        phptravelsBookingPageAction.btn_search();
    }

    @Then("^I verify I navigate to the right page \"([^\"]*)\"$")
    public void i_verify_I_navigate_to_the_right_page(String page)  {
        phptravelsBookingPageAction.verify_hotel(page);
    }

    @Then("^I select hotel$")
    public void i_select_hotel() throws InterruptedException {
        phptravelsBookingPageAction.btn_select_hotel();
    }

    @Then("^I verify I am selected right hotel \"([^\"]*)\"$")
    public void i_verify_I_am_selected_right_hotel(String name) {
        phptravelsBookingPageAction.verify_selected_hotel(name);
    }

    @Then("^I book the room$")
    public void i_book_the_room() throws InterruptedException {
        phptravelsBookingPageAction.btn_book_room();
    }

    @Then("^I verify I am booking right hotel \"([^\"]*)\"$")
    public void i_verify_I_am_booking_right_hotel(String arg1) {

    }
    @Then("^I select my title \"([^\"]*)\"$")
    public void i_select_my_title(String title) {
        phpTravelsPersonalDataAction.selectTitle(title);
    }

    @Then("^I enter my name \"([^\"]*)\"$")
    public void i_enter_my_name(String fname) {
        phpTravelsPersonalDataAction.enterFname(fname);
    }

    @Then("^I enter my last name \"([^\"]*)\"$")
    public void i_enter_my_last_name(String lname)  {
        phpTravelsPersonalDataAction.enterLname(lname);
    }

    @Then("^I enter my email \"([^\"]*)\"$")
    public void i_enter_my_email(String email){
        phpTravelsPersonalDataAction.enterEmail(email);
    }

    @Then("^I select my country \"([^\"]*)\"$")
    public void i_select_my_country(String country) {
        phpTravelsPersonalDataAction.selectCountry(country);
    }

    @Then("^I enter my phone \"([^\"]*)\"$")
    public void i_enter_my_phone(String phone)  {
        phpTravelsPersonalDataAction.enterPhone(phone);
    }

    @Then("^I enter my card name \"([^\"]*)\"$")
    public void i_enter_my_card_name(String card_name)  {
        phpTravelsPersonalDataAction.enterNameCard(card_name);
    }

    @Then("^I enter my card number \"([^\"]*)\"$")
    public void i_enter_my_card_number(String card_number) {
        phpTravelsPersonalDataAction.enterCardNumber(card_number);
    }

    @Then("^I enter my expire month \"([^\"]*)\"$")
    public void i_enter_my_expire_month(String exp_month) {
        phpTravelsPersonalDataAction.selectExpirationMonth(exp_month);
    }

    @Then("^I enter my expire year \"([^\"]*)\"$")
    public void i_enter_my_expire_year(String exp_year) {
        phpTravelsPersonalDataAction.selectExpirationYear(exp_year);
    }

    @Then("^I enter my secret number \"([^\"]*)\"$")
    public void i_enter_my_secret_number(String secret_num) {
        phpTravelsPersonalDataAction.enterSecurity(secret_num);
    }

    @Then("^I press complete booking button$")
    public void i_press_complete_booking_button() throws InterruptedException {
        phpTravelsPersonalDataAction.btn_completeBooking();
    }
}
