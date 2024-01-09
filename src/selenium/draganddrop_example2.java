package selenium;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class draganddrop_example2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome driver", "C:\\Users\\Anil reddy\\Downloads\\chromedriver-win32\\chromedriver .exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver =new ChromeDriver(options);
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		WebElement element = driver.findElement(By.xpath("//span[text()=\"right click me\"]"));
		List<WebElement> ul = driver.findElements(By.xpath("//li[contains(@class,'context-menu-item context-menu-icon')]"));
	//	for(int i=0;i<ul.size();i++)
	//	{
	//		Actions act = new Actions(driver);
	//		act.contextClick(element).build().perform();
	//		ul.get(i).click();
	//		Thread.sleep(2000);
	//	   driver.switchTo().alert().accept();
	//	}
		for(WebElement Li:ul)
		{
			Actions act = new Actions(driver);
				act.contextClick(element).build().perform();
				Li.click();
				Thread.sleep(2000);
				System.out.println(driver.switchTo().alert().getText());
			    driver.switchTo().alert().accept();
		}	
		//driver.quit();
		System.out.println("Osperation Completed...!");

	}
	//tagname[contains(@attribute,"attribute value")]

}
	


