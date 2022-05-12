package co.com.choucair.startsharpproject.stepdefinitions;

import co.com.choucair.startsharpproject.model.BusinessUnit;
import co.com.choucair.startsharpproject.tasks.CreateANewBusinessUnit;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static co.com.choucair.startsharpproject.questions.NewBusinessUnit.result;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class CreateNewBUnitStepsDefinition {


    @When("^He creates a new business unit called business_unit_name$")
    public void createANewBusinessUnit(List<BusinessUnit> businessUnit) {

        theActorInTheSpotlight().attemptsTo(
                CreateANewBusinessUnit.called(businessUnit.get(0))
        );
    }

    @Then("^He should see business_unit_name newly created in table$")
    public void businessUnitSuccessfullyCreated(List<BusinessUnit> businessUnit) {

        theActorInTheSpotlight().should(
                seeThat("The displayed currently business name", result(), equalTo(businessUnit.get(0).getBusiness_unit_name())));
    }
}
