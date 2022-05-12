package co.com.choucair.startsharpproject.questions;

import co.com.choucair.startsharpproject.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class NewBusinessUnit implements Question<String> {

    public static Question<String> result() {
        return new NewBusinessUnit();
    }

    @Override
    public String answeredBy(Actor actor) {

        return BrowseTheWeb.as(actor).find(HomePage.BUSINESS_UNITS_RESULT).getText();
    }
}
