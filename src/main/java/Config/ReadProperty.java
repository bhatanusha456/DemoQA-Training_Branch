package Config;

import java.io.*;
import java.util.Properties;

public class ReadProperty {
    Properties prop=new Properties();
    public final String URL;
    public final String BROWSER;
    public final String PAGE_TITLE;
    File file= new File("E:\\Automation\\Demoqa_framework\\src\\main\\resources\\config.properties");
    public ReadProperty(){
        try {
            InputStream input = new FileInputStream(file);
            prop.load(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        URL= prop.getProperty("URL");
        BROWSER= prop.getProperty("Browser");
        PAGE_TITLE=prop.getProperty("Page_title");
    }
}
