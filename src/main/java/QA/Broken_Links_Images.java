package QA;

import Config.Base;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

public class Broken_Links_Images extends Base {
   public void Broken_Link_image(List<WebElement> li_link) throws IOException {
       for(WebElement link:li_link){
           check(link.getAttribute("href"));
       }
    }

    private void check(String link) {
        HttpURLConnection http= null;
        try {
            http = (HttpURLConnection)new URL(link).openConnection();
            if(http.getResponseCode()!=200 ||http.getResponseCode()!=400){
                 System.out.println(link+": Broken:"+http.getResponseMessage());
            } else {
                System.out.println(link+":"+http.getResponseCode());
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
