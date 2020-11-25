package QA;

import Config.Base;
import Utils.TimeOuts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckBox extends Base {
    protected WebDriver dr;
    void Base(){
        dr=dr;
        PageFactory.initElements(dr,CheckBox.class);
    }
    public final String checkbox_URL = "https://demoqa.com/checkbox";
    @FindBy(css = ".rct-icon-uncheck") @CacheLookup WebElement Home_checkbox;
    @FindBy(css = ".rct-icon-expand-all > path") @CacheLookup WebElement Expand;
    @FindBy(how = How.CSS,using = ".rct-icon-collapse-all > path") @CacheLookup WebElement Collapse;
    @FindBy(how = How.XPATH,using = "svg[@class='rct-icon rct-icon-uncheck']")
    protected List<WebElement> checkbox_li;


    protected void Checkbox_setup() {
        dr.navigate().to(checkbox_URL);
        new TimeOuts().implicit_wait(dr);
    }
}
