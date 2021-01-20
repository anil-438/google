import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youTubeMaheshVideos {

        public static void main(String[] args) throws InterruptedException {
            // System Property for Chrome Driver
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\anil\\Downloads\\demo_sele\\demo\\src\\main\\resources\\chromedriver.exe");
            // Instantiate a ChromeDriver class.
            WebDriver chr=new ChromeDriver();
            // Launch Website
            chr.navigate().to("https://www.youtube.com/");
            //Maximize the browser
            chr.manage().window().maximize();
            // Click on the Search button
            chr.findElement(By.xpath("//input[@id='search']")).sendKeys("java tutorial");
            chr.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
            Thread.sleep(1000);
            chr.findElement(By.xpath("//yt-formatted-string[contains(text(),'Sign in')]")).click();
            Thread.sleep(1000);
            chr.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("kancharla1990");
            Thread.sleep(1000);
            chr.findElement(By.xpath("//span[contains(text(),'Create account')]")).click();
            Thread.sleep(1000);
            chr.findElement(By.xpath("//div[contains(text(),'For myself')]")).click();
            //Scroll down the webpage by 5000 pixels
         //   JavascriptExecutor js = (JavascriptExecutor)chr;
          //  js.executeScript("scrollBy(0, 5000)");
        }

    }
