package com.tallerconpatron.certificacion.colorlib.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class VerificationPage extends PageObject{


    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div[1]/div/div/header/h5")
    public WebElementFacade header;//*[@id="content"]/div/div/div[1]/div/div/header/h5
    @FindBy(xpath = "//*[@id=\"req\"]")
    public WebElementFacade required;

    @FindBy(xpath = "//*[@id=\"sport\"]")
    public WebElementFacade selectList1;

    @FindBy(xpath = "//*[@id=\"sport2\"]")
    public WebElementFacade multipleSelectList;

    @FindBy(xpath = "//*[@id=\"url1\"]")
    public WebElementFacade url;

    @FindBy(xpath = "//*[@id=\"email1\"]")
    public WebElementFacade email;

    @FindBy(xpath = "//*[@id=\"pass1\"]")
    public WebElementFacade password;

    @FindBy(xpath = "//*[@id=\"pass2\"]")
    public WebElementFacade confirmPassword;

    @FindBy(xpath = "//*[@id=\"minsize1\"]")
    public WebElementFacade minimumFieldSize;

    @FindBy(xpath = "//*[@id=\"maxsize1\"]")
    public WebElementFacade maximumFieldSize;

    @FindBy(xpath = "//*[@id=\"number2\"]")
    public WebElementFacade number;

    @FindBy(xpath = "//*[@id=\"ip\"]")
    public WebElementFacade ip;

    @FindBy(xpath = "//*[@id=\"date3\"]")
    public WebElementFacade date;

    @FindBy(xpath = "//*[@id=\"past\"]")
    public WebElementFacade dateEarlier;

    @FindBy(xpath = "//*[@id=\"popup-validation\"]/div[14]/input")
    public WebElementFacade btnToSubmmit;

}
