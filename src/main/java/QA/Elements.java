package QA;

import Config.Base;
import org.jsoup.nodes.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Elements extends Base{
    public WebDriver dr=setUp();
    final String Ele_URL = "https://demoqa.com/elements";
        public  List<WebElement> Element_grp;
         public  List<WebElement> Element_list;
         public  List<WebElement> list;
         public  List<WebElement> img;

     public void URL_setUp(){
         dr.navigate().to(Ele_URL);
         list=dr.findElements(By.tagName("a"));
         img=dr.findElements(By.tagName("img"));
          Element_grp=dr.findElements(By.className("element-group"));
          Element_list=dr.findElements(By.tagName("li"));
     }
}
