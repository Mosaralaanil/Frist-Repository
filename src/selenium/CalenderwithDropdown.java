package selenium;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CalenderwithDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome driver", "C:\\Users\\Anil reddy\\Downloads\\chromedriver-win32\\chromedriver .exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver =new ChromeDriver(options);
        driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.findElement(By.xpath("//*[@id=\"datepicker2\"]")).click();
				
				WebElement el_year=driver.findElement(By.xpath("(//select[@class=\"datepick-month-year\"])[2]"));
				Select se_year=new Select(el_year);
				se_year.selectByIndex(3); 
				WebElement el_month=driver.findElement(By.xpath("//*[contains(@title,\"the month\")]"));
				Select se_month=new Select(el_month);
				se_month.selectByIndex(5);
	         	List<WebElement> li=driver.findElements(By.xpath("//*[@class=\"datepick-month\"]//table//td"));
				for (WebElement day:li) {
					if (day.getText().equals("23")) {
					day.click();
					break;	
			}
		}		
	}
					
}
	
