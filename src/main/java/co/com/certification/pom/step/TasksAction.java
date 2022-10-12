package co.com.certification.pom.step;

import co.com.certification.pom.pageobjetc.PaginaUrl;
import co.com.certification.pom.pageobjetc.ValidForms;
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
    private ValidForms validForms;


    @Step
    public void appUrl() throws InterruptedException {
        paginaUrl.open();
    }

    @Step
    public void singIn() throws InterruptedException {
        paginaUrl.user.sendKeys("@jhonfquinonesa");
        paginaUrl.pass.sendKeys("@123456");
        paginaUrl.btn_sing_in.click();
    }

    @Step
    public void Verificar() throws InterruptedException {
        assertThat(paginaUrl.lbl_menu.isCurrentlyVisible(), is(true));
    }

    @Step
    public void FunBlockValid() throws InterruptedException {
        paginaUrl.Forms.click();
        paginaUrl.FormsValid.click();
    }

    @Step
    public void verificationform() throws InterruptedException {
        assertThat(paginaUrl.Verification.isCurrentlyVisible(), is(true));
    }

    @Step
    public void DiligenciarFormulario() throws InterruptedException {
        paginaUrl.Required.sendKeys("Aloha");
        paginaUrl.Select.selectByIndex(2);
        paginaUrl.MultSelect.selectByIndex(3);
        paginaUrl.Url1.clear();
        paginaUrl.Url1.sendKeys("https://colorlib.com");
        paginaUrl.Email.sendKeys("Test@gmail.com");
        paginaUrl.Password.sendKeys("654321");
        paginaUrl.ConfPassword.sendKeys("654321");
        paginaUrl.Minimum.sendKeys("");
        paginaUrl.Maximum.clear();
        paginaUrl.Maximum.sendKeys("654321");
        paginaUrl.Number.clear();
        paginaUrl.Number.sendKeys("100.1");
        paginaUrl.IP.clear();
        paginaUrl.IP.sendKeys("172.20.10.23");
        paginaUrl.date.clear();
        paginaUrl.date.sendKeys("2020-10-05");
        paginaUrl.DateEarlier.clear();
        paginaUrl.DateEarlier.sendKeys("2012/09/13");
    }

    @Step
    public void clicvalidar() throws InterruptedException {
        paginaUrl.validation.click();
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

}


