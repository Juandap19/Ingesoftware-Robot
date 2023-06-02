package com.tallerconpatron.certificacion.colorlib.common;

import com.tallerconpatron.certificacion.colorlib.pageobject.LogInPage;
import org.openqa.selenium.WebDriver;

public class BasePage {
    public static WebDriver driver;

    private LogInPage logInPage;

    public void openApp(){
        logInPage.open();
    }

    public WebDriver getDriver(){
        return driver;
    }
}
