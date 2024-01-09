package selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class fluentwait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome driver", "C:\\Users\\Anil reddy\\Downloads\\chromedriver-win32\\chromedriver .exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver =new ChromeDriver(options);
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.manage().window().maximize();
         
         FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
           .withTimeout(Duration.ofSeconds(30))
           .pollingEvery(Duration.ofSeconds(5)) 
           .ignoring(NoSuchElementException.class);
           
      //  driver.findElement(By.xpath("//a[text()=\"Alert with OK \"])")).click();
         WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=\"Alert with OK \"]")));
         element.click();
         driver.findElement(By.xpath("//button[@onclick=\"alertbox()\"]")).click();
         Alert alt =wait.until(ExpectedConditions.alertIsPresent());
         Thread.sleep(2000);
         alt.accept();
	}

}
