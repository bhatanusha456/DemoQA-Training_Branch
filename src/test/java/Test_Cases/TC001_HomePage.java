package Test_Cases;

import Config.Base;
import QA.Broken_Links_Images;
import QA.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.net.MalformedURLException;

public class TC001_HomePage{
    HomePage homePage=new HomePage();
    Broken_Links_Images b=new Broken_Links_Images();
    @Given("a web app")
    public void aWebApp() {
    }

    @Then("Verify the page title")
    public void verifyThePageTitle() {
        if(homePage.Page_title.equalsIgnoreCase(homePage.dr.getTitle())){
           System.out.println("Page Title :PASS");
        } else {
            System.out.println("FAIL:"+homePage.dr.getTitle());
        }
    }

    @And("Verify the broken links and images")
    public void verifyTheBrokenLinksAndImages() throws MalformedURLException {
        try {
            b.Broken_Link_image(homePage.images);
            b.Broken_Link_image(homePage.links);
        } catch (IOException e) {
            e.printStackTrace();
        }
        homePage.dr.close();
    }
}
