package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practiice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome driver", "C:\\Users\\Anil reddy\\Downloads\\chromedriver-win32\\chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver =new ChromeDriver(options);
        driver.get("https://magento.softwaretestingboard.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//input[@id=\"firstname\"]")).sendKeys("anil");
        driver.findElement(By.xpath("//input[@id=\"lastname\"]")).sendKeys("anil reddy");
        driver.findElement(By.xpath("//input[@id=\"email_address\"]")).sendKeys("mosarlaanil1008@gmail.com");
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Anil@12345");
        driver.findElement(By.xpath("//input[@id=\"password-confirmation\"]")).sendKeys("Anil@12345");
        driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button/span")).click();
        

        String Em = "mosarlaanil1008@gmail.com";
		String email = driver.findElement(By.xpath("(//div[@class=\"box-content\"])[1]")).getText();
		if (email.contains(Em)) {
			System.out.println("it matched");
		} else {
			System.out.println("it not matched");
		}
}
}

