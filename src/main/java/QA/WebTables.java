package QA;

import Config.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebTables extends Base {
    String WebTab_URL="https://demoqa.com/webtables";
    WebElement AddRecord=dr.findElement(By.id("addNewRecordButton"));
    WebElement SearchBox=dr.findElement(By.id("searchBox"));
    WebElement Searchbutton=dr.findElement(By.id("basic-addon2"));
    WebElement Table=dr.findElement(By.className("rt-table"));
    WebElement Select_no_rows=dr.findElement(By.tagName("select"));
    WebElement previous=dr.findElement(By.className("-btn"));
    WebElement next=dr.findElement(By.className("-next"));
    WebElement Registration_form=dr.findElement(By.id("registration-form-modal"));
    WebElement userform=dr.findElement(By.id("userForm"));
}
