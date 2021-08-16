package co.com.choucair.reto.stepdefinitions;

import co.com.choucair.reto.model.UTestData;
import co.com.choucair.reto.questions.Answer;
import co.com.choucair.reto.tasks.Openup;
import co.com.choucair.reto.tasks.UForm;
import co.com.choucair.reto.tasks.UJoin;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;

public class UTestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than andrea wants to create a user in UTest and enters the registration form$")
    public void thanAndreaWantsToCreateAUserInUTestAndEntersTheRegistrationForm() {
        OnStage.theActorCalled("Andrea").wasAbleTo(Openup.thePage(),(UJoin.onThePage()));

    }

    @When("^she completes the registration form in its entirety$")
    public void sheCompletesTheRegistrationFormInItsEntirety(List<UTestData> uTestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(UForm.the(uTestData.get(0).getStrFName(),
                        uTestData.get(0).getStrLName(),uTestData.get(0).getStrEmail(),
                        uTestData.get(0).getStrMonth(),uTestData.get(0).getStrDay(),uTestData.get(0).getStrYear(),
                        uTestData.get(0).getStrPassword(),uTestData.get(0).getStrConfPassword()));
    }

    @Then("^she creates her user on the UTest page$")
    public void sheCreatesHerUserOnTheUTestPage(List<UTestData> uTestData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(uTestData.get(0).getStrTextFinal())));
    }

}
