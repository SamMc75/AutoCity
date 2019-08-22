package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import pages.Home;

public class HomeSteps extends Step {
    @Autowired
    Home home;

    @Given("^I open citypizza\\.ru$")
    public void shouldOpenMainPage() throws Throwable {
        home.open();
    }

    @When("^I click on City button$")
    public void shouldClickOnCityButton() throws Throwable {
        home.clickCityButton().click();
    }

    @And("^I select category \"(.*?)\"$")
    public void shouldSelectCategory(String cat) throws Throwable {
        home.getCategory(cat).click();
    }
}
