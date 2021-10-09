package stepDef;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {

    public WebDriver driver;

    @Given("^landing on the Demo QA Homepage$")
    public void landing_on_the_demo_qa_homepage()  {
        System.setProperty("webdriver.chrome.driver", "src/test/resources//chromedriver");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
    }

    @When("^\"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", and \"([^\"]*)\" is submitted$")
    public void something_something_something_and_something_is_submitted(String strArg1, String strArg2, String strArg3, String strArg4) throws Throwable {
        throw new PendingException();
    }

    @Then("^it will be displayed in order in the below textbox$")
    public void it_will_be_displayed_in_order_in_the_below_textbox() throws Throwable {
        throw new PendingException();
    }

    @And("^the elements tab is selected$")
    public void the_elements_tab_is_selected() throws Throwable {
        throw new PendingException();
    }
}
