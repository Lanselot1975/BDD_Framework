package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.action.PhptravelsLoginPageAction;
import pages.action.PhptravelsVisaPageAction;

public class PhptravelsVisa {

    private PhptravelsVisaPageAction phptravelsVisaPageAction = new PhptravelsVisaPageAction();
    @Given("^Navigate to book visa page$")
    public void navigate_to_book_visa_page() {
        phptravelsVisaPageAction.selectVisa();
    }

    @When("^I select from country \"([^\"]*)\"$")
    public void i_select_from_country(String country)  {
        phptravelsVisaPageAction.selectCountryFrom(country);
    }

    @When("^I select to country \"([^\"]*)\"$")
    public void i_select_to_country(String country) {
        phptravelsVisaPageAction.selectCountryTo(country);
    }

    @When("^I select date \"([^\"]*)\"$")
    public void i_select_date(String date) {
        phptravelsVisaPageAction.selectDate(date);
    }

    @When("^I press submit button$")
    public void i_press_submit_button() {
        phptravelsVisaPageAction.submit_visa();
    }

    @Then("^I verify visa destination$")
    public void i_verify_visa_destination() {
        phptravelsVisaPageAction.verify_visa_page();
    }

    @Then("^I enter my First name \"([^\"]*)\"$")
    public void i_enter_my_First_name(String fname) {
        phptravelsVisaPageAction.enter_fname(fname);
    }

    @Then("^I enter my Last name \"([^\"]*)\"$")
    public void i_enter_my_Last_name(String lname){
        phptravelsVisaPageAction.enter_lname(lname);
    }

    @Then("^I enter my email address \"([^\"]*)\"$")
    public void i_enter_my_email_address(String email){
        phptravelsVisaPageAction.enter_email(email);
    }

    @Then("^I confirm my email address \"([^\"]*)\"$")
    public void i_confirm_my_email_address(String email){
        phptravelsVisaPageAction.enter_conf_email(email);
    }

    @Then("^I enter my mobilephone \"([^\"]*)\"$")
    public void i_enter_my_mobilephone(String mobile) {
        phptravelsVisaPageAction.ente_mobile(mobile);
    }

    @Then("^I verify date \"([^\"]*)\"$")
    public void i_verify_date(String date){
        phptravelsVisaPageAction.verify_date(date);
    }

    @Then("^I check button to complite the booking$")
    public void i_check_button_to_complite_the_booking() {
        phptravelsVisaPageAction.booking_visa();
    }

    @Then("^I verify visa booked and reservation code exist$")
    public void i_verify_visa_booked_and_reservation_code_exist() {
        phptravelsVisaPageAction.verify_visa_submited();
    }

}
