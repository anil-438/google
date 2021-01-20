import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class debug_code {




    public static void main(String[] args) throws InterruptedException {
        //code for setting crome executor file path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anil\\Downloads\\demo_sele\\demo\\src\\main\\resources\\chromedriver.exe");
        // Initiate a ChromeDriver class.
        WebDriver chr=new ChromeDriver();
        //Maximize the browser
        chr.manage().window().maximize();
        // open Website
        chr.navigate().to("https://www.youtube.com/");
        //add test by using xpath
       chr.findElement(By.xpath("//input[@id='search']")).sendKeys("java tutorial");
       //click on button by using xpath
        chr.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
        Thread.sleep(1000);
        chr.findElement(By.xpath("//yt-formatted-string[contains(text(),'Sign in')]")).click();
        Thread.sleep(1000);
       chr.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("kancharla1990");
        Thread.sleep(1000);
       chr.findElement(By.xpath("//span[contains(text(),'Create account')]")).click();
        Thread.sleep(1000);
      chr.findElement(By.xpath("//div[contains(text(),'For myself')]")).click();
        Thread.sleep(1000);
      chr.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Anu");
        Thread.sleep(1000);
      chr.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Radha");
      Thread.sleep(1000);
      chr.findElement(By.xpath("//input[@id='username']")).sendKeys("Anukradha9516@gmail.com");
      Thread.sleep(1000);
      chr.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("11421anu");
      Thread.sleep(1000);
      chr.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("11421anu");
      Thread.sleep(1000);
      chr.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).click();
      Thread.sleep(1000);
      chr.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]/div[2]")).click();
    }

}

