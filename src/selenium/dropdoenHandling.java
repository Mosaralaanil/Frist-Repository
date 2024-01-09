package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class dropdoenHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome driver", "C:\\Users\\Anil reddy\\Downloads\\chromedriver-win32\\chromedriver .exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver =new ChromeDriver(options);
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
	    Thread.sleep(2000);
	    WebElement course=driver.findElement(By.xpath("//*[@id=\"course\"]"));
	    Select sc=new Select(course);
	    sc.selectByIndex(1);
	    Thread.sleep(2000);
	    sc.selectByValue("net");
	    sc.selectByIndex(3);
	    Thread.sleep(2000);
	    sc.selectByValue("js");
//	    WebElement ide=driver.findElement(By.xpath("//*[@id=\"ide\"]"));
//	    Select sc=new Select(ide);
//	    sc.selectByValue("vs");
//	    Thread.sleep(2000);
//	    sc.selectByIndex(3);
//	    Thread.sleep(2000);
//	    sc.selectByIndex(0);
//	    Thread.sleep(2000);
//	    sc.selectByValue("ij");
	}

}
