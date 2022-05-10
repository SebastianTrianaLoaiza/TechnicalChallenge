package co.com.choucair.startsharpproject.questions;

import co.com.choucair.startsharpproject.model.Dashboard;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;


public class DashboardLogin implements Question<String> {

    public static Question<String> tittle(){
        return new DashboardLogin();
    }

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(Dashboard.DASHBOARD_TITTLE).getText();
    }
}
