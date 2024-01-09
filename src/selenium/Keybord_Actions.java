package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Keybord_Actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome driver", "C:\\Users\\Anil reddy\\Downloads\\chromedriver-win32\\chromedriver .exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver =new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");
        //FULL NAME
       driver.findElement(By.xpath("//input[@id=\"userName\"]")).sendKeys("Anil",Keys.TAB,"mosarlaanil16355@gmail.com",Keys.TAB,"Medak");
       Actions ack = new Actions(driver);
       //CTRL+A
       ack.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
       //CTRL+C
       ack.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).build().perform();
       
       ack.sendKeys(Keys.TAB);
       //CTRL+V
       ack.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
       //SUBMIT BUTTON
       driver.findElement(By.xpath("//button[text()=\"submit\"]")).click();
	}

}
