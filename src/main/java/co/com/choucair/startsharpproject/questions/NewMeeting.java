package co.com.choucair.startsharpproject.questions;

import co.com.choucair.startsharpproject.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.choucair.startsharpproject.userinterface.HomePage.*;

public class NewMeeting implements Question<String> {

    public static Question<String> result(){
        return new NewMeeting();
    }

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(MEETING_CREATED).getText();
    }
}
