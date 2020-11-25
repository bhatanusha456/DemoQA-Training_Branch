package QA;
import Config.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Form_Practice extends Base{
    String Practice_form="https://demoqa.com/automation-practice-form";
    WebElement FirstName=dr.findElement(By.id("firstName"));
    WebElement LastName=dr.findElement(By.id("lastName"));
    WebElement EmailAddr=dr.findElement(By.id("userEmail"));
    WebElement Phno=dr.findElement(By.id("userNumber"));
    WebElement DOB=dr.findElement(By.id("dateOfBirthInput"));
    WebElement Subjects=dr.findElement(By.id("subjectsContainer"));
    WebElement CurrentAddr=dr.findElement(By.id("currentAddress"));
    WebElement state=dr.findElement(By.id("state"));
    WebElement city=dr.findElement(By.id("city"));
    WebElement Upload_pic=dr.findElement(By.id("uploadPicture"));
    WebElement Checkboxes=dr.findElement(By.id("hobbies-checkbox-1"));
    WebElement Radio_button=dr.findElement(By.id("gender-radio-1"));
    WebElement Submit_button=dr.findElement(By.id("submit"));

}
