package co.com.certification.pom.pageobjetc;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Login_colorlib extends PageObject {

    // Login page object
    @FindBy(xpath = "//*[@id=\"login\"]/form/input[1]")
    public WebElementFacade user;

    @FindBy(xpath = "//*[@id=\"login\"]/form/input[2]")
    public WebElementFacade pass;

    @FindBy(xpath = "//*[@id=\"login\"]/form/button")
    public WebElementFacade btn_sing_in;

}
