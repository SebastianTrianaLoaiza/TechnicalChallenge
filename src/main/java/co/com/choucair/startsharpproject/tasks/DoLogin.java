package co.com.choucair.startsharpproject.tasks;

import co.com.choucair.startsharpproject.model.Credentials;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.startsharpproject.userinterface.LoginPage.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DoLogin implements Task {

    public static DoLogin with(Credentials credentials){
        return Tasks.instrumented(DoLogin.class,credentials);
    }

    public DoLogin(Credentials credentials) {
        this.credentials = credentials;
    }

    private Credentials credentials;


    @Override
    public <T extends Actor> void performAs(T actor) {

        theActorInTheSpotlight().attemptsTo(Enter.theValue(credentials.getUser_name()).into(USER_FIELD),
                Enter.theValue(credentials.getPassword()).into(PASSWORD_FIELD),
                Click.on(SIGN_IN_BUTTON));
    }

}
