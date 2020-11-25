package QA;

import Config.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Text_Box extends Base {
    protected WebDriver dr=setUp();
    final String TextBoxURL="https://demoqa.com/text-box";
    protected WebElement FullName,Email,C_addr,P_addr,submit;
    protected void URL_setup(){
         dr.navigate().to(TextBoxURL);
         dr.manage().window().fullscreen();
         FullName= dr.findElement(By.id("userName"));
         Email=dr.findElement(By.id("userEmail"));
         C_addr=dr.findElement(By.id("currentAddress"));
         P_addr=dr.findElement(By.id("permanentAddress"));
         submit=dr.findElement(By.xpath("//button[@id='submit']"));

    }

}
