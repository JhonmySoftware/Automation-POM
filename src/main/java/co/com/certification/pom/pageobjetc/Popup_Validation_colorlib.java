package co.com.certification.pom.pageobjetc;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class Popup_Validation_colorlib extends PageObject {

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div[2]/div/div/header/h5")
    public WebElementFacade Verification;

    @FindBy(xpath = "//*[@id=\"req\"]")
    public WebElementFacade Required;

    @FindBy(id = "sport")
    public WebElementFacade Select;

    @FindBy(id = "sport2")
    public WebElementFacade MultSelect;

    @FindBy(xpath = "//*[@id=\"url1\"]")
    public WebElementFacade Url1;

    @FindBy(id = "email1")
    public WebElementFacade Email;

    @FindBy(id = "pass1")
    public WebElementFacade Password;

    @FindBy(id = "pass2")
    public WebElementFacade ConfPassword;

    @FindBy(id = "minsize1")
    public WebElementFacade Minimum;

    @FindBy(id = "maxsize1")
    public WebElementFacade Maximum;

    @FindBy(id = "number2")
    public WebElementFacade Number;

    @FindBy(id = "ip")
    public WebElementFacade IP;

    @FindBy(id = "date3")
    public WebElementFacade date;

    @FindBy(id = "past")
    public WebElementFacade DateEarlier;

    @FindBy(xpath = "//*[@id=\"popup-validation\"]/div[14]/input")
    public WebElementFacade validation;

}
