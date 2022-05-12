package co.com.choucair.startsharpproject.stepdefinitions;

import co.com.choucair.startsharpproject.model.MeetingInformation;
import co.com.choucair.startsharpproject.questions.NewMeeting;
import co.com.choucair.startsharpproject.tasks.FillMeetingFields;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class SheduleMeetingStepsDefinition {

    @When("^He fills in the required fields for the new meeting$")
    public void heCreatesANewMeeting(List<MeetingInformation> meetingInformation) {

        theActorInTheSpotlight().attemptsTo(FillMeetingFields.with(meetingInformation.get(0)));

    }

    @Then("^He should see the new meeting created in the table$")
    public void shouldSeeCurrently(List<MeetingInformation> info) {

        theActorInTheSpotlight().should(seeThat("The", NewMeeting.result(), equalTo(info.get(0).getMeeting_name())));
    }
}
