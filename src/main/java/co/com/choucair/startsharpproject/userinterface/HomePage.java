package co.com.choucair.startsharpproject.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static By MEETING_CREATED = By.cssSelector(".grid-canvas-left.grid-canvas-top > div:nth-of-type(1) > .l1");
    public static By DASHBOARD_TITLE = By.xpath("//h1[contains(.,'Dashboard')]");

    // Sidebar organization section
    public static final Target SIDEBAR_ORGANIZATION_OPTION = Target.the("Organization").locatedBy("//span[normalize-space()='Organization']");
    public static final Target SIDEBAR_BUSINESS_UNITS_OPTION = Target.the("Business Units").locatedBy("//span[normalize-space()='Business Units']");
    public static final Target NEW_BUSINESS_UNITS_BUTTON = Target.the("New Business Unit Button").locatedBy("div[class='tool-button add-button icon-tool-button'] span[class='button-inner']");
    public static final Target NEW_BUSINESS_NAME_FIELD = Target.the("New Business Unit name").locatedBy("//input[contains(@id,'Name')]");
    public static final Target BUSINESS_UNIT_FINDER = Target.the("Business unit finder").locatedBy("//input[@class='s-Serenity-QuickSearchInput s-QuickSearchInput']");
    public static final Target PARENT_UNIT_TEXTSEARCH = Target.the("Parent Unit").locatedBy("//input[contains(@id,'search')]");
    public static final Target SAVE_UNIT_BUTTON = Target.the("Save Business Unit Button").locatedBy(".save-and-close-button");
    public static By BUSINESS_UNITS_RESULT = By.xpath("(//div[contains(@class,'slick-cell l1 r1')])[1]");

    // Sidebar Meeting section
    public static final Target SIDEBAR_MEETING_OPTION = Target.the("Meeting").locatedBy("//span[normalize-space()='Meeting']");
    public static final Target MEETING_OPTION_LIST = Target.the("Meeting Option List").locatedBy("//span[normalize-space()='Meetings']");
    public static final Target NEW_MEETING_BUTTON = Target.the("New Meeting Button").locatedBy("//*[@id=\"GridDiv\"]/div[2]/div[2]/div/div/div[1]");

    // New meeting form
    public static final Target MEETING_NAME_FIELD = Target.the("Meeting name").locatedBy("//input[@name='MeetingName']");
    public static final Target MEETING_TYPE_FIELD = Target.the("Meeting type").locatedBy("(//span[contains(@class,'select2-arrow')])[6]");
    public static final Target MEETING_TYPE_INPUT = Target.the("Meeting type input text").locatedBy("//body[1]/div[6]/div[1]/input[1]");
    public static final Target MEETING_NUMBER_FIELD = Target.the("Meeting number").locatedBy("#Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber");
    public static final Target MEETING_STARTDATE_FIELD = Target.the("Meeting start date").locatedBy("#Serenity_Pro_Meeting_MeetingDialog10_StartDate");
    public static final Target MEETING_STARTHOUR_FIELD = Target.the("Meeting start hour").locatedBy("(//select[@class='editor s-DateTimeEditor time'])[1]");
    public static final Target MEETING_ENDDATE_FIELD = Target.the("Meeting end date").locatedBy("//input[@id='Serenity_Pro_Meeting_MeetingDialog10_EndDate']");
    public static final Target MEETING_ENDHOUR_FIELD = Target.the("Meeting end hour").locatedBy("//select[@class='editor s-DateTimeEditor time']");
    public static final Target MEETING_LOCATION_OPTIONS = Target.the("Meeting location list").locatedBy("//span[contains(@id,'select2-chosen-7')]");
    public static final Target MEETING_LOCATION_FIELD = Target.the("Meeting location").locatedBy("#s2id_autogen7_search");
    public static final Target MEETING_UNIT_OPTIONS = Target.the("Meeting unit list").locatedBy("(//span[@class='select2-arrow'])[8]");
    public static final Target MEETING_UNIT_FIELD = Target.the("Meeting unit").locatedBy("#s2id_autogen8_search");
    public static final Target MEETING_ORGANIZEDBY_OPTIONS = Target.the("Meeting organizer list").locatedBy(".OrganizerContactId .select2-chosen");
    public static final Target MEETING_ORGANIZEDBY_FIELD = Target.the("Meeting organizer").locatedBy("#s2id_autogen9_search");
    public static final Target MEETING_REPORTER_OPTIONS = Target.the("Meeting reporter list").locatedBy("(//span[@class='select2-arrow'])[10]");
    public static final Target MEETING_REPORTER_FIELD = Target.the("Meeting reporter").locatedBy("#s2id_autogen10_search");
    public static final Target MEETING_ATTENDEE_OPTIONS = Target.the("Meeting attendee list").locatedBy("//span[@class='select2-chosen'][contains(.,'--select contact to add--')]");
    public static final Target MEETING_ATTENDEE_FIELD = Target.the("Meeting attendee").locatedBy("#s2id_autogen12_search");
    public static final Target MEETING_SAVE_BUTTON = Target.the("Meeting save button").locatedBy("//div[@class='tool-button save-and-close-button icon-tool-button']");
    public static final Target MEETING_FINDER = Target.the("Meeting finder").locatedBy("//input[@class='s-Serenity-QuickSearchInput s-QuickSearchInput']");
}
