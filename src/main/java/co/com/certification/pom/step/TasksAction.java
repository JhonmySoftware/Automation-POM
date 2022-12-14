package co.com.certification.pom.step;

import co.com.certification.pom.pageobjetc.*;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.wait.FluentWait;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TasksAction {


    private PaginaUrl paginaUrl;
    private Login_colorlib loginColorlib;
    private ValidForms validForms;
    private Home_colorlib homeColorlib;
    private Popup_Validation_colorlib popupValidationColorlib;


    @Step
    public void appUrl() throws InterruptedException {
        paginaUrl.open();
    }

    @Step
    public void singIn() throws InterruptedException {
        loginColorlib.user.sendKeys("@jhonfquinonesa");
        loginColorlib.pass.sendKeys("@123456");
        loginColorlib.btn_sing_in.click();
    }

    @Step
    public void Verificar() throws InterruptedException {
        assertThat(homeColorlib.lbl_menu.isCurrentlyVisible(), is(true));
    }

    @Step
    public void FunBlockValid() throws InterruptedException {
        homeColorlib.Forms.click();
        homeColorlib.FormsValid.click();
    }

    @Step
    public void verificationform() throws InterruptedException {
        assertThat(popupValidationColorlib.Verification.isCurrentlyVisible(), is(true));
    }

    @Step
    public void validationInline() throws InterruptedException {
        assertThat(popupValidationColorlib.validationInline.isCurrentlyVisible(), is(true));
    }

    @Step
    public void DiligenciarFormulario() throws InterruptedException {
        popupValidationColorlib.Required.sendKeys("Aloha");
        popupValidationColorlib.Select.selectByIndex(2);
        popupValidationColorlib.MultSelect.selectByIndex(3);
        popupValidationColorlib.Url1.clear();
        popupValidationColorlib.Url1.sendKeys("https://colorlib.com");
        popupValidationColorlib.Email.sendKeys("Test@gmail.com");
        popupValidationColorlib.Password.sendKeys("654321");
        popupValidationColorlib.ConfPassword.sendKeys("654321");
        popupValidationColorlib.Minimum.sendKeys("");
        popupValidationColorlib.Maximum.clear();
        popupValidationColorlib.Maximum.sendKeys("654321");
        popupValidationColorlib.Number.clear();
        popupValidationColorlib.Number.sendKeys("100.1");
        popupValidationColorlib.IP.clear();
        popupValidationColorlib.IP.sendKeys("172.20.10.23");
        popupValidationColorlib.date.clear();
        popupValidationColorlib.date.sendKeys("2020-10-05");
        popupValidationColorlib.DateEarlier.clear();
        popupValidationColorlib.DateEarlier.sendKeys("2012/09/13");
    }

    @Step
    public void DiligenciarInline () throws InterruptedException {

    }

    @Step
    public void clicvalidar() throws InterruptedException {
        popupValidationColorlib.validation.click();
    }

    @Step
    public void validForms() throws InterruptedException {
        List<WebElementFacade> valid = Arrays.asList(
                validForms.Requiredv,
                validForms.Selectv,
                validForms.MultSelectv,
                validForms.Url1v,
                validForms.Emailv,
                validForms.Passwordv,
                validForms.ConfPasswordv,
                validForms.Minimumv,
                validForms.Maximumv,
                validForms.Numberv,
                validForms.IPv,
                validForms.datev,
                validForms.DateEarlierv
        );
        for (WebElementFacade i : valid) {
            if (i.isCurrentlyVisible()) {
                assertThat(i.isCurrentlyVisible(), is(true));
                System.out.println("Validar el campo: " + i);
            } else {
                assertThat(i.isCurrentlyVisible(), is(false));
                System.out.println("Validación del campo " + i + " correcta: ");
            }
        }
    }

       // Reporte de selenium gradle clean test aggregate -Dtas=@caso1
    // TEST

}


