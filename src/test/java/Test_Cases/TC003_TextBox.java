package Test_Cases;

import QA.Text_Box;
import Utils.TimeOuts;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TC003_TextBox extends Text_Box{
    //Text_Box txt=new Text_Box();
    @Given("a text box page")
    public void aTextBoxPage() {
        URL_setup();
    }

    @Then("Verify each text boxes")
    public void verifyEachTextBoxes() {
        FullName.sendKeys("test"); Email.sendKeys("test@test.com");
        C_addr.sendKeys("test"); P_addr.sendKeys("test");
        new TimeOuts().implicit_wait(dr);
        submit.click();
    }

    @And("Enter the form")
    public void enterTheForm() {
        List<WebElement> Result=dr.findElements(By.tagName("p"));
        for(WebElement result:Result){
            System.out.println(result.getText());
        }
        dr.close();
    }
}
