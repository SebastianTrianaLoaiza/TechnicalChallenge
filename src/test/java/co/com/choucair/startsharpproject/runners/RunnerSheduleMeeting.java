package co.com.choucair.startsharpproject.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/shedule_meeting.feature",
        tags = "@CreateNewMeeting",
        glue = "co.com.choucair.startsharpproject.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class RunnerSheduleMeeting {
}