package QA;

import Config.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Diff_Links extends Base {
    String Diff_Links="https://demoqa.com/links";
    List<WebElement> links=dr.findElements(By.tagName("a"));
    WebElement link_response=dr.findElement(By.cssSelector("p#linkresponse"));
    WebElement Home=dr.findElement(By.id("simpleLink"));
    WebElement HomeoRCPy=dr.findElement(By.xpath("//a[@id='dynamicLink']"));
    void open_newTab(){
        String win1_handle=dr.getWindowHandle();
        Set<String> win_handles=dr.getWindowHandles();
        for(String winhandle:win_handles){
            dr.switchTo().window(win1_handle);
            String url=dr.getCurrentUrl();
            System.out.println(url);
        }
    }
}
