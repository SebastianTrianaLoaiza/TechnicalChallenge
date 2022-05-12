package co.com.choucair.startsharpproject.stepdefinitions;

import co.com.choucair.startsharpproject.model.Credentials;
import co.com.choucair.startsharpproject.tasks.DoLogin;
import co.com.choucair.startsharpproject.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Background {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Sebastian navigates to StartSharp$")
    public void openUrl() {
        OnStage.theActorCalled("Sebastian").wasAbleTo(OpenUp.startSharp());
    }

    @And("^He logs in with an enabled user and password$")
    public void doStartSharpLogin(List<Credentials> credentials) {

        theActorInTheSpotlight().attemptsTo(DoLogin.with(credentials.get(0)));
    }
}
