package co.com.choucair.startsharpproject.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.choucair.startsharpproject.userinterface.HomePage.*;


public class DashboardLogin implements Question<String> {

    public static Question<String> title(){
        return new DashboardLogin();
    }

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(DASHBOARD_TITLE).getText();
    }
}
