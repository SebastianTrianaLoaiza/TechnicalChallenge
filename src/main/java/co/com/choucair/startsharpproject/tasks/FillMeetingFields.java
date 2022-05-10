package co.com.choucair.startsharpproject.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import static co.com.choucair.startsharpproject.userinterface.HomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillMeetingFields implements Task {

    private final String meeting_name;
    private final String meeting_type;
    private final String meeting_number;
    private final String start_date;
    private final String start_hour;
    private final String end_date;
    private final String end_hour;
    private final String location;
    private final String unit;
    private final String organized_by;
    private final String reporter;
    private final String attendee_name;


    public FillMeetingFields(String meeting_name, String meeting_type, String meeting_number, String start_date, String start_hour, String end_date, String end_hour, String location, String unit, String organized_by, String reporter, String attendee_name) {
        this.meeting_name = meeting_name;
        this.meeting_type = meeting_type;
        this.meeting_number = meeting_number;
        this.start_date = start_date;
        this.start_hour = start_hour;
        this.end_date = end_date;
        this.end_hour = end_hour;
        this.location = location;
        this.unit = unit;
        this.organized_by = organized_by;
        this.reporter = reporter;
        this.attendee_name = attendee_name;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(meeting_name).into(MEETING_NAME_FIELD));
                actor.attemptsTo(
                        Click.on(MEETING_TYPE_FIELD),
                        Enter.theValue(meeting_type).into(MEETING_TYPE_INPUT).thenHit(Keys.ENTER));
                actor.attemptsTo(Enter.theValue(meeting_number).into(MEETING_NUMBER_FIELD));
                actor.attemptsTo(Enter.theValue(start_date).into(MEETING_STARTDATE_FIELD));
                actor.attemptsTo(SelectFromOptions.byValue(start_hour).from(MEETING_STARTHOUR_FIELD));
                actor.attemptsTo(Enter.theValue(end_date).into(MEETING_ENDDATE_FIELD));
                actor.attemptsTo(SelectFromOptions.byValue(end_hour).from(MEETING_ENDHOUR_FIELD));
                actor.attemptsTo(Click.on(MEETING_LOCATION_OPTIONS),
                        Enter.theValue(location).into(MEETING_LOCATION_FIELD).thenHit(Keys.ENTER)
                        );
        actor.attemptsTo(Click.on(MEETING_UNIT_OPTIONS),
                        Enter.theValue(unit).into(MEETING_UNIT_FIELD).thenHit(Keys.ENTER)
                        );
                actor.attemptsTo(Click.on(MEETING_ORGANIZEDBY_OPTIONS),
                        Enter.theValue(organized_by).into(MEETING_ORGANIZEDBY_FIELD).thenHit(Keys.ENTER)
                        );
                actor.attemptsTo(Click.on(MEETING_REPORTER_OPTIONS),
                        Enter.theValue(reporter).into(MEETING_REPORTER_FIELD).thenHit(Keys.ENTER)
                        );
                actor.attemptsTo(Click.on(MEETING_ATTENDEE_OPTIONS),
                        Enter.theValue(attendee_name).into(MEETING_ATTENDEE_FIELD).thenHit(Keys.ENTER)
                        );
                actor.attemptsTo(Click.on(MEETING_SAVE_BUTTON));

    }

    public static Performable withData(String meeting_name, String meeting_type, String meeting_number, String start_date, String start_hour, String end_date, String end_hour, String location, String unit, String organized_by, String reporter, String attendee_name) {
        return instrumented(FillMeetingFields.class, meeting_name, meeting_type, meeting_number, start_date, start_hour, end_date, end_hour, location, unit, organized_by, reporter, attendee_name);
    }
}
