package selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome driver", "C:\\Users\\Anil reddy\\Downloads\\chromedriver-win32\\chromedriver .exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver =new ChromeDriver(options);
      
     //   1> visibilityOfElementLocated()  
        
    //     driver.get("https://www.facebook.com/login/");
    //      driver.manage().window().maximize();
    //      WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
    //     mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"email\"]"))).sendKeys("mosarlaanil6355@gmail.com");
    //     mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"pass\"]"))).sendKeys("Anil@16355");
    //     mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"loginbutton\"]"))).click(); 
          
           // 2) for alertpresent()
        
   //       driver.get("https://demo.automationtesting.in/Alerts.html");
   //         driver.manage().window().maximize();
   //         WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
   //         driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
   //         driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
  //        mywait.until(ExpectedConditions.alertIsPresent());	
  //	        Alert alt =driver.switchTo().alert();
 // 	        alt.accept();
 //    	     driver.close();
        
        // 3> for freameToBaAvaliableAndSwitchToIt()
        
 //       driver.get("https://the-internet.herokuapp.com/nested_frames");
 //       driver.manage().window().maximize();
  //      WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
  //      mywait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("frame-bottom"));
  //      String frame=driver.findElement(By.cssSelector("body")).getText();
  //      System.out.println("name of the frame is: " + frame);
        
        // 4>  elementToClickable()
        driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.findElement(By.xpath("//button[@class=\"dropbtn\"]")).click();
   //     mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Facebook']"))).click();
        mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Flipkart']"))).click();
          
	}

}
