import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {

    public static void main(String[] args) {
        // Set system Property for Chrome Driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anil\\Downloads\\demo_sele\\demo\\src\\main\\resources\\chromedriver.exe");
        // Initiate a ChromeDriver class.
        WebDriver driver=new ChromeDriver();
        // Launch/open Website
        driver.navigate().to("http://www.javatpoint.com/");
        //Maximize the browser
        driver.manage().window().maximize();
        //Scroll down the webpage by 5000 pixels
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("scrollBy(0, 5000)");
        // Click on the Search button
        driver.findElement(By.linkText("Core Java")).click();

    }

}