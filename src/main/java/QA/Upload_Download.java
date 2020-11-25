package QA;

import Config.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;

public class Upload_Download extends Base {
    String Upload_download_URL="dynamicLink";
    WebElement download=dr.findElement(By.id("downloadButton"));
    WebElement upload=dr.findElement(By.id("uploadFile"));
    void upload(File file){
        upload.sendKeys(file.getAbsolutePath());
    }
}
