import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Google_search {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\anil\\Downloads\\demo_sele\\demo\\src\\main\\resources\\chromedriver.exe");
        WebDriver chrome = new ChromeDriver();
        chrome.navigate().to("https://www.google.com");
        chrome.manage().window().maximize();
        chrome.findElement(By.xpath("//body/div[@id='viewport']/div[@id='searchform']/form[@id='tsf']/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("kancharla anil kumar");
        Thread.sleep(1000);
        chrome.findElement(By.xpath("//body/div[@id='viewport']/div[@id='searchform']/form[@id='tsf']/div[2]/div[1]/div[2]/div[2]/div[2]/center[1]/input[1]")).click();
        Thread.sleep(1000);
        chrome.findElement(By.xpath("//body/div[@id='main']/div[@id='cnt']/div[@id='rcnt']/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/h3[1]")).click();

    }
}
