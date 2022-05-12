package co.com.choucair.startsharpproject.stepdefinitions;

import co.com.choucair.startsharpproject.model.BusinessUnit;
import co.com.choucair.startsharpproject.model.Credentials;
import co.com.choucair.startsharpproject.model.HomePage;
import co.com.choucair.startsharpproject.questions.DashboardLogin;
import co.com.choucair.startsharpproject.questions.NewBusinessUnit;
import co.com.choucair.startsharpproject.questions.NewMeeting;
import co.com.choucair.startsharpproject.tasks.CreateANewBusinessUnit;
import co.com.choucair.startsharpproject.tasks.DoLogin;
import co.com.choucair.startsharpproject.tasks.FillMeetingFields;
import co.com.choucair.startsharpproject.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static co.com.choucair.startsharpproject.questions.DashboardLogin.*;
import static co.com.choucair.startsharpproject.questions.NewBusinessUnit.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class DoLoginStepsDefiniton {


    @Then("^He should see the home_title$")
    public void heShouldSeeTheDashboard(List<HomePage> homepage) {

        theActorInTheSpotlight().should(
                seeThat("The displayed", title(), equalTo(homepage.get(0).getHome_title()))
        );

    }
}