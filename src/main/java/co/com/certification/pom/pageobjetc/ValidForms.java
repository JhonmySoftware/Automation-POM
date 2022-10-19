package co.com.certification.pom.pageobjetc;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

public class ValidForms extends PageObject {


    @FindBy(xpath = "//*[@id=\"popup-validation\"]/div[1]/div/div/div[1]")
    public WebElementFacade Requiredv;

    @FindBy(xpath = "//*[@id=\"popup-validation\"]/div[2]/div/div/div[1]")
    public WebElementFacade Selectv;

    @FindBy(xpath = "//*[@id=\"popup-validation\"]/div[3]/div/div/div[1]")
    public WebElementFacade MultSelectv;

    @FindBy(xpath = "//*[@id=\"popup-validation\"]/div[4]/div/div/div[1]")
    public WebElementFacade Url1v;

    @FindBy(xpath = "//*[@id=\"popup-validation\"]/div[5]/div/div/div[1]")
    public WebElementFacade Emailv;

    @FindBy(xpath = "//*[@id=\"popup-validation\"]/div[6]/div/div/div[1]")
    public WebElementFacade Passwordv;

    @FindBy(xpath = "//*[@id=\"popup-validation\"]/div[7]/div/div/div[1]")
    public WebElementFacade ConfPasswordv;

    @FindBy(xpath = "//*[@id=\"popup-validation\"]/div[8]/div/div/div[1]")
    public WebElementFacade Minimumv;

    @FindBy(xpath = "//*[@id=\"popup-validation\"]/div[9]/div/div/div[1]")
    public WebElementFacade Maximumv;

    @FindBy(xpath = "//*[@id=\"popup-validation\"]/div[10]/div/div/div[1]")
    public WebElementFacade Numberv;

    @FindBy(xpath = "//*[@id=\"popup-validation\"]/div[11]/div/div/div[1]")
    public WebElementFacade IPv;

    @FindBy(xpath = "//*[@id=\"popup-validation\"]/div[12]/div/div/div[1]")
    public WebElementFacade datev;

    @FindBy(xpath = "//*[@id=\"popup-validation\"]/div[13]/div/div/div[1]")
    public WebElementFacade DateEarlierv;


    // two challenge
    @FindBy(id = "required")
    public WebElementFacade Requiredin;

    @FindBy(id = "email")
    public WebElementFacade Emailin;

    @FindBy(id = "password")
    public WebElementFacade Passwordin;

    @FindBy(id = "confirm_password")
    public WebElementFacade ConfPasswordin;

    @FindBy(id = "date")
    public WebElementFacade Datein;

    @FindBy(id = "url")
    public WebElementFacade Urlin;

    @FindBy(id = "agree")
    public WebElementFacade Agreein;

    @FindBy(id = "minsize")
    public WebElementFacade minsizein;

    @FindBy(id = "maxsize")
    public WebElementFacade maxsizein;

    @FindBy(id = "minNum")
    public WebElementFacade minNumin;

    @FindBy(id = "maxNum")
    public WebElementFacade maxNumin;

    @FindBy(id = "Validate")
    public WebElementFacade Validatein;
}
