package Utils;

import Config.Base;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Screenshot_Capture extends Base {
    void screen_capture() throws IOException {
        TakesScreenshot ss = (TakesScreenshot) dr;
        File src = ss.getScreenshotAs(OutputType.FILE);
        File dest = new File("E:\\Automation\\Demoqa_framework\\ScreenShot\\SS.png");
        FileUtils.copyFile(src, dest);
    }
}
