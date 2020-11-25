package QA;

import Config.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Dynamic_Elements extends Base {
    WebElement Enable=dr.findElement(By.xpath("//input[@id='enableAfter']"));
    WebElement Color_change=dr.findElement(By.xpath("//input[@id='colorChange']"));
    WebElement Visible_SECS=dr.findElement(By.xpath("//input[@id='visibleAfter']"));

}
