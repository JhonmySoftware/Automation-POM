package co.com.certification.pom.definition;

import co.com.certification.pom.step.TasksAction;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Mydefinitions {

    @Steps
    TasksAction tasksAction;

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
    public void thatThereIsAFormCalledBlockValidationAndEnterTheFields() throws InterruptedException {
        tasksAction.DiligenciarFormulario();
    }

    @And("^Click on Validate button$")
    public void clickOnValidateButton() throws InterruptedException {
        tasksAction.clicvalidar();
    }

    @Then("^Check Success / Fail Response$")
    public void checkSuccessFailResponse() throws InterruptedException {
        tasksAction.validForms();
    }


}
