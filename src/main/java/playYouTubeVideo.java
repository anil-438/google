import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class playYouTubeVideo {
protected static WebDriver driver;
public void setDriver(WebDriver driver){
    playYouTubeVideo.driver  = driver;}
public static String url="https://youtube.com/";
public static void executeJavaScript(String xPath){
    JavascriptExecutor js = (JavascriptExecutor)driver;
    WebElement element =driver.findElement(By.xpath(xPath));
    js.executeScript("arguments[0].click();",element);
}

    public static void main(String[] args) {

    }
}
