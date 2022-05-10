package co.com.choucair.startsharpproject.stepdefinitions;

import co.com.choucair.startsharpproject.questions.DashboardLogin;
import co.com.choucair.startsharpproject.questions.NewBusinessUnit;
import co.com.choucair.startsharpproject.tasks.FillMeetingFields;
import co.com.choucair.startsharpproject.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.interactions.Ensure;
import org.openqa.selenium.Keys;

import static co.com.choucair.startsharpproject.userinterface.HomePage.*;
import static co.com.choucair.startsharpproject.userinterface.LoginPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class SheduleMeetingStepsDefiniton {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Sebastian search on browser: StartSharp url$")
    public void openUrl() {
        OnStage.theActorCalled("Sebastian").wasAbleTo(OpenUp.startSharp());
    }

    @When("^He logs in with an enabled (.*) and (.*)$")
    public void doStartSharpLogin(String user_name, String pass) {

        theActorInTheSpotlight().attemptsTo(Enter.theValue(user_name).into(USER_FIELD),
                Enter.theValue(pass).into(PASSWORD_FIELD),
                Click.on(SIGN_IN_BUTTON));
    }

    @Then("^He should see the Dashboard$")
    public void successfullLogin() {
        theActorInTheSpotlight().should(
                seeThat("The displayed tittle", DashboardLogin.tittle(), equalTo("Dashboard"))
        );
    }

    @Given("^that Sebastian login with (.*) and (.*)$")
    public void thatSebastianNavigatesOnTheSidebarFromOrganizationSectionToBusinessUnit(String user_name, String pass) {

        OnStage.theActorCalled("Sebastian").wasAbleTo(OpenUp.startSharp());
        theActorInTheSpotlight().attemptsTo(Enter.theValue(user_name).into(USER_FIELD),
                Enter.theValue(pass).into(PASSWORD_FIELD),
                Click.on(SIGN_IN_BUTTON));
    }

    @When("^He navigates on the sidebar from Organization section to Business unit and creates a new business unit called (.*)$")
    public void heCreatesANewBusinessUnitCalledUnidad(String business_unit_name) {

        theActorInTheSpotlight().attemptsTo(Click.on(SIDEBAR_ORGANIZATION_OPTION),
                Click.on(SIDEBAR_BUSINESS_UNITS_OPTION),
                Click.on(NEW_BUSINESS_UNITS_BUTTON),
                Enter.theValue(business_unit_name).into(NEW_BUSINESS_NAME_FIELD).thenHit(Keys.TAB).thenHit(Keys.SPACE),
                Enter.keyValues("Corp").into(PARENT_UNIT_TEXTSEARCH).thenHit(Keys.ENTER),
                Click.on(SAVE_UNIT_BUTTON)
        );
    }

    @Then("^He should see the currently (.*) created from Business units list$")
    public void heShouldSeeTheCurrentlyBusinessUnitCreatedFromBusinessUnitsList(String businees_unit) {

        theActorInTheSpotlight().attemptsTo(
                Enter.theValue(businees_unit).into(BUSINESS_UNIT_FINDER).thenHit(Keys.ENTER)
        );
    }

    @Given("^the actor login with his own credentials (.*) and (.*)$")
    public void thatSebastianNavigatesOnTheSidebarFromMeetingSectionToMeetings(String user_name, String pass) {

        OnStage.theActorCalled("Sebastian").wasAbleTo(OpenUp.startSharp());
        theActorInTheSpotlight().attemptsTo(Enter.theValue(user_name).into(USER_FIELD),
                Enter.theValue(pass).into(PASSWORD_FIELD),
                Click.on(SIGN_IN_BUTTON));
    }

    @When("^He navigates on the sidebar from Meeting section to Meetings$")
    public void heNavigates() {

        theActorInTheSpotlight().attemptsTo(
                Click.on(SIDEBAR_MEETING_OPTION),
                Click.on(MEETING_OPTION_LIST)
        );
    }

    @And("^He creates a new meeting filling fields: (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*) with the recently business unit created$")
    public void heCreatesANewMeeting(String meeting_name, String meeting_type, String meeting_number, String start_date, String start_hour, String end_date, String end_hour, String location, String unit, String organized_by, String reporter, String attendee_name) {
        theActorInTheSpotlight().attemptsTo(
                Click.on(NEW_MEETING_BUTTON));

        theActorInTheSpotlight().attemptsTo(FillMeetingFields.withData(meeting_name, meeting_type, meeting_number, start_date, start_hour, end_date, end_hour, location, unit, organized_by, reporter, attendee_name));

    }

    @Then("^He should see the (.*) currently meeting created$")
    public void shouldSeeCurrently(String meeting_name) {

        theActorInTheSpotlight().attemptsTo(
                Enter.theValue(meeting_name).into(MEETING_FINDER).thenHit(Keys.ENTER)
        );
    }
}

