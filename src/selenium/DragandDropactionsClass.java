package selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class DragandDropactionsClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome driver", "C:\\Users\\Anil reddy\\Downloads\\chromedriver-win32\\chromedriver .exe");
		ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver =new ChromeDriver(options);
        driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		Actions acs = new Actions(driver);
		
		WebElement Dragelement = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement Dropelement = driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
        acs.dragAndDrop(Dragelement,Dropelement).build().perform();
        
        WebElement Dragelement1 = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
        WebElement Dropelement1 = driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
        acs.dragAndDrop(Dragelement1,Dropelement1).build().perform();
        
        WebElement Dragelement2 = driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
        WebElement Dropelement2 = driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
        acs.dragAndDrop(Dragelement2,Dropelement2).build().perform();
        
        WebElement Dragelement3 = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
        WebElement Dropelement3 = driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
        acs.dragAndDrop(Dragelement3,Dropelement3).build().perform();
        
      
	            TakesScreenshot ts1 = (TakesScreenshot) driver;
	      		File src= ts1.getScreenshotAs(OutputType.FILE);
	      		File tar=new File("C:\\Users\\Anil reddy\\OneDrive\\Pictures\\Screenshots\\src.png");
	      		Files.copy(src, tar);
	}
	}

