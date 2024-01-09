package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Actionspractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi every one");
		System.setProperty("webdriver.chrome driver", "C:\\Users\\Anil reddy\\Downloads\\chromedriver-win32\\chromedriver .exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver =new ChromeDriver(options);
   //   driver.get("https://www.browserstack.com/guide/action-class-in-selenium");// move to element
        //   driver.manage().window().maximize();
        //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        //     WebElement element = driver.findElement(By.xpath("//*[@id=\"products-dd-toggle\"]"));
        //     Actions acs = new Actions(driver);
        //     acs.moveToElement(element).build().perform();
           
       //        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");//double clicked
       //        driver.manage().window().maximize();
       //        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
       //        driver.switchTo().frame("iframeResult");
       //        WebElement Copytext = driver.findElement(By.xpath("//html/body/button"));
               
       //        Actions act = new Actions(driver);     
       //        act.doubleClick(Copytext).build().perform();
               
       //        driver.findElement(By.xpath("//*[@id=\"field1\"]")).clear();
               
        //       WebElement Field1 = driver.findElement(By.xpath("//*[@id=\"field1\"]"));
        //       Field1.sendKeys("Hello anil");
        //       WebElement Field2 = driver.findElement(By.xpath("/html/body/button"));
        //      act.doubleClick(Copytext).build().perform();
               
                
                 driver.get("https://www.selenium.dev/downloads/");//context methed
                 driver.manage().window().maximize();
                 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
                 WebElement element = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
                 Actions acm = new Actions(driver);
                 acm.contextClick(element).build().perform();
           
	}

}
