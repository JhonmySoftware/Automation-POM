package co.com.certification.pom.definition;

import co.com.certification.pom.pageobjetc.Popup_Validation_colorlib;
import co.com.certification.pom.step.TasksAction;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class Mydefinitions {

    @Steps
    TasksAction tasksAction;
    private Popup_Validation_colorlib popupValidationColorlib;

    @Given("^I enter with my credentials$")
    public void i_enter_with_my_credentials() throws InterruptedException {
        tasksAction.appUrl();
    }

    @When("^I proceed with the authentication$")
    public void i_proceed_with_the_authentication() throws InterruptedException {
        tasksAction.singIn();
    }

    @And("^go to the main view of the page$")
    public void go_to_the_main_view_of_the_page() throws InterruptedException {
        tasksAction.Verificar();
    }

    @And("^I enter the forms module and then I select the option form validation$")
    public void iEnterTheFormsModuleAndThenISelectTheOptionFormValidation() throws InterruptedException {
        tasksAction.FunBlockValid();
    }

    @And("^Verification functionality screen with title Popup Validation$")
    public void verificationFunctionalityScreenWithTitlePopupValidation() throws InterruptedException {
        tasksAction.verificationform();
    }

    @And("^that there is a form called Block Validation and enter the fields$")
    public void thatThereIsAFormCalledBlockValidationAndEnterTheFields(DataTable Formulario) throws InterruptedException {
        List<List<String>> data = Formulario.raw();
        popupValidationColorlib.Required.sendKeys(data.get(1).get(1));
        popupValidationColorlib.Select.selectByIndex(2);
        popupValidationColorlib.MultSelect.selectByIndex(3);
        popupValidationColorlib.Url1.clear();
        popupValidationColorlib.Url1.sendKeys(data.get(4).get(1));
        popupValidationColorlib.Email.clear();
        popupValidationColorlib.Email.sendKeys(data.get(5).get(1));
        popupValidationColorlib.Password.clear();
        popupValidationColorlib.Password.sendKeys(data.get(6).get(1));
        popupValidationColorlib.ConfPassword.sendKeys(data.get(7).get(1));
        popupValidationColorlib.Minimum.sendKeys(data.get(8).get(1));
        popupValidationColorlib.Maximum.clear();
        popupValidationColorlib.Maximum.sendKeys(data.get(9).get(1));
        popupValidationColorlib.Number.clear();
        popupValidationColorlib.Number.sendKeys(data.get(10).get(1));
        popupValidationColorlib.IP.clear();
        popupValidationColorlib.IP.sendKeys(data.get(11).get(1));
        popupValidationColorlib.date.clear();
        popupValidationColorlib.date.sendKeys(data.get(12).get(1));
        popupValidationColorlib.DateEarlier.clear();
        popupValidationColorlib.DateEarlier.sendKeys(data.get(13).get(1));



    }

    @And("^Click on Validate button$")
    public void clickOnValidateButton() throws InterruptedException {
        tasksAction.clicvalidar();
    }

    @Then("^Check Success / Fail Response$")
    public void checkSuccessFailResponse() throws InterruptedException {
        tasksAction.validForms();
    }

    // two challenge

    @Given("^I enter with my credentials in colorlib$")
    public void iEnterWithMyCredentialsInColorlib() throws InterruptedException {
        tasksAction.appUrl();
        tasksAction.singIn();

    }

    @When("^I proceed with the authentication correct$")
    public void iProceedWithTheAuthenticationCorrect() throws InterruptedException {
        tasksAction.Verificar();
        tasksAction.FunBlockValid();
        tasksAction.validationInline();
    }

    @And("^verify diligently correct$")
    public void verifyDiligentlyCorrect() {
    }

    @Then("^Check validation message for each field$")
    public void checkValidationMessageForEachField() {

    }
}
