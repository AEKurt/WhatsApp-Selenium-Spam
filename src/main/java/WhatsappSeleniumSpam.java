/**
 * Created by AEkurt on 5/29/2016.
 * www.aekurt.com
 * https://github.com/aekurt
 * Spam for WhatsApp Web
 * ********************
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class WhatsappSeleniumSpam {

    public static final String WHATSAPP_LINK = "https://web.whatsapp.com/";

    //Selenium Driver Location
    public static final String DRIVER_LOCATION = "C:\\selenium-2.53.0\\chromedriver.exe";
    public static final String DRIVER_NAME = "webdriver.chrome.driver";
    //Display Name Of Contact
    public static final String PERSON_NAME ="";
    //Spam Message
    public static final String MESSAGE = "Hacked";
    public static final int SPAM_COUNT = 150;


    public static void main(String[] args) {
        System.setProperty(DRIVER_NAME, DRIVER_LOCATION);
        WebDriver driver = new ChromeDriver();

        driver.get(WHATSAPP_LINK);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.cssSelector("span[title='"+PERSON_NAME+"']")).click();

        List<WebElement> list = driver.findElements(By.className("input"));

       for(int i=0;i<=SPAM_COUNT;i++){
           WebElement selectedElement = list.get(1);
           selectedElement.sendKeys(MESSAGE);

           WebElement buttonElement = driver.findElement(By.cssSelector("button[class='icon btn-icon icon-send send-container']"));
           buttonElement.click();
       }

    }

}
