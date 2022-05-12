package co.com.choucair.startsharpproject.tasks;

import co.com.choucair.startsharpproject.model.MeetingInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import static co.com.choucair.startsharpproject.userinterface.HomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillMeetingFields implements Task {


    public FillMeetingFields(MeetingInformation meetingInformation) {
        this.meetingInformation = meetingInformation;
    }

    private final MeetingInformation meetingInformation;

    public static FillMeetingFields with(MeetingInformation meetingInformation) {
        return Tasks.instrumented(FillMeetingFields.class, meetingInformation);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(SIDEBAR_MEETING_OPTION),
                Click.on(MEETING_OPTION_LIST),
                Click.on(NEW_MEETING_BUTTON),
                Enter.theValue(meetingInformation.getMeeting_name()).into(MEETING_NAME_FIELD));

        actor.attemptsTo(
                Click.on(MEETING_TYPE_FIELD),
                Enter.theValue(meetingInformation.getMeeting_type()).into(MEETING_TYPE_INPUT).thenHit(Keys.ENTER),
                Enter.theValue(meetingInformation.getMeeting_number()).into(MEETING_NUMBER_FIELD),
                Enter.theValue(meetingInformation.getStart_date()).into(MEETING_STARTDATE_FIELD),
                SelectFromOptions.byValue(meetingInformation.getStart_hour()).from(MEETING_STARTHOUR_FIELD),
                Enter.theValue(meetingInformation.getEnd_date()).into(MEETING_ENDDATE_FIELD),
                SelectFromOptions.byValue(meetingInformation.getEnd_hour()).from(MEETING_ENDHOUR_FIELD),
                Click.on(MEETING_LOCATION_OPTIONS),
                Enter.theValue(meetingInformation.getLocation()).into(MEETING_LOCATION_FIELD).thenHit(Keys.ENTER),
                Click.on(MEETING_UNIT_OPTIONS),
                Enter.theValue(meetingInformation.getUnit()).into(MEETING_UNIT_FIELD).thenHit(Keys.ENTER),
                Click.on(MEETING_ORGANIZEDBY_OPTIONS),
                Enter.theValue(meetingInformation.getOrganized_by()).into(MEETING_ORGANIZEDBY_FIELD).thenHit(Keys.ENTER),
                Click.on(MEETING_REPORTER_OPTIONS),
                Enter.theValue(meetingInformation.getReporter()).into(MEETING_REPORTER_FIELD).thenHit(Keys.ENTER),
                Click.on(MEETING_ATTENDEE_OPTIONS),
                Enter.theValue(meetingInformation.getAttendee_name()).into(MEETING_ATTENDEE_FIELD).thenHit(Keys.ENTER),
                Click.on(MEETING_SAVE_BUTTON)
                );

        actor.attemptsTo(
                Enter.theValue(meetingInformation.getMeeting_name()).into(MEETING_FINDER).thenHit(Keys.ENTER)
        );

    }

}
