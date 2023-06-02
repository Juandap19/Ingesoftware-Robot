package com.tallerconpatron.certificacion.colorlib.step;

import com.tallerconpatron.certificacion.colorlib.common.BasePage;
import com.tallerconpatron.certificacion.colorlib.pageobject.DropdownPage;
import com.tallerconpatron.certificacion.colorlib.pageobject.LogInPage;
import com.tallerconpatron.certificacion.colorlib.pageobject.VerificationPage;
import net.thucydides.core.annotations.Step;

public class TaskAction extends BasePage {

    private LogInPage logInPage;
    private DropdownPage dropdownPage;

    private VerificationPage verificationPage;

    @Step
    public void openPage() {
        openApp();
    }

    @Step
    public void singIn(String strUser, String strPassword) {
        sendKeyUser(strUser);
        sendKeyPassword(strPassword);
        logInPage.btnSingIn.waitUntilClickable().click();
    }

    public void sendKeyUser(String strUser) {
        logInPage.user.click();
        logInPage.user.clear();
        logInPage.user.sendKeys(strUser);
    }

    public void sendKeyPassword(String strPassword) {
        logInPage.password.click();
        logInPage.password.clear();
        logInPage.password.sendKeys(strPassword);
    }

    public void firstCheck() throws Exception {
        if (!dropdownPage.header.getText().equals("Bootstrap-Admin-Template")) {
            throw new Exception ("Header isn't correct");
        } else {
            System.out.println("Header is correct");
        }

    }
    @Step
    public void clickOnButtons() {
        dropdownPage.buttonForms.waitUntilClickable().click();
        dropdownPage.buttonFormsGeneral.waitUntilClickable().click();
    }


    @Step
    public void fillForm(String strRequired, String strOp1, String strOp2, String strUrl, String strEmail,
                         String strPassword, String strConfirmPassword2, String strMinField, String strMaxField, String strNumber, String strIp, String strDate, String strDateEarlier) {

        verificationPage.required.click();
        verificationPage.required.clear();
        verificationPage.required.sendKeys(strRequired);

        verificationPage.selectList1.click();
        verificationPage.selectList1.selectByIndex(Integer.parseInt(strOp1));

        verificationPage.multipleSelectList.selectByIndex(Integer.parseInt(strOp2));

        verificationPage.url.click();
        verificationPage.url.clear();
        verificationPage.url.sendKeys(strUrl);

        verificationPage.email.click();
        verificationPage.email.clear();
        verificationPage.email.sendKeys(strEmail);

        verificationPage.password.click();
        verificationPage.password.clear();
        verificationPage.password.sendKeys(strPassword);

        verificationPage.confirmPassword.click();
        verificationPage.confirmPassword.clear();
        verificationPage.confirmPassword.sendKeys(strConfirmPassword2);

        verificationPage.minimumFieldSize.click();
        verificationPage.minimumFieldSize.clear();
        verificationPage.minimumFieldSize.sendKeys(strMinField);

        verificationPage.maximumFieldSize.click();
        verificationPage.maximumFieldSize.clear();
        verificationPage.maximumFieldSize.sendKeys(strMaxField);

        verificationPage.number.click();
        verificationPage.number.clear();
        verificationPage.number.sendKeys(strNumber);

        verificationPage.ip.click();
        verificationPage.ip.clear();
        verificationPage.ip.sendKeys(strIp);

        verificationPage.date.click();
        verificationPage.date.clear();
        verificationPage.date.sendKeys(strDate);

        verificationPage.dateEarlier.click();
        verificationPage.dateEarlier.clear();
        verificationPage.dateEarlier.sendKeys(strDateEarlier);


    }


    public void submmit() {
        verificationPage.btnToSubmmit.waitUntilClickable().click();
    }

    public boolean requiredEmpty() {
//        Esto esta paila
        if(verificationPage.required.getText().equals("")){
            return true;
        }else{
            return false;
        }
    }


    public void secondCheck() throws Exception {
        if (!verificationPage.header.getText().equals("Popup Validation")) {
            throw new Exception ("Header isn't correct");
        } else {
            System.out.println("Header is correct");
        }
    }
}