package co.com.choucair.startsharpproject.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target USER_FIELD = Target.the("User").locatedBy("//input[@id='StartSharp_Membership_LoginPanel0_Username']");
    public static final Target PASSWORD_FIELD = Target.the("Password").locatedBy("//input[@id='StartSharp_Membership_LoginPanel0_Password']");
    public static final Target SIGN_IN_BUTTON = Target.the("Sign in button").locatedBy("//button[@id='StartSharp_Membership_LoginPanel0_LoginButton']");
}
