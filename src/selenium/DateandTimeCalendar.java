package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DateandTimeCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome driver", "C:\\Users\\Anil reddy\\Downloads\\chromedriver-win32\\chromedriver .exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver =new ChromeDriver(options);

		driver.get("https://demoqa.com/date-picker");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("dateAndTimePickerInput")).click();
		String exp_year="2024";
		String exp_month="November";
		String exp_day="5";
		String exp_time="06:15";
		while(true) {
			String cur_month_year=driver.findElement(By.xpath("//*[contains(@class,\"current-mont\")]")).getText();
			String[] cur_month_year_arr=cur_month_year.split(" ");
			String cur_month=cur_month_year_arr[0];
			String cur_year=cur_month_year_arr[1];
			
			if (exp_year.equals(cur_year) && exp_month.equals(cur_month)) {
				break;
			}
			
			driver.findElement(By.xpath("//button[text()=\"Next Month\"]")).click();
		
		}
         List<WebElement> day_li=driver.findElements(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/span[2]"));
		
		for(WebElement day:day_li) {
			if (day.getText().equals(exp_day)) {
				day.click();
				break;
			}
			List<WebElement> times_li=driver.findElements(By.xpath("//ul[contains(@class,\"time-list\")]//li"));
			
			for(WebElement time:times_li) {
				
				if(time.getText().equals(exp_time)) {
					time.click();
					break;
				}
			}
		}

	}

}
