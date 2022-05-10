package co.com.choucair.startsharpproject.tasks;

import co.com.choucair.startsharpproject.userinterface.StartSharpUrl;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {

    private StartSharpUrl starSharpPage;

    public static OpenUp startSharp() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(starSharpPage));
    }
}
