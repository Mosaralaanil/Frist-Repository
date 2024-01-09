package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitsconcpet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome driver", "C:\\Users\\Anil reddy\\Downloads\\chromedriver-win32\\chromedriver .exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver =new ChromeDriver(options);
        //driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //  driver.manage().window().maximize();
         //  Thread.sleep(2000);// it will waits the browser till how much time we have mentioned in the arguments
         // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
          
          //IMPLCIT WAIT
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
           Thread.sleep(2000);
           driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
           driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
           driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
      //EXPLICIT WAIT
        //declaring explicit wait      
       WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
      //  mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']"))).click(); 
      //  mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']"))).click(); 
      //  mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type='submit']"))).click(); 
      //  mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p"))).click();
        
        
        // 2) for alertpresent() ----> it will for frame availablity then it shift to another frame
//        driver.get("https://demo.automationtesting.in/Alerts.html");
//        driver.manage().window().maximize();
//        driver.findElement(By.xpath("//a[text()=\"Alert with OK \"]")).click();
//        driver.findElement(By.xpath("//button[@onclick=\"alertbox()\"]")).click()0
//  	   mywait.until(ExpectedConditions.alertIsPresent());	
//  	   Alert alt =driver.switchTo().alert();
//  	   alt.accept();
//  	   driver.close();
       // 3) for freameToBaAvaliableAndSwitchToIt() ----> It will wait for  frame availability them it shift to another frame
       driver.get("https://the-internet.herokuapp.com/nested_frames");
       driver.manage().window().maximize();
      
    //   mywait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("frame-bottom"));
       // identify element inside frame
    //   String frame=driver.findElement(By.cssSelector("body")).getText();
    //   System.out.println("name of the frame is: " + frame);
 	
       // elementToClickable()-----> it will wait to click the element for those are visible enabled
       driver.get("https://omayo.blogspot.com/");
       driver.manage().window().maximize();
       driver.findElement(By.xpath("//button[@class=\"dropbtn\"]")).click();
       mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()=\"Facebook\"]"))).click();
	}

}
