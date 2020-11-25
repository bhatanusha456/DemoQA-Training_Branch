package QA;

import Config.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Diff_Buttons extends Base {
    Actions action = new Actions(dr);
    String Button_URL="https://demoqa.com/buttons";
    WebElement ClickMe=dr.findElement(By.id("mmfiA"));
    WebElement Context_click=dr.findElement(By.id("rightClickBtn"));
    WebElement Double_click=dr.findElement(By.id("doubleClickBtn"));
    void RightClick(WebElement Context_click){
        action.contextClick(Context_click);
    }

    void DoubleClick(WebElement Double_click){
        action.doubleClick();
    }

}
