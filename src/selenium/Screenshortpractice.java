package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class Screenshortpractice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome driver", "C:\\Users\\Anil reddy\\Downloads\\chromedriver-win32\\chromedriver .exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver =new ChromeDriver(options);
        driver.get("https://www.netflix.com/in/");
	      driver.manage().window().maximize();
//	     	with takescreenshot interface(total page)
//	            TakesScreenshot ts1 = (TakesScreenshot) driver;
//	      		File src1= ts1.getScreenshotAs(OutputType.FILE);
//	      		File tar1=new File("C:\\Users\\Anil reddy\\OneDrive\\Pictures\\Screenshots\\src1.png");  //we need to change name of file at every time
//	      		Files.copy(src1, tar1);
	      
	    //without screenshot interface
			WebElement featuredproducts = driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div/div/div[1]/div[1]/div[2]/div[1]/h1"));
			File src = featuredproducts.getScreenshotAs(OutputType.FILE);
			File trg = new File("C:\\Users\\Anil reddy\\OneDrive\\Pictures\\Screenshots\\src2.png");
			Files.copy(src, trg);
	

	}

}
