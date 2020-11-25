package QA;
import Config.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Base {
       public WebDriver dr=setUp();
    public  List<WebElement> links;
   public  List<WebElement> images;
    public  String Page_title;
        // public WebElement ELEMENT=dr.findElement(By.xpath("xpath=//div[@id='app']/div/div/div[2]/div/div[2]/div/div[3]/h5"));
       //  public WebElement FORM=dr.findElement(By.xpath("//h5[contains(.,'Forms')]"));
         public static String Ele_URL="https://demoqa.com/elements"; public String Ele_Form="https://demoqa.com/forms";
        public final void CAll_URL(){
            dr.navigate().to(Ele_URL);
             links=dr.findElements(By.tagName("a"));
             images=dr.findElements(By.tagName("img"));
             Page_title=PAGE_TITLE;
        }
}


