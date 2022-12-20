package co.com.certification.pom.step;


import co.com.certification.pom.pageobjetc.*;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;



import java.util.Arrays;
import java.util.List;


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

//    @Step
//    public void DiligenciarFormulario() throws InterruptedException {
//
//    }
//
//    @Step
//    public void DiligenciarInline () throws InterruptedException {
//    }

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
                System.out.println("Validación Correcta del campo: " + i );
            }
        }
    }

       // Reporte de selenium gradle clean test aggregate -Dtas=@caso


}


