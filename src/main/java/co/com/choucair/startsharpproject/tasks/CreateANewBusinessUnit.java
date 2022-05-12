package co.com.choucair.startsharpproject.tasks;

import co.com.choucair.startsharpproject.model.BusinessUnit;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.choucair.startsharpproject.userinterface.HomePage.*;
import static co.com.choucair.startsharpproject.userinterface.HomePage.SAVE_UNIT_BUTTON;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CreateANewBusinessUnit implements Task {

    public CreateANewBusinessUnit(BusinessUnit businessUnit) {
        this.businessUnit = businessUnit;
    }

    private BusinessUnit businessUnit;

    public static CreateANewBusinessUnit called(BusinessUnit businessUnit){
        return Tasks.instrumented(CreateANewBusinessUnit.class, businessUnit);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        theActorInTheSpotlight().attemptsTo(Click.on(SIDEBAR_ORGANIZATION_OPTION),
                Click.on(SIDEBAR_BUSINESS_UNITS_OPTION),
                Click.on(NEW_BUSINESS_UNITS_BUTTON),
                Enter.theValue(businessUnit.getBusiness_unit_name()).into(NEW_BUSINESS_NAME_FIELD).thenHit(Keys.TAB).thenHit(Keys.SPACE),
                Enter.keyValues("Corp").into(PARENT_UNIT_TEXTSEARCH).thenHit(Keys.ENTER),
                Click.on(SAVE_UNIT_BUTTON)
        );

        theActorInTheSpotlight().attemptsTo(Enter.theValue(businessUnit.getBusiness_unit_name()).into(BUSINESS_UNIT_FINDER).thenHit(Keys.ENTER)
        );

    }
}
