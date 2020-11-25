package Test_Cases;

import Config.ReadProperty;
import QA.Broken_Links_Images;
import QA.Elements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class TC002_Elements_Page{
Elements ele=new Elements();
    ReadProperty read=new ReadProperty();
    @Given("Verify the page title and text")
    public void verifyThePageTitleAndText() {
        ele.URL_setUp();
        if(read.PAGE_TITLE.equalsIgnoreCase("Toolsqa")){
            System.out.println("Page title : PASS");
        }
        if(!(ele.dr.getPageSource().equalsIgnoreCase("Please select an item from left to start practice."))){
            System.out.println("Header text not matching");
        }
    }

    @Then("Verify the menu list")
    public void verifyTheMenuList() {
        System.out.println(ele.Element_grp.size());
        System.out.println(ele.Element_list.size());
    }

    @And("Verify for broken links")
    public void verifyForBrokenLinks() throws IOException {
        Broken_Links_Images b=new Broken_Links_Images();
        b.Broken_Link_image(ele.list);
        b.Broken_Link_image(ele.img);
    }
}
