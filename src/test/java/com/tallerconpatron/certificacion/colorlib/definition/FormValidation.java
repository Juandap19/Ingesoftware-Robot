package com.tallerconpatron.certificacion.colorlib.definition;

import com.tallerconpatron.certificacion.colorlib.common.BasePage;
import com.tallerconpatron.certificacion.colorlib.step.TaskAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class FormValidation  extends BasePage {
    private String user;
    private String password;

    @Steps
    TaskAction taskAction;


    @Given("^I enter with my credentials$")
    public void iEnterWithMyCredentials(io.cucumber.datatable.DataTable dataTable) {
            this.user = dataTable.cell(1,0);
            this.password = dataTable.cell(1,1);

    }

    @When("^I proceed with the authentication$")
    public void iProceedWithTheAuthentication() {
        try {
            taskAction.openPage();
            taskAction.singIn(user, password);
        }catch (NullPointerException e){
            System.out.println(e);
        }
    }

    @And("^go to the main view of the page$")
    public void goToTheMainViewOfThePage() throws Exception {
        taskAction.firstCheck();
    }

    @And("^enter submenu for a validations$")
    public void enterSubmenuForAValidations() {
        taskAction.clickOnButtons();
    }

    @And("^check the title of the form on the screen$")
    public void checkTheTitleOfTheFormOnTheScreen() throws Exception {
        taskAction.secondCheck();

    }

    @And("^fill all fields$")
    public void fillAllFields(io.cucumber.datatable.DataTable dataTable) {
        taskAction.fillForm(dataTable.cell(1,0),dataTable.cell(1,1), dataTable.cell(1,2) ,
                dataTable.cell(1,3) ,dataTable.cell(1,4),dataTable.cell(1,5),dataTable.cell(1,6),
                dataTable.cell(1,7),dataTable.cell(1,8),dataTable.cell(1,9),dataTable.cell(1,10),
                dataTable.cell(1,11),dataTable.cell(1,12));
        taskAction.submmit();

    }


    @Then("field required will be empty")
    public void fieldRequiredWillBeEmpty() throws Exception {
        if(taskAction.requiredEmpty() != true){
            throw new Exception("The information wasn't sent");

        }else {
            System.out.println("The information was sent");
        }

    }
}
