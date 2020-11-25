package Config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base extends ReadProperty{
    public WebDriver dr;
    public final  WebDriver setUp() {
        if (BROWSER.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            dr = new ChromeDriver();
            dr.get(URL);
        }
        return dr;
    }

}
