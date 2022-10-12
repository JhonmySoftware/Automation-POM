package co.com.certification.pom.pageobjetc;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Home_colorlib extends PageObject {

    // Home page
    @FindBy(xpath = "//*[@id=\"content\"]/div/div")
    public WebElementFacade lbl_menu;

    @FindBy(xpath = "//*[@id=\"menu\"]/li[6]/a/span[1]")
    public WebElementFacade Forms;

    @FindBy(xpath = "//*[@id=\"menu\"]/li[6]/ul/li[2]/a")
    public WebElementFacade FormsValid;

}
