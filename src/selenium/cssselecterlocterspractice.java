package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class cssselecterlocterspractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome driver", "C:\\Users\\Anil reddy\\Downloads\\chromedriver-win32\\chromedriver .exe");
		        ChromeOptions options=new ChromeOptions();
		        options.addArguments("--remote-allow-origins=*");
		        WebDriver driver =new ChromeDriver(options);
		       driver.get("https://www.facebook.com/login/");
		     // driver.get("https://www.netflix.com/in/");
		        driver.manage().window().maximize();
		        driver.findElement(By.id("email")).sendKeys("mosarlaanil6355@gmail.com");
		        driver.findElement(By.name("pass")).sendKeys("Anil@16355");
		        driver.findElement(By.name("login")).click();
		        driver.findElement(By.linkText("Forgotten password?")).click();
		        driver.findElement(By.partialLinkText("Forgotten account?")).click();
		        driver.findElement(By.tagName("input")).sendKeys("type");
		        driver.findElement(By.cssSelector("input#email")).sendKeys("anil16355");
		        driver.findElement(By.cssSelector("input[placeholder=\"Email address or phone number\"]")).sendKeys("anil123");
		        driver.findElement(By.cssSelector("input.inputtext[placeholder=\"Email address or phone number\"]")).sendKeys("anil355");
		        driver.get("https://www.netflix.com/in/");
		        driver.findElement(By.cssSelector("label.placeLabel")).sendKeys("anil16355");
		        Thread.sleep(2000);
		        //driver.navigate().to("https://www.netflix.com/in/");
		        //driver.navigate().back();
		      //Thread.sleep(2000);
		      //driver.navigate().forward();
		      //Thread.sleep(2000);
		      //driver.navigate().refresh();
		      //driver.close();
		      //driver.quit();


		        
	}

}
