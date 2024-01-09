package selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Window_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome driver", "C:\\Users\\Anil reddy\\Downloads\\chromedriver-win32\\chromedriver .exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver =new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()=\"✕\"]")).click();
		WebElement Search =driver.findElement(By.xpath("//input[@name=\"q\"]"));
		Search.sendKeys("iphone 13");
		Search.submit();
		driver.findElement(By.xpath("//div[text()=\"APPLE iPhone 13 (Pink, 128 GB)\"]")).click();
		driver.findElement(By.xpath("//div[text()=\"APPLE iPhone 13 (Blue, 128 GB)\"]")).click();
		
		String second_tab_title = "iPhone 13 ( 128 GB GB Storage, Blue) Online at Best Price On Flipkart.com";
		Set<String> windowIds=driver.getWindowHandles();
//		//APPROACH--1
//		
//		for(String winId:windowIds) {
//			String title=driver.switchTo().window(winId).getTitle();
//			if(second_tab_title.equals(title)) {
//				String Msg =driver.findElement(By.xpath("//span[text()=\"APPLE iPhone 13 (Blue, 128 GB)\"]")).getText();
//				System.out.println(Msg);
//			}
//			
//		}
		//APPROACH---2 
				//CONVERTING SET TO LIST TO ITERATION
				
				List<String> win_id_list=new ArrayList(windowIds);
				String parentWindowID=win_id_list.get(0);
				String childWindowID=win_id_list.get(1);
				driver.switchTo().window(childWindowID);
				driver.findElement(By.xpath("//*[@id=\"swatch-1-storage\"]/a")).click();
				driver.switchTo().window(parentWindowID).findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[6]/div/div/a/span")).click();
			
				//CLOSING A PARTICULAR TAB
				for(String close_Window:windowIds) {
					String titles=driver.switchTo().window(close_Window).getTitle();
//					if( title.equals("x") || title.equals("y") || title.equals("z")){}
					if(second_tab_title.equals(titles)) {
						driver.close();
					}

			}
	}
}
	

