package co.com.certification.pom.pageobjetc;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import javax.xml.xpath.XPath;

@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class PaginaUrl extends PageObject {


    @FindBy(xpath = "//*[@id=\"login\"]/form/input[1]")
    public WebElementFacade user;

    @FindBy(xpath = "//*[@id=\"login\"]/form/input[2]")
    public WebElementFacade pass;

    @FindBy(xpath = "//*[@id=\"login\"]/form/button")
    public WebElementFacade btn_sing_in;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div")
    public WebElementFacade lbl_menu;

    @FindBy(xpath = "//*[@id=\"menu\"]/li[6]/a/span[1]")
    public WebElementFacade Forms;

    @FindBy(xpath = "//*[@id=\"menu\"]/li[6]/ul/li[2]/a")
    public WebElementFacade FormsValid;

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
