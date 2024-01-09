package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class calendarDemo{

	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome driver", "C:\\Users\\Anil reddy\\Downloads\\chromedriver-win32\\chromedriver .exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver =new ChromeDriver(options);
        driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
				String year="2024";
				String month="January";
				String Day="22";
				driver.findElement(By.xpath("//input[@id='datepicker']")).click();
				String Mnth=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
				String yr=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
				
//	    		while(true)
//				{
//					String Mnth=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
//					String yr=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
//					if(yr.equals(year) && Mnth.equals(month))
//					{
//						
//						break;
//					}
//			
//					driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();
//			}
//				List<WebElement> alldates=driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//td"));
//				for(WebElement dt:alldates) {
//					if(dt.getText().equals(Day)) {
//						dt.click();
//						break;
//					}
//				}
	}
}

		
