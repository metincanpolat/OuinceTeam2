package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _01_LoginSteps {
    DialogContent dc=new DialogContent();

    @Given("Naviagate to Campus")
    public void naviagateToCampus() {

        GWD.getDriver().get("https://campus.techno.study/");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Enter username and password and click Login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {


        dc.findAndSend("username", "username");
        dc.findAndSend("password", "password");
        dc.findAndClick("loginButton");
    }

    @Then("User should login successfuly")
    public void userShouldLoginSuccessfuly() {
        dc.findAndContainsText("txtTechnoStudy","Techno Study");
        dc.findAndClick("acceptCookies");
    }



}
