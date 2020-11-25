package Utils;

import Config.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import Config.Base;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TimeOuts {
   public final void implicit_wait(WebDriver dr){
        dr.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
    }

    void FluentWait(WebElement ele,WebDriver dr) {
        Wait wait=new FluentWait(dr).withTimeout(Duration.ofSeconds(8))
                .pollingEvery(Duration.ofSeconds(3)).ignoring(Exception.class);
    }
    void Explicit_wait(WebElement ele,WebDriver dr){
        WebElement wait=new WebDriverWait(dr, 5).until(ExpectedConditions.visibilityOf(ele));
    }
}
