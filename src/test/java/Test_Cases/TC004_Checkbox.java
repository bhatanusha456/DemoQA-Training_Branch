package Test_Cases;

import QA.CheckBox;
import Utils.TimeOuts;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class TC004_Checkbox extends CheckBox {
    @Given("a checkbox page")
    public void aCheckboxPage() {
        Checkbox_setup();
    }

    @Then("Verify if checkbox is enabled")
    public void verifyIfCheckboxIsEnabled() {

    }

    @Then("verify and list all the selection")
    public void verifyAndListAllTheSelection() {

    }

    @And("Check the expand and collapse")
    public void checkTheExpandAndCollapse() {

    }
}
