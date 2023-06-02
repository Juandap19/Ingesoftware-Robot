package com.tallerconpatron.certificacion.colorlib.pageobject;

import com.tallerconpatron.certificacion.colorlib.common.BasePage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://colorlib.com/polygon/metis/index.html?")
public class DropdownPage extends PageObject {


    @FindBy(xpath = "//*[@id=\"bootstrap-admin-template\"]")
    public WebElementFacade header;

    @FindBy(xpath = "//*[@id=\"menu\"]/li[6]/a")
    public WebElementFacade buttonForms;

    @FindBy(xpath = "//*[@id=\"menu\"]/li[6]/ul/li[2]/a")
    public WebElementFacade buttonFormsGeneral;





}
