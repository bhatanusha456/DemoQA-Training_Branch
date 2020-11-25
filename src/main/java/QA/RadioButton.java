package QA;

import Config.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButton extends Base {
    String Radio_URL="https://demoqa.com/radio-button";
    WebElement Radiobutton1=dr.findElement(By.id("yesRadio"));
    WebElement Radiobutton2=dr.findElement(By.id("impressiveRadio"));
    WebElement Radiobutton3=dr.findElement(By.id("noRadio"));
    String Text_msg=dr.findElement(By.className("mt-3")).getText();
}
