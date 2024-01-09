package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Cssselectorlocater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi every one");
		System.setProperty("webdriver.chrome driver", "C:\\Users\\Anil reddy\\Downloads\\chromedriver-win32\\chromedriver .exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver =new ChromeDriver(options);
        driver.get("https://www.facebook.com/login/");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("mosarlaanil16355@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Anil@16355");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.id("identify_email")).sendKeys("mosarlaanil16355@gmail.com");
		driver.findElement(By.partialLinkText("Forgotten account?")).click();
		driver.findElement(By.tagName("input")).sendKeys("type");
		driver.findElement(By.cssSelector("input#email")).sendKeys("anil16355");
		driver.findElement(By.cssSelector("input[placeholder=\"Email address or phone number\"]")).sendKeys("anil123");
		driver.findElement(By.cssSelector("input.inputtext[placeholder=\"Email address or phone number\"]")).sendKeys("anil355");
		driver.close();
		driver.quit();
	}

}