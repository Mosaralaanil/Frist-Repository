package selenium;

import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Normalcalander {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome driver", "C:\\Users\\Anil reddy\\Downloads\\chromedriver-win32\\chromedriver .exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver =new ChromeDriver(options);
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
        Date d1=new Date();
		String a=d1.toString();
		String[] b=a.split(" "); 
		System.out.println(b);
		String c_year=b[5];
		String c_month=b[1];
		String e_month="Aug";
		String e_year="2025";
		String e_day="25";
		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
while(true) {
			
			if(c_month.contains(e_month) && e_year.equals(c_year)) {
				
				break;
				
			}
		
			else {
				driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();
				c_month=driver.findElement(By.xpath("//span[contains(@class,\"datepicker-month\")]")).getText();
				c_year=driver.findElement(By.xpath("//span[contains(@class,\"datepicker-year\")]")).getText();
			}			
}
              List<WebElement> dates=driver.findElements(By.xpath("//*[@class=\"ui-datepicker-calendar\"]//td"));
              for(WebElement day:dates) {
      			if (day.getText().equals(e_day)) {
      				day.click();
      			     break;
      			}
              }
	}

}
